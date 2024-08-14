import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.logging.Logger;

public class Visitor extends LangBaseVisitor {
    private Dictionary<String, Object> variables = new Hashtable<>();

    public static void main(String[] args) throws Exception {
        CharStream test = CharStreams.fromFileName("inputs/climbing-setup.rock");
        LangLexer lexer = new LangLexer(test);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);
        ParseTree tree = parser.file();
        Visitor visitor = new Visitor();

        try {
            Object val = visitor.visit(tree);
        } catch (Exception e) {
            System.out.println(e);
        }


        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("All good!");
        } else {
            System.out.println("Something broke!");
        }
    }

    @Override
    public Object visitRef_val(LangParser.Ref_valContext ctx) {
        LinkedList<String> refChain = new LinkedList<String>();
        LangParser.RefContext ref = ctx.ref();

        while (ref != null) {
            refChain.add(ref.ID().toString());
            ref = ref.ref();
        }

        Object obj = variables.get(refChain.remove());

        while (obj != null) {
            ClimbingObject climbingObject = (ClimbingObject) obj;
            obj = climbingObject.attributes.get(refChain.remove());
        }

        // TODO: check if this works.

        return obj;
    }

    @Override
    public Object visitFactor(LangParser.FactorContext ctx) {
        if (ctx.math_expr() != null) {
            return visitMath_expr(ctx.math_expr());
        } else if (ctx.NUM() != null) {
            return Double.parseDouble(ctx.NUM().toString());
        } else if (ctx.LENGTH() != null) {
            return new Length(ctx.LENGTH().toString());
        } else if (ctx.ref_val() != null) {
            return visitRef_val(ctx.ref_val());
        }

        return null;
    }

    @Override
    public Object visitTerm(LangParser.TermContext ctx) {
        LinkedList<Object> factorList = new LinkedList<>();
        LinkedList<String> opList = new LinkedList<>();
        LangParser.FactorsContext factors = ctx.factors();
        factorList.add(visitFactor(ctx.factor()));

        while (factors.factor() != null) {
            factorList.add(visitFactor(factors.factor()));
            String op = factors.children.get(0).toString();
            opList.add(op);
            factors = factors.factors();
        }

        int lengthIndex = -1;

        for (int i = 0; i < factorList.size(); i++) {
            if (factorList.get(i) instanceof Length) {
                if (lengthIndex == -1) {
                    lengthIndex = i;
                } else {
                    // TODO: throw error, trying to multiply lengths
                    return null;
                }
            }
        }

        if (lengthIndex > 0 && opList.get(lengthIndex - 1).equals("/")) {
            // TODO: throw error, trying to divide by length.
            return null;
        }

        if (lengthIndex != -1) {
            // Swap factors to have the length in front
            Length length = (Length) factorList.get(lengthIndex);
            factorList.set(lengthIndex, factorList.get(0));
            factorList.set(0, length);

            for (int i = 1; i < factorList.size(); i++) {
                double factor = (double) factorList.get(i);
                if (opList.get(i - 1).equals("/")) factor = 1 / factor;
                length.multiplyBy(factor);
            }

            return length;
        } else {
            double total = (double) factorList.get(0);

            for (int i = 1; i < factorList.size(); i++) {
                double factor = (double) factorList.get(i);
                if (opList.get(i - 1).equals("/")) factor = 1 / factor;
                total *= factor;
            }

            return total;
        }
    }


    @Override
    public Object visitMath_expr(LangParser.Math_exprContext ctx) {
        LinkedList<Object> termList = new LinkedList<>();
        LinkedList<String> opList = new LinkedList<>();
        LangParser.TermsContext terms = ctx.terms();
        termList.add(visitTerm(ctx.term()));

        while (terms.term() != null) {
            termList.add(visitTerm(terms.term()));
            String op = terms.children.get(0).toString();
            opList.add(op);
            terms = terms.terms();
        }

        if (termList.get(0) instanceof Length) {
            Length total = (Length) termList.get(0);

            for (int i = 1; i < termList.size(); i++) {
                if (!(termList.get(i) instanceof Length)) {
                    // TODO: throw error, addition must be homogenous
                    return null;
                }
            }

            for (int i = 1; i < termList.size(); i++) {
                total.addBy((Length) termList.get(i));
            }

            return total;
        } else if (termList.get(0) instanceof Double) {
            double total = (double) termList.get(0);

            for (int i = 1; i < termList.size(); i++) {
                if (!(termList.get(i) instanceof Double)) {
                    // TODO: throw error, addition must be homogenous
                    return null;
                }
            }

            for (int i = 1; i < termList.size(); i++) {
                total += (double) termList.get(i);
            }

            return total;
        }

        // TODO: throw error if not length or double
        return null;
    }
}

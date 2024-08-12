import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class Visitor extends LangBaseVisitor {
    private Dictionary<String, Object> variables = new Hashtable<>();

    public static void main(String[] args) throws Exception {
        CharStream test = CharStreams.fromFileName("inputs/climbing-setup.rock");
        LangLexer lexer = new LangLexer(test);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);
        ParseTree tree = parser.file();
        Visitor visitor = new Visitor();
        Object val = visitor.visit(tree);

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
            return ctx.math_expr(); // TODO: Unclear if this makes sense
        } else if (ctx.NUM() != null) {
            return Double.parseDouble(ctx.NUM().toString());
        } else if (ctx.LENGTH() != null) {
            return new Length(ctx.LENGTH().toString());
        } else if (ctx.ref_val() != null) {
            return ctx.ref_val(); // TODO: same as math_expr...
        }

        return super.visitFactor(ctx);
    }

    @Override
    public Object visitFactors(LangParser.FactorsContext ctx) throws Exception {
        if (ctx.children != null) {
            Object firstFactor = visitFactor(ctx.factor());
            Object secondFactor = visitFactors(ctx.factors());
            String op = ctx.children.get(0).toString();

            if (firstFactor instanceof Double) {
                double k = (double) firstFactor;
                if (secondFactor instanceof Double) {
                    if (op.equals("*")) {
                        return k * ((double) secondFactor);
                    } else if (op.equals("/")) {
                        return k / ((double) secondFactor);
                    }
                } else if (secondFactor instanceof Length) {
                    double factor = op.equals("/") ? 1 / k : k;
                    return ((Length) secondFactor).multiplyBy(factor);
                }
            } else if (firstFactor instanceof Length) {
                if (secondFactor instanceof Double) {
                    double k = (double) secondFactor;
                    double factor = op.equals("/") ? 1 / k : k;
                    return ((Length) firstFactor).multiplyBy(factor);
                }
            }
        }

        throw new Exception("Invalid multiplication.");
    }
}

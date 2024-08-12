import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Visitor extends LangBaseVisitor {
    private Dictionary<String, Object> variables = new Hashtable<>();

    public static void main(String[] args) throws Exception {
        CharStream test = CharStreams.fromFileName("Lang/inputs/climbing-setup.rock");
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
    public Object visitDeclaration(LangParser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx);
    }

    @Override
    public Object visitFactor(LangParser.FactorContext ctx) {
        /*System.out.println("Visiting factor");
        System.out.println(ctx.NUM());
        System.out.println(ctx.id());
        System.out.println(ctx.LENGTH());*/
        return super.visitFactor(ctx);
    }

    @Override
    public Object visitFile(LangParser.FileContext ctx) {
        return super.visitFile(ctx);
    }

    @Override
    public Object visitFunc_def(LangParser.Func_defContext ctx) {
        return super.visitFunc_def(ctx);
    }
}

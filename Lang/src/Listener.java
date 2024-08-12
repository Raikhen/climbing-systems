import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends LangBaseListener {
    public static void main(String[] args) throws Exception {
        CharStream test = CharStreams.fromFileName("inputs/climbing-setup.rock");
        LangLexer lexer = new LangLexer(test);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);
        Listener listener = new Listener();
        parser.addParseListener(listener);
        parser.file();

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("All good!");
        } else {
            System.out.println("Something broke!");
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void exitFile(LangParser.FileContext ctx) {
        System.out.println("Exiting file!");
        System.out.println(ctx.children.toString());
        super.exitFile(ctx);
    }

    @Override
    public void exitFunc_def(LangParser.Func_defContext ctx) {
        System.out.println("Hi!");
        System.out.println(ctx.children.toString());
        super.exitFunc_def(ctx);
    }
}
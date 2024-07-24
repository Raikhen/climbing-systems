import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream test = CharStreams.fromFileName("inputs/climbing-setup.rock");
        LangLexer lexer = new LangLexer(test);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);
        parser.file();

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("All good!");
        } else {
            System.out.println("Something broke!");
        }
    }
}
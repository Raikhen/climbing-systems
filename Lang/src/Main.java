import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        CharStream test = CharStreams.fromString("thisismytest");
        LangLexer lexer = new LangLexer(test);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LangParser parser = new LangParser(tokens);
        parser.test();

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("All good!");
        } else {
            System.out.println("Something broke!");
        }
    }
}
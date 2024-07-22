// Generated from /Users/dylanfridman/climbing-systems/Lang/Lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(LangParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(LangParser.TestContext ctx);
}
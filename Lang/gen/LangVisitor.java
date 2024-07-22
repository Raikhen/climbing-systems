// Generated from /Users/dylanfridman/climbing-systems/Lang/Lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(LangParser.TestContext ctx);
}
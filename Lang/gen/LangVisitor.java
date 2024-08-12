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
	 * Visit a parse tree produced by {@link LangParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(LangParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(LangParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(LangParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#mixed_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixed_param_list(LangParser.Mixed_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#named_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_param_list(LangParser.Named_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#def_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_param_list(LangParser.Def_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(LangParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_list(LangParser.Attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#attribute_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_pair(LangParser.Attribute_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LangParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(LangParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expr_seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_seq(LangParser.Expr_seqContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(LangParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LangParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#grade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrade(LangParser.GradeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants(LangParser.ConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#knots}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnots(LangParser.KnotsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(LangParser.Math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(LangParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(LangParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#factors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactors(LangParser.FactorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(LangParser.FactorContext ctx);
}
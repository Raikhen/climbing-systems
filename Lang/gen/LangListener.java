// Generated from /Users/dylanfridman/climbing-systems/Lang/Lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(LangParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(LangParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(LangParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(LangParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(LangParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(LangParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#named_param_list}.
	 * @param ctx the parse tree
	 */
	void enterNamed_param_list(LangParser.Named_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#named_param_list}.
	 * @param ctx the parse tree
	 */
	void exitNamed_param_list(LangParser.Named_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(LangParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(LangParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(LangParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(LangParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#attribute_pair}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_pair(LangParser.Attribute_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#attribute_pair}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_pair(LangParser.Attribute_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(LangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(LangParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expr_seq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_seq(LangParser.Expr_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expr_seq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_seq(LangParser.Expr_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(LangParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(LangParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#grade}.
	 * @param ctx the parse tree
	 */
	void enterGrade(LangParser.GradeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#grade}.
	 * @param ctx the parse tree
	 */
	void exitGrade(LangParser.GradeContext ctx);
}
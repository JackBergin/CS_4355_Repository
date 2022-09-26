// Generated from WPL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WPLParser}.
 */
public interface WPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WPLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WPLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WPLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#typeAssign}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssign(WPLParser.TypeAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#typeAssign}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssign(WPLParser.TypeAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(WPLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(WPLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WPLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WPLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(WPLParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(WPLParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#printf}.
	 * @param ctx the parse tree
	 */
	void enterPrintf(WPLParser.PrintfContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#printf}.
	 * @param ctx the parse tree
	 */
	void exitPrintf(WPLParser.PrintfContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(WPLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(WPLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(WPLParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(WPLParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(WPLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(WPLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WPLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WPLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(WPLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(WPLParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(WPLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(WPLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link WPLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(WPLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WPLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(WPLParser.TypeContext ctx);
}
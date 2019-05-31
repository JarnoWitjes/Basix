// Generated from /Users/jarnowitjes/stack/HBO-ICT/Compilers_and_OS/Basix/src/nl/saxion/cos/basix/grammar/BasixGrammar.g4 by ANTLR 4.7.2
package nl.saxion.cos.basix.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BasixGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BasixGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BasixGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BasixGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasixGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BasixGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasixGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BasixGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DEFVAR}
	 * labeled alternative in {@link BasixGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDEFVAR(BasixGrammarParser.DEFVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RDEFVAR}
	 * labeled alternative in {@link BasixGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRDEFVAR(BasixGrammarParser.RDEFVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GETVAR}
	 * labeled alternative in {@link BasixGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGETVAR(BasixGrammarParser.GETVARContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasixGrammarParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(BasixGrammarParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasixGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BasixGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasixGrammarParser#loopwhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopwhen(BasixGrammarParser.LoopwhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasixGrammarParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(BasixGrammarParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasixGrammarParser#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(BasixGrammarParser.Math_exprContext ctx);
}
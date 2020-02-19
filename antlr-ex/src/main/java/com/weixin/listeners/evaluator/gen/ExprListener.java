// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/listeners/Expr.g4 by ANTLR 4.8
package com.weixin.listeners.evaluator.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(ExprParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(ExprParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(ExprParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(ExprParser.EContext ctx);
}
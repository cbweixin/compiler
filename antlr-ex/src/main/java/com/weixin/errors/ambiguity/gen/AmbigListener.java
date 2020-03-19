// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/errors/ambiguity/Ambig.g4 by ANTLR 4.8
package com.weixin.errors.ambiguity.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AmbigParser}.
 */
public interface AmbigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AmbigParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(AmbigParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmbigParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(AmbigParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmbigParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AmbigParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmbigParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AmbigParser.ExprContext ctx);
}
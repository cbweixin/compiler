// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/errors/pred/Pred.g4 by ANTLR 4.8
package com.weixin.errors.pred.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PredParser}.
 */
public interface PredListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PredParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PredParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PredParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PredParser.AssignContext ctx);
}
// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/errors/vecmsg/VecMsg.g4 by ANTLR 4.8
package com.weixin.errors.vecmsg.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VecMsgParser}.
 */
public interface VecMsgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VecMsgParser#vec4}.
	 * @param ctx the parse tree
	 */
	void enterVec4(VecMsgParser.Vec4Context ctx);
	/**
	 * Exit a parse tree produced by {@link VecMsgParser#vec4}.
	 * @param ctx the parse tree
	 */
	void exitVec4(VecMsgParser.Vec4Context ctx);
	/**
	 * Enter a parse tree produced by {@link VecMsgParser#ints}.
	 * @param ctx the parse tree
	 */
	void enterInts(VecMsgParser.IntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VecMsgParser#ints}.
	 * @param ctx the parse tree
	 */
	void exitInts(VecMsgParser.IntsContext ctx);
}
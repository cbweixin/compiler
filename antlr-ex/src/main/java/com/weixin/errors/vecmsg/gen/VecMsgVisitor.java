// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/errors/vecmsg/VecMsg.g4 by ANTLR 4.8
package com.weixin.errors.vecmsg.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VecMsgParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VecMsgVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VecMsgParser#vec4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVec4(VecMsgParser.Vec4Context ctx);
	/**
	 * Visit a parse tree produced by {@link VecMsgParser#ints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInts(VecMsgParser.IntsContext ctx);
}
// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/actions/calc/Expr.g4 by ANTLR 4.8
package com.weixin.actions.tools;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(ExprParser.EContext ctx);
}
// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/actions/keywords/Keywords.g4 by ANTLR 4.8
package com.weixin.actions.keywords.gen;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link KeywordsVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class KeywordsBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements KeywordsVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStat(KeywordsParser.StatContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpr(KeywordsParser.ExprContext ctx) { return visitChildren(ctx); }
}
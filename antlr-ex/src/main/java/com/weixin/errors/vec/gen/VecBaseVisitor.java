// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/errors/vec/Vec.g4 by ANTLR 4.8
package com.weixin.errors.vec.gen;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link VecVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class VecBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements VecVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVec4(VecParser.Vec4Context ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInts(VecParser.IntsContext ctx) { return visitChildren(ctx); }
}
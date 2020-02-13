// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/resources/Dates.g4 by ANTLR 4.8
package com.weixin.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DatesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DatesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DatesParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(DatesParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatesParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(DatesParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatesParser#daterange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaterange(DatesParser.DaterangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatesParser#singledate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingledate(DatesParser.SingledateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatesParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(DatesParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatesParser#divider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivider(DatesParser.DividerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatesParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(DatesParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatesParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(DatesParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatesParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(DatesParser.MonthContext ctx);
}
// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/resources/Dates.g4 by ANTLR 4.8
package com.weixin.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatesParser}.
 */
public interface DatesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatesParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(DatesParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatesParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(DatesParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatesParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(DatesParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatesParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(DatesParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatesParser#daterange}.
	 * @param ctx the parse tree
	 */
	void enterDaterange(DatesParser.DaterangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatesParser#daterange}.
	 * @param ctx the parse tree
	 */
	void exitDaterange(DatesParser.DaterangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatesParser#singledate}.
	 * @param ctx the parse tree
	 */
	void enterSingledate(DatesParser.SingledateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatesParser#singledate}.
	 * @param ctx the parse tree
	 */
	void exitSingledate(DatesParser.SingledateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatesParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(DatesParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatesParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(DatesParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatesParser#divider}.
	 * @param ctx the parse tree
	 */
	void enterDivider(DatesParser.DividerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatesParser#divider}.
	 * @param ctx the parse tree
	 */
	void exitDivider(DatesParser.DividerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatesParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(DatesParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatesParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(DatesParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatesParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(DatesParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatesParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(DatesParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatesParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(DatesParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatesParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(DatesParser.MonthContext ctx);
}
// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/PANTS.g4 by ANTLR 4.8
package com.weixin.pants.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PANTSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PANTSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PANTSParser#pants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPants(PANTSParser.PantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(PANTSParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PANTSParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#var_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declare(PANTSParser.Var_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#java_lib_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_lib_stmt(PANTSParser.Java_lib_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#jar_lib_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_lib_stmt(PANTSParser.Jar_lib_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#jvm_lib_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJvm_lib_stmt(PANTSParser.Jvm_lib_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#lib_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLib_item_list(PANTSParser.Lib_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#lib_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLib_item(PANTSParser.Lib_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#jars_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJars_item_list(PANTSParser.Jars_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#jars_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJars_item(PANTSParser.Jars_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#jar_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_list(PANTSParser.Jar_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#jar_entries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_entries(PANTSParser.Jar_entriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#jar_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_entry(PANTSParser.Jar_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#java_jar_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_jar_entry(PANTSParser.Java_jar_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#scala_jar_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScala_jar_entry(PANTSParser.Scala_jar_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#jar_coordinates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_coordinates(PANTSParser.Jar_coordinatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#jar_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_coordinate(PANTSParser.Jar_coordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#excludes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcludes_list(PANTSParser.Excludes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#exclude_entries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_entries(PANTSParser.Exclude_entriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#exclude_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_entry(PANTSParser.Exclude_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#exclude_coordinates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_coordinates(PANTSParser.Exclude_coordinatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_coordinate(PANTSParser.Exclude_coordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#name_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_item(PANTSParser.Name_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#dependencies_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependencies_item(PANTSParser.Dependencies_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#dependent_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_list(PANTSParser.Dependent_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#dependent_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_entry(PANTSParser.Dependent_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#sources_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSources_item(PANTSParser.Sources_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#main_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_item(PANTSParser.Main_itemContext ctx);
}
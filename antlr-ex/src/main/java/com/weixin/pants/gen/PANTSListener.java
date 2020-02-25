// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/PANTS.g4 by ANTLR 4.8
package com.weixin.pants.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PANTSParser}.
 */
public interface PANTSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PANTSParser#pants}.
	 * @param ctx the parse tree
	 */
	void enterPants(PANTSParser.PantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#pants}.
	 * @param ctx the parse tree
	 */
	void exitPants(PANTSParser.PantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(PANTSParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(PANTSParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PANTSParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PANTSParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#var_declare}.
	 * @param ctx the parse tree
	 */
	void enterVar_declare(PANTSParser.Var_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#var_declare}.
	 * @param ctx the parse tree
	 */
	void exitVar_declare(PANTSParser.Var_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#java_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJava_lib_stmt(PANTSParser.Java_lib_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#java_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJava_lib_stmt(PANTSParser.Java_lib_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#jar_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJar_lib_stmt(PANTSParser.Jar_lib_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#jar_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJar_lib_stmt(PANTSParser.Jar_lib_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#jvm_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJvm_lib_stmt(PANTSParser.Jvm_lib_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#jvm_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJvm_lib_stmt(PANTSParser.Jvm_lib_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#lib_item_list}.
	 * @param ctx the parse tree
	 */
	void enterLib_item_list(PANTSParser.Lib_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#lib_item_list}.
	 * @param ctx the parse tree
	 */
	void exitLib_item_list(PANTSParser.Lib_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#lib_item}.
	 * @param ctx the parse tree
	 */
	void enterLib_item(PANTSParser.Lib_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#lib_item}.
	 * @param ctx the parse tree
	 */
	void exitLib_item(PANTSParser.Lib_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#jars_item_list}.
	 * @param ctx the parse tree
	 */
	void enterJars_item_list(PANTSParser.Jars_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#jars_item_list}.
	 * @param ctx the parse tree
	 */
	void exitJars_item_list(PANTSParser.Jars_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#jars_item}.
	 * @param ctx the parse tree
	 */
	void enterJars_item(PANTSParser.Jars_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#jars_item}.
	 * @param ctx the parse tree
	 */
	void exitJars_item(PANTSParser.Jars_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#jar_list}.
	 * @param ctx the parse tree
	 */
	void enterJar_list(PANTSParser.Jar_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#jar_list}.
	 * @param ctx the parse tree
	 */
	void exitJar_list(PANTSParser.Jar_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#jar_entries}.
	 * @param ctx the parse tree
	 */
	void enterJar_entries(PANTSParser.Jar_entriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#jar_entries}.
	 * @param ctx the parse tree
	 */
	void exitJar_entries(PANTSParser.Jar_entriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#jar_entry}.
	 * @param ctx the parse tree
	 */
	void enterJar_entry(PANTSParser.Jar_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#jar_entry}.
	 * @param ctx the parse tree
	 */
	void exitJar_entry(PANTSParser.Jar_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#java_jar_entry}.
	 * @param ctx the parse tree
	 */
	void enterJava_jar_entry(PANTSParser.Java_jar_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#java_jar_entry}.
	 * @param ctx the parse tree
	 */
	void exitJava_jar_entry(PANTSParser.Java_jar_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#scala_jar_entry}.
	 * @param ctx the parse tree
	 */
	void enterScala_jar_entry(PANTSParser.Scala_jar_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#scala_jar_entry}.
	 * @param ctx the parse tree
	 */
	void exitScala_jar_entry(PANTSParser.Scala_jar_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#jar_coordinates}.
	 * @param ctx the parse tree
	 */
	void enterJar_coordinates(PANTSParser.Jar_coordinatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#jar_coordinates}.
	 * @param ctx the parse tree
	 */
	void exitJar_coordinates(PANTSParser.Jar_coordinatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterJar_coordinate(PANTSParser.Jar_coordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitJar_coordinate(PANTSParser.Jar_coordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#excludes_list}.
	 * @param ctx the parse tree
	 */
	void enterExcludes_list(PANTSParser.Excludes_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#excludes_list}.
	 * @param ctx the parse tree
	 */
	void exitExcludes_list(PANTSParser.Excludes_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#exclude_entries}.
	 * @param ctx the parse tree
	 */
	void enterExclude_entries(PANTSParser.Exclude_entriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#exclude_entries}.
	 * @param ctx the parse tree
	 */
	void exitExclude_entries(PANTSParser.Exclude_entriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#exclude_entry}.
	 * @param ctx the parse tree
	 */
	void enterExclude_entry(PANTSParser.Exclude_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#exclude_entry}.
	 * @param ctx the parse tree
	 */
	void exitExclude_entry(PANTSParser.Exclude_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#exclude_coordinates}.
	 * @param ctx the parse tree
	 */
	void enterExclude_coordinates(PANTSParser.Exclude_coordinatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#exclude_coordinates}.
	 * @param ctx the parse tree
	 */
	void exitExclude_coordinates(PANTSParser.Exclude_coordinatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterExclude_coordinate(PANTSParser.Exclude_coordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitExclude_coordinate(PANTSParser.Exclude_coordinateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#name_item}.
	 * @param ctx the parse tree
	 */
	void enterName_item(PANTSParser.Name_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#name_item}.
	 * @param ctx the parse tree
	 */
	void exitName_item(PANTSParser.Name_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#dependencies_item}.
	 * @param ctx the parse tree
	 */
	void enterDependencies_item(PANTSParser.Dependencies_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#dependencies_item}.
	 * @param ctx the parse tree
	 */
	void exitDependencies_item(PANTSParser.Dependencies_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#dependent_list}.
	 * @param ctx the parse tree
	 */
	void enterDependent_list(PANTSParser.Dependent_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#dependent_list}.
	 * @param ctx the parse tree
	 */
	void exitDependent_list(PANTSParser.Dependent_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#dependent_entry}.
	 * @param ctx the parse tree
	 */
	void enterDependent_entry(PANTSParser.Dependent_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#dependent_entry}.
	 * @param ctx the parse tree
	 */
	void exitDependent_entry(PANTSParser.Dependent_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#sources_item}.
	 * @param ctx the parse tree
	 */
	void enterSources_item(PANTSParser.Sources_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#sources_item}.
	 * @param ctx the parse tree
	 */
	void exitSources_item(PANTSParser.Sources_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#main_item}.
	 * @param ctx the parse tree
	 */
	void enterMain_item(PANTSParser.Main_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#main_item}.
	 * @param ctx the parse tree
	 */
	void exitMain_item(PANTSParser.Main_itemContext ctx);
}
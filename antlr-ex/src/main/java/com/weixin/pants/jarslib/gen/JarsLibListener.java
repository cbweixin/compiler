// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/JarsLib.g4 by ANTLR 4.8
package com.weixin.pants.jarslib.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JarsLibParser}.
 */
public interface JarsLibListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#jarslib}.
	 * @param ctx the parse tree
	 */
	void enterJarslib(JarsLibParser.JarslibContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#jarslib}.
	 * @param ctx the parse tree
	 */
	void exitJarslib(JarsLibParser.JarslibContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(JarsLibParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(JarsLibParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(JarsLibParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(JarsLibParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#var_declare}.
	 * @param ctx the parse tree
	 */
	void enterVar_declare(JarsLibParser.Var_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#var_declare}.
	 * @param ctx the parse tree
	 */
	void exitVar_declare(JarsLibParser.Var_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#jar_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJar_lib_stmt(JarsLibParser.Jar_lib_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#jar_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJar_lib_stmt(JarsLibParser.Jar_lib_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#jars_item_list}.
	 * @param ctx the parse tree
	 */
	void enterJars_item_list(JarsLibParser.Jars_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#jars_item_list}.
	 * @param ctx the parse tree
	 */
	void exitJars_item_list(JarsLibParser.Jars_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#jars_item}.
	 * @param ctx the parse tree
	 */
	void enterJars_item(JarsLibParser.Jars_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#jars_item}.
	 * @param ctx the parse tree
	 */
	void exitJars_item(JarsLibParser.Jars_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#jar_list}.
	 * @param ctx the parse tree
	 */
	void enterJar_list(JarsLibParser.Jar_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#jar_list}.
	 * @param ctx the parse tree
	 */
	void exitJar_list(JarsLibParser.Jar_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#jar_entries}.
	 * @param ctx the parse tree
	 */
	void enterJar_entries(JarsLibParser.Jar_entriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#jar_entries}.
	 * @param ctx the parse tree
	 */
	void exitJar_entries(JarsLibParser.Jar_entriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#jar_entry}.
	 * @param ctx the parse tree
	 */
	void enterJar_entry(JarsLibParser.Jar_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#jar_entry}.
	 * @param ctx the parse tree
	 */
	void exitJar_entry(JarsLibParser.Jar_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#java_jar_entry}.
	 * @param ctx the parse tree
	 */
	void enterJava_jar_entry(JarsLibParser.Java_jar_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#java_jar_entry}.
	 * @param ctx the parse tree
	 */
	void exitJava_jar_entry(JarsLibParser.Java_jar_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#scala_jar_entry}.
	 * @param ctx the parse tree
	 */
	void enterScala_jar_entry(JarsLibParser.Scala_jar_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#scala_jar_entry}.
	 * @param ctx the parse tree
	 */
	void exitScala_jar_entry(JarsLibParser.Scala_jar_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#jar_coordinates}.
	 * @param ctx the parse tree
	 */
	void enterJar_coordinates(JarsLibParser.Jar_coordinatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#jar_coordinates}.
	 * @param ctx the parse tree
	 */
	void exitJar_coordinates(JarsLibParser.Jar_coordinatesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupid}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterGroupid(JarsLibParser.GroupidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupid}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitGroupid(JarsLibParser.GroupidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code artifactid}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterArtifactid(JarsLibParser.ArtifactidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code artifactid}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitArtifactid(JarsLibParser.ArtifactidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code version}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterVersion(JarsLibParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code version}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitVersion(JarsLibParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intransitive}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterIntransitive(JarsLibParser.IntransitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intransitive}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitIntransitive(JarsLibParser.IntransitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forceable}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterForceable(JarsLibParser.ForceableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forceable}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitForceable(JarsLibParser.ForceableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclude_jars_list}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterExclude_jars_list(JarsLibParser.Exclude_jars_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclude_jars_list}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitExclude_jars_list(JarsLibParser.Exclude_jars_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#excludes_list}.
	 * @param ctx the parse tree
	 */
	void enterExcludes_list(JarsLibParser.Excludes_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#excludes_list}.
	 * @param ctx the parse tree
	 */
	void exitExcludes_list(JarsLibParser.Excludes_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#exclude_entries}.
	 * @param ctx the parse tree
	 */
	void enterExclude_entries(JarsLibParser.Exclude_entriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#exclude_entries}.
	 * @param ctx the parse tree
	 */
	void exitExclude_entries(JarsLibParser.Exclude_entriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#exclude_entry}.
	 * @param ctx the parse tree
	 */
	void enterExclude_entry(JarsLibParser.Exclude_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#exclude_entry}.
	 * @param ctx the parse tree
	 */
	void exitExclude_entry(JarsLibParser.Exclude_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#exclude_coordinates}.
	 * @param ctx the parse tree
	 */
	void enterExclude_coordinates(JarsLibParser.Exclude_coordinatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#exclude_coordinates}.
	 * @param ctx the parse tree
	 */
	void exitExclude_coordinates(JarsLibParser.Exclude_coordinatesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclude_groupid}
	 * labeled alternative in {@link JarsLibParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterExclude_groupid(JarsLibParser.Exclude_groupidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclude_groupid}
	 * labeled alternative in {@link JarsLibParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitExclude_groupid(JarsLibParser.Exclude_groupidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclude_artifactid}
	 * labeled alternative in {@link JarsLibParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterExclude_artifactid(JarsLibParser.Exclude_artifactidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclude_artifactid}
	 * labeled alternative in {@link JarsLibParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitExclude_artifactid(JarsLibParser.Exclude_artifactidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exclude_version}
	 * labeled alternative in {@link JarsLibParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 */
	void enterExclude_version(JarsLibParser.Exclude_versionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclude_version}
	 * labeled alternative in {@link JarsLibParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 */
	void exitExclude_version(JarsLibParser.Exclude_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#name_item}.
	 * @param ctx the parse tree
	 */
	void enterName_item(JarsLibParser.Name_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#name_item}.
	 * @param ctx the parse tree
	 */
	void exitName_item(JarsLibParser.Name_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#dependencies_item}.
	 * @param ctx the parse tree
	 */
	void enterDependencies_item(JarsLibParser.Dependencies_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#dependencies_item}.
	 * @param ctx the parse tree
	 */
	void exitDependencies_item(JarsLibParser.Dependencies_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#dependent_list}.
	 * @param ctx the parse tree
	 */
	void enterDependent_list(JarsLibParser.Dependent_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#dependent_list}.
	 * @param ctx the parse tree
	 */
	void exitDependent_list(JarsLibParser.Dependent_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link JarsLibParser#dependent_entry}.
	 * @param ctx the parse tree
	 */
	void enterDependent_entry(JarsLibParser.Dependent_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JarsLibParser#dependent_entry}.
	 * @param ctx the parse tree
	 */
	void exitDependent_entry(JarsLibParser.Dependent_entryContext ctx);
}
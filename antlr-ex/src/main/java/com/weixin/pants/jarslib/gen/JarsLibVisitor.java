// Generated from /Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/JarsLib.g4 by ANTLR 4.8
package com.weixin.pants.jarslib.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JarsLibParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JarsLibVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#jarslib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJarslib(JarsLibParser.JarslibContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(JarsLibParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(JarsLibParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#var_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declare(JarsLibParser.Var_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#jar_lib_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_lib_stmt(JarsLibParser.Jar_lib_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#jars_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJars_item_list(JarsLibParser.Jars_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#jars_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJars_item(JarsLibParser.Jars_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#jar_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_list(JarsLibParser.Jar_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#jar_entries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_entries(JarsLibParser.Jar_entriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#jar_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_entry(JarsLibParser.Jar_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#java_jar_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_jar_entry(JarsLibParser.Java_jar_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#scala_jar_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScala_jar_entry(JarsLibParser.Scala_jar_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#jar_coordinates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_coordinates(JarsLibParser.Jar_coordinatesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupid}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupid(JarsLibParser.GroupidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code artifactid}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArtifactid(JarsLibParser.ArtifactidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code version}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(JarsLibParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intransitive}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntransitive(JarsLibParser.IntransitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forceable}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForceable(JarsLibParser.ForceableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclude_jars_list}
	 * labeled alternative in {@link JarsLibParser#jar_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_jars_list(JarsLibParser.Exclude_jars_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#excludes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcludes_list(JarsLibParser.Excludes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#exclude_entries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_entries(JarsLibParser.Exclude_entriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#exclude_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_entry(JarsLibParser.Exclude_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#exclude_coordinates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_coordinates(JarsLibParser.Exclude_coordinatesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclude_groupid}
	 * labeled alternative in {@link JarsLibParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_groupid(JarsLibParser.Exclude_groupidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclude_artifactid}
	 * labeled alternative in {@link JarsLibParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_artifactid(JarsLibParser.Exclude_artifactidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exclude_version}
	 * labeled alternative in {@link JarsLibParser#exclude_coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_version(JarsLibParser.Exclude_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#name_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_item(JarsLibParser.Name_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#dependencies_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependencies_item(JarsLibParser.Dependencies_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#dependent_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_list(JarsLibParser.Dependent_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link JarsLibParser#dependent_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_entry(JarsLibParser.Dependent_entryContext ctx);
}
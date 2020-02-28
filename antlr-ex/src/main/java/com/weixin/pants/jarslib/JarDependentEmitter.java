package com.weixin.pants.jarslib;

import com.weixin.pants.jarslib.gen.JarsLibBaseListener;
import com.weixin.pants.jarslib.gen.JarsLibParser;
import com.weixin.pants.jarslib.gen.JarsLibParser.Dependent_entryContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Exclude_coordinateContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Exclude_entryContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Jar_coordinateContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Jar_entryContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class JarDependentEmitter extends JarsLibBaseListener {

  ParseTreeProperty<String> xml = new ParseTreeProperty<String>();
  STGroup stg = new STGroupFile(
      "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/pants/pom.stg");
  private boolean isScalaJar = false;

  String getXML(ParseTree ctx) {
    return xml.get(ctx);
  }

  void setXML(ParseTree ctx, String s) {
    xml.put(ctx, s);
  }

  @Override
  public void exitJars_item(JarsLibParser.Jars_itemContext ctx) {
    if (ctx.start.getType() == JarsLibParser.NAME) {
//      System.out.println(ctx.name_item().SINGLE_QUOTED_STRING());
    } else if (ctx.start.getType() == JarsLibParser.DEPENDENCIES) {
//      System.out.println(getXML(ctx.dependencies_item()));
    } else if(ctx.start.getType() == JarsLibParser.JARS){
//      System.out.println(getXML(ctx.jar_list()));
    }
  }

  @Override
  public void exitDependencies_item(JarsLibParser.Dependencies_itemContext ctx) {
    String depends = getXML(ctx.dependent_list());
//    System.out.println(depends);
    setXML(ctx, depends);

  }


  @Override
  public void exitDependent_list(JarsLibParser.Dependent_listContext ctx) {
    StringBuilder sb = new StringBuilder();
    for (Dependent_entryContext dctx : ctx.dependent_entry()) {
      sb.append(getXML(dctx));
      sb.append("\n");
    }
    removeLastNewLine(sb);
    setXML(ctx, sb.toString());
//    System.out.println(sb.toString());

  }


  @Override
  public void exitDependent_entry(JarsLibParser.Dependent_entryContext ctx) {
    String depend = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    setXML(ctx, depend);
//    System.out.printf(depend);
  }


  @Override
  public void exitJar_list(JarsLibParser.Jar_listContext ctx) {
    String text = getXML(ctx.jar_entries());
    setXML(ctx, text);
//    System.out.println(text);

  }

  @Override
  public void exitJar_entries(JarsLibParser.Jar_entriesContext ctx) {
    StringBuilder sb = new StringBuilder();
    for (Jar_entryContext jcxt : ctx.jar_entry()) {
      sb.append(getXML(jcxt));
    }
    setXML(ctx, sb.toString());
    System.out.println(sb.toString());
  }

  @Override
  public void exitJar_entry(JarsLibParser.Jar_entryContext ctx) {
    StringBuilder sb = new StringBuilder();
    if(ctx.start.getType() == JarsLibParser.RULE_jar_entry){
      String text = getXML(ctx.java_jar_entry());
      sb.append(text);
      sb.append("\n");
      setXML(ctx,sb.toString());
    }
    else{
      String text = getXML(ctx.scala_jar_entry());
      sb.append(text);
      sb.append("\n");
      setXML(ctx,sb.toString());
    }
  }

  @Override
  public void exitJava_jar_entry(JarsLibParser.Java_jar_entryContext ctx) {
    String text = getXML(ctx.jar_coordinates());
    setXML(ctx, text);
//    System.out.println(text);
  }

  @Override public void enterScala_jar_entry(JarsLibParser.Scala_jar_entryContext ctx) {
    isScalaJar = true;
  }

  @Override public void exitScala_jar_entry(JarsLibParser.Scala_jar_entryContext ctx) {
    String text = getXML(ctx.jar_coordinates());
    setXML(ctx, text);
//    System.out.println(text);
    isScalaJar = false;
  }

  @Override
  public void exitJar_coordinates(JarsLibParser.Jar_coordinatesContext ctx) {
    StringBuilder sb = new StringBuilder();
    for (Jar_coordinateContext coordinateContext : ctx.jar_coordinate()) {
      sb.append(getXML(coordinateContext));
      sb.append('\n');
    }
    sb = removeLastNewLine(sb);
    ST st = stg.getInstanceOf("entriesTemplate");
    st.add("tag", "dependency");
    st.add("value", sb.toString());
//    System.out.println(st.render());
    setXML(ctx, st.render());
  }

  @Override
  public void exitGroupid(JarsLibParser.GroupidContext ctx) {
    String groupId = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    ST st = stg.getInstanceOf("groupIdTemplate");
    st.add("id", groupId);
//    System.out.println(st.render());
    setXML(ctx, st.render());

  }

  @Override
  public void exitArtifactid(JarsLibParser.ArtifactidContext ctx) {
    String aId = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    ST st = stg.getInstanceOf("artifactIdTemplate");
    st.add("id", aId);
    st.add("condition", isScalaJar);
//    System.out.println(st.render());
    setXML(ctx, st.render());
  }

  @Override
  public void exitVersion(JarsLibParser.VersionContext ctx) {
    String ver = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    ST st = stg.getInstanceOf("versionTemplate");
    st.add("ver", ver);
//    System.out.println(st.render());
    setXML(ctx, st.render());
  }

  @Override
  public void exitExclude_jars_list(JarsLibParser.Exclude_jars_listContext ctx) {
    String text = getXML(ctx.excludes_list());
    ST st = stg.getInstanceOf("entriesTemplate");
    st.add("tag", "exclusions");
    st.add("value", text);
//    System.out.println(st.render());
    setXML(ctx, st.render());

  }

  @Override
  public void exitExcludes_list(JarsLibParser.Excludes_listContext ctx) {
    String text = getXML(ctx.exclude_entries());
    setXML(ctx, text);
//    System.out.println(text);

  }


  @Override
  public void exitExclude_entries(JarsLibParser.Exclude_entriesContext ctx) {
    StringBuilder sb = new StringBuilder();
    for (Exclude_entryContext ectx : ctx.exclude_entry()) {
      sb.append(getXML(ectx));
      sb.append('\n');
    }

    // remove the last added `\n`, which makes the xml format looks ugly.
    sb = removeLastNewLine(sb);
    setXML(ctx, sb.toString());
//    System.out.println(sb.toString());

  }

  @Override
  public void exitExclude_entry(JarsLibParser.Exclude_entryContext ctx) {
    String text = getXML(ctx.exclude_coordinates());
    ST st = stg.getInstanceOf("entryTemplate");
    st.add("tag", "exclusion");
    st.add("entry", text);
//    System.out.println(st.render());
    setXML(ctx, st.render());
//    System.out.println(text);
  }

  @Override
  public void exitExclude_coordinates(JarsLibParser.Exclude_coordinatesContext ctx) {
    StringBuilder sb = new StringBuilder();
    for (Exclude_coordinateContext ectx : ctx.exclude_coordinate()) {
      sb.append(getXML(ectx));
      sb.append('\n');
    }
    // remove the last added `\n`, which makes the xml format looks ugly.

    setXML(ctx, removeLastNewLine(sb).toString());
//    System.out.println(sb.toString());

  }

  @Override
  public void exitExclude_groupid(JarsLibParser.Exclude_groupidContext ctx) {
    String groupId = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    ST st = stg.getInstanceOf("groupIdTemplate");
    st.add("id", groupId);
//    System.out.println(st.render());
    setXML(ctx, st.render());

  }

  @Override
  public void enterExclude_artifactid(JarsLibParser.Exclude_artifactidContext ctx) {
    String aId = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    ST st = stg.getInstanceOf("artifactIdTemplate");
    st.add("id", aId);
    st.add("condition",isScalaJar);
//    System.out.println(st.render());
    setXML(ctx, st.render());
  }

  @Override
  public void enterExclude_version(JarsLibParser.Exclude_versionContext ctx) {
    String ver = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    ST st = stg.getInstanceOf("versionTemplate");
    st.add("ver", ver);
//    System.out.println(st.render());
    setXML(ctx, st.render());

  }

  public StringBuilder removeLastNewLine(StringBuilder sb) {
    int l = sb.length();
    sb.deleteCharAt(l - 1);
    return sb;
  }


  public String stripSingleQuotes(String s) {
    if (s == null || s.charAt(0) != '\'') {
      return s;
    }
    return s.substring(1, s.length() - 1);
  }
}

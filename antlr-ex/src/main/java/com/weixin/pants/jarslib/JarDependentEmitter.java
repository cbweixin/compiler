package com.weixin.pants.jarslib;

import com.weixin.pants.jarslib.gen.JarsLibBaseListener;
import com.weixin.pants.jarslib.gen.JarsLibParser;
import com.weixin.pants.jarslib.gen.JarsLibParser.Exclude_coordinateContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Exclude_entryContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Jar_coordinateContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Jar_entryContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class JarDependentEmitter extends JarsLibBaseListener {

  ParseTreeProperty<String> xml = new ParseTreeProperty<String>();

  String getXML(ParseTree ctx) {
    return xml.get(ctx);
  }

  void setXML(ParseTree ctx, String s) {
    xml.put(ctx, s);
  }

  @Override public void exitJar_list(JarsLibParser.Jar_listContext ctx) {
    String text = getXML(ctx.jar_entries());
    setXML(ctx,text);
    System.out.println(text);

  }

  @Override public void exitJar_entries(JarsLibParser.Jar_entriesContext ctx) {
    StringBuilder sb = new StringBuilder();
    for(Jar_entryContext jcxt: ctx.jar_entry()){
      sb.append(getXML(jcxt));
    }
    setXML(ctx,sb.toString());
//    System.out.println(sb.toString());
  }

  @Override public void exitJar_entry(JarsLibParser.Jar_entryContext ctx) {
    String text = getXML(ctx.java_jar_entry());
    setXML(ctx,text);
//    System.out.println(text);
  }

  @Override public void exitJava_jar_entry(JarsLibParser.Java_jar_entryContext ctx) {
    String text = getXML(ctx.jar_coordinates());
    setXML(ctx,text);
//    System.out.println(text);
  }

  @Override
  public void exitJar_coordinates(JarsLibParser.Jar_coordinatesContext ctx) {
    StringBuilder sb = new StringBuilder();
    for(Jar_coordinateContext coordinateContext: ctx.jar_coordinate()){
      sb.append(getXML(coordinateContext));
      sb.append('\n');
    }
    setXML(ctx,sb.toString());
//    System.out.println(sb.toString());
  }

  @Override
  public void exitGroupid(JarsLibParser.GroupidContext ctx) {
    String groupId = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
//    System.out.println(groupId);
    setXML(ctx,groupId);

  }

  @Override
  public void exitArtifactid(JarsLibParser.ArtifactidContext ctx) {
    String aId = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
//    System.out.println(aId);
    setXML(ctx,aId);
  }

  @Override
  public void exitVersion(JarsLibParser.VersionContext ctx) {
    String ver = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
//    System.out.println(ver);
    setXML(ctx,ver);
  }

  @Override public void exitExclude_jars_list(JarsLibParser.Exclude_jars_listContext ctx) {
    String text = getXML(ctx.excludes_list());
    setXML(ctx,text);
  }

  @Override public void exitExcludes_list(JarsLibParser.Excludes_listContext ctx) {
    String text = getXML(ctx.exclude_entries());
    setXML(ctx, getXML(ctx.exclude_entries()));

  }


  @Override public void exitExclude_entries(JarsLibParser.Exclude_entriesContext ctx) {
    StringBuilder sb = new StringBuilder();
    for(Exclude_entryContext ectx : ctx.exclude_entry()){
      sb.append(getXML(ectx));
      sb.append('\n');
    }

    setXML(ctx,sb.toString());
//    System.out.println(sb.toString());

  }

  @Override public void exitExclude_entry(JarsLibParser.Exclude_entryContext ctx) {
    String text = getXML(ctx.exclude_coordinates());
    setXML(ctx,text);
//    System.out.println(text);
  }

  @Override public void exitExclude_coordinates(JarsLibParser.Exclude_coordinatesContext ctx) {
    StringBuilder sb = new StringBuilder();
    for(Exclude_coordinateContext ectx : ctx.exclude_coordinate()) {
      sb.append(getXML(ectx));
      sb.append('\n');
    }

    setXML(ctx,sb.toString());
//    System.out.println(sb.toString());

  }

  @Override public void exitExclude_groupid(JarsLibParser.Exclude_groupidContext ctx) {
    String groupId = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
//    System.out.println(groupId);
    setXML(ctx,groupId);

  }

  @Override public void enterExclude_artifactid(JarsLibParser.Exclude_artifactidContext ctx) {
    String aId = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
//    System.out.println(aId);
    setXML(ctx,aId);

  }

  @Override public void enterExclude_version(JarsLibParser.Exclude_versionContext ctx) {
    String ver = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    setXML(ctx,ver);

  }


  public String stripSingleQuotes(String s) {
    if (s == null || s.charAt(0) != '\'') {
      return s;
    }
    return s.substring(1, s.length() - 1);
  }
}

package com.weixin.pants.jarslib;

import static com.weixin.pants.utils.Utils.stripSingleQuotes;

import com.weixin.pants.datastore.DependenciesMap;
import com.weixin.pants.datastore.VariablesMap;
import com.weixin.pants.jarslib.gen.JarsLibBaseListener;
import com.weixin.pants.jarslib.gen.JarsLibParser;
import com.weixin.pants.jarslib.gen.JarsLibParser.Dependent_entryContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Exclude_coordinateContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Exclude_entryContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Jar_coordinateContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Jar_entryContext;
import com.weixin.pants.jarslib.gen.JarsLibParser.Jars_itemContext;
import com.weixin.pants.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

public class JarDependentEmitter extends JarsLibBaseListener {

  ParseTreeProperty<String> xml = new ParseTreeProperty<String>();
  STGroup stg = Utils.stg;
  private boolean isScalaJar = false;

  String getXML(ParseTree ctx) {
    return xml.get(ctx);
  }

  void setXML(ParseTree ctx, String s) {
    xml.put(ctx, s);
  }

  @Override
  public void enterVar_declare(JarsLibParser.Var_declareContext ctx) {
    // I bet the varible declaration would be at very beginning. otherwise it would be too complicated
    // to parse.
    String name = ctx.IDENTIFIER().getText();
    String value = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    VariablesMap.INSTANCE.setVariable(name, value);
  }

  @Override
  public void exitJars_item_list(JarsLibParser.Jars_item_listContext ctx) {

    List<String> list = new ArrayList<>();
    String name = "";
    for (Jars_itemContext jctx : ctx.jars_item()) {
      if (jctx.start.getType() == JarsLibParser.NAME) {
        name = getXML(jctx);
        continue;
      }
      list.add(getXML(jctx));
//      System.out.println(getXML(jctx));
    }
    ST st = stg.getInstanceOf("object");
    st.add("fields", list);

    setXML(ctx, st.render());
    if (name.trim().length() > 0) {
      DependenciesMap.INSTANCE.setDependency(name, st.render());
    }
    if (DependenciesMap.INSTANCE.getDependency("aws-java-sdk-v2-sts") != null) {
      System.out.println(DependenciesMap.INSTANCE.getDependency("aws-java-sdk-v2-sts"));
    }
  }

  @Override
  public void exitJars_item(JarsLibParser.Jars_itemContext ctx) {
    if (ctx.start.getType() == JarsLibParser.NAME) {
      String name = stripSingleQuotes(ctx.name_item().SINGLE_QUOTED_STRING().getText());
      setXML(ctx, name);
    } else if (ctx.start.getType() == JarsLibParser.DEPENDENCIES) {
      setXML(ctx, getXML(ctx.dependencies_item()));
    } else if (ctx.start.getType() == JarsLibParser.JARS) {
      setXML(ctx, getXML(ctx.jar_list()));
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
    List<String> list = new ArrayList<>();
    for (Dependent_entryContext dctx : ctx.dependent_entry()) {
      list.add(getXML(dctx));
    }
    ST st = stg.getInstanceOf("object");
    st.add("fields", list);
    setXML(ctx, st.render());

  }


  @Override
  public void exitDependent_entry(JarsLibParser.Dependent_entryContext ctx) {
    String depend = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    if (depend.startsWith("3rdparty")) {
      //
      String[] pathAndName = depend.split(":");
      String path = pathAndName[0];
      String name = pathAndName.length > 1 ? pathAndName[1]
          : pathAndName[0].substring(pathAndName[0].lastIndexOf("/") + 1);
      ThirdPartyDependencyGenerator generator = new ThirdPartyDependencyGenerator();
      String entry = generator.getDependency(path, name);
      setXML(ctx, entry);
//      System.out.println(entry);
    } else {
      System.out.println("impossible");
    }
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
    List<String> list = new ArrayList<>();
    for (Jar_entryContext jcxt : ctx.jar_entry()) {
      list.add(getXML(jcxt));
    }
    ST st = stg.getInstanceOf("object");
    st.add("fields",list);
    setXML(ctx, st.render());
//    System.out.println(sb.toString());
  }

  @Override
  public void exitJar_entry(JarsLibParser.Jar_entryContext ctx) {
    ST st = stg.getInstanceOf("object");
    String text ;
    if (ctx.start.getType() == JarsLibParser.RULE_jar_entry) {
      text = getXML(ctx.java_jar_entry());
    } else {
      text = getXML(ctx.scala_jar_entry());
    }
    if(text != null){
      st.add("fields",text);
      setXML(ctx, st.render());
    }
  }

  @Override
  public void exitJava_jar_entry(JarsLibParser.Java_jar_entryContext ctx) {
    String text = getXML(ctx.jar_coordinates());
    setXML(ctx, text);
//    System.out.println(text);
  }

  @Override
  public void enterScala_jar_entry(JarsLibParser.Scala_jar_entryContext ctx) {
    isScalaJar = true;
  }

  @Override
  public void exitScala_jar_entry(JarsLibParser.Scala_jar_entryContext ctx) {
    String text = getXML(ctx.jar_coordinates());
    setXML(ctx, text);
//    System.out.println(text);
    isScalaJar = false;
  }

  @Override
  public void exitJar_coordinates(JarsLibParser.Jar_coordinatesContext ctx) {
    List<String> list  =  new ArrayList<>();
    for (Jar_coordinateContext coordinateContext : ctx.jar_coordinate()) {
      list.add(getXML(coordinateContext));
    }
    ST st = stg.getInstanceOf("itemsTemplate");
    st.add("tag", "dependency");
    st.add("fields", list);
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
    // version could be : 1.2.6 or a variable - JACKSON_REV_2_6_6
    String text = ctx.SINGLE_QUOTED_STRING() != null ? ctx.SINGLE_QUOTED_STRING().getText()
        : ctx.IDENTIFIER().getText();
    String ver = stripSingleQuotes(text);
    // for version variable,JACKSON_REV_2_6_6 , we need to get its literal value
    if (VariablesMap.INSTANCE.getVariable(ver) != null) {
      ver = VariablesMap.INSTANCE.getVariable(ver);
    }
    ST st = stg.getInstanceOf("versionTemplate");
    st.add("ver", ver);
//    System.out.println(st.render());
    setXML(ctx, st.render());
  }

  @Override
  public void exitExclude_jars_list(JarsLibParser.Exclude_jars_listContext ctx) {
    String text = getXML(ctx.excludes_list());
    ST st = stg.getInstanceOf("itemsTemplate");
    st.add("tag", "exclusions");
    st.add("fields", text);
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
    List<String> list = new ArrayList<>();
    for (Exclude_entryContext ectx : ctx.exclude_entry()) {
      list.add(getXML(ectx));
    }

    ST st = stg.getInstanceOf("itemsTemplate");
    st.add("tag", "dependency");
    st.add("fields", list);
    setXML(ctx, st.render());

  }

  @Override
  public void exitExclude_entry(JarsLibParser.Exclude_entryContext ctx) {
    String text = getXML(ctx.exclude_coordinates());
    ST st = stg.getInstanceOf("itemsTemplate");
    st.add("tag", "exclusion");
    st.add("fields", text);
//    System.out.println(st.render());
    setXML(ctx, st.render());
//    System.out.println(text);
  }

  @Override
  public void exitExclude_coordinates(JarsLibParser.Exclude_coordinatesContext ctx) {
    List<String> list = new ArrayList<>();
    for (Exclude_coordinateContext ectx : ctx.exclude_coordinate()) {
      list.add(getXML(ectx));

    }
    ST st = stg.getInstanceOf("object");
    st.add("fields",list);
    setXML(ctx, st.render());
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
    st.add("condition", isScalaJar);
//    System.out.println(st.render());
    setXML(ctx, st.render());
  }

}

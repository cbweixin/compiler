package com.weixin.pants.javalib;

import static com.weixin.pants.utils.Utils.stg;
import static com.weixin.pants.utils.Utils.stripSingleQuotes;

import com.weixin.pants.datastore.DependenciesMap;
import com.weixin.pants.jarslib.ThirdPartyDependencyGenerator;
import com.weixin.pants.javalib.gen.PANTSBaseListener;
import com.weixin.pants.javalib.gen.PANTSParser;
import com.weixin.pants.javalib.gen.PANTSParser.Dependent_entryContext;
import com.weixin.pants.javalib.gen.PANTSParser.Lib_itemContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;

public class JavaLibEmitter extends PANTSBaseListener {

  ParseTreeProperty<String> xml = new ParseTreeProperty<String>();
  public String libName = "";

  String getXML(ParseTree ctx) {
    return xml.get(ctx);
  }

  void setXML(ParseTree ctx, String s) {
    xml.put(ctx, s);
  }

  @Override public void exitLib_item_list(PANTSParser.Lib_item_listContext ctx) {
    String name = "";
    String deps = "";
    for(Lib_itemContext lctx : ctx.lib_item()){
      if(lctx.start.getType() == PANTSParser.NAME){
        name = getXML(lctx);
      }
      else if(lctx.start.getType() == PANTSParser.DEPENDENCIES){
        deps = getXML(lctx);
      }
    }
    DependenciesMap.INSTANCE.setDependency(name,deps);
  }


  @Override public void exitLib_item(PANTSParser.Lib_itemContext ctx) {
    if(ctx.start.getType() == PANTSParser.NAME){
      setXML(ctx,getXML(ctx.name_item()));
    }
    else if(ctx.start.getType() == PANTSParser.DEPENDENCIES){
     setXML(ctx,getXML(ctx.dependencies_item()));
    }


  }
  @Override public void exitName_item(PANTSParser.Name_itemContext ctx) {
    String name = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    // for each BUILD file, there would only be one java_library
    libName = name;
    setXML(ctx,name);
  }
  @Override public void exitDependencies_item(PANTSParser.Dependencies_itemContext ctx) {
    ST st = stg.getInstanceOf("itemsTemplate");
    st.add("tag", "dependencies");
    st.add("fields",getXML(ctx.dependent_list()));
    setXML(ctx, st.render());
//    System.out.println(st.render());

  }

  @Override
  public void exitDependent_list(PANTSParser.Dependent_listContext ctx) {
    List<String> l = new ArrayList<>();
    for (Dependent_entryContext dctx : ctx.dependent_entry()) {
      String text = getXML(dctx);
      l.add(text);
    }
    ST st = stg.getInstanceOf("object");
    st.add("fields", l);
    setXML(ctx, st.render());
//    System.out.println(st.render());
  }

  @Override
  public void exitDependent_entry(PANTSParser.Dependent_entryContext ctx) {
    String entry = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    String[] items = entry.split(":");
    if (items[0].startsWith("3rdparty")) {
      ThirdPartyDependencyGenerator generator = new ThirdPartyDependencyGenerator();
      String text = generator.getDependency(items[0], items[1]);
      if (text != null) {
        setXML(ctx, text);
      }
    } else {
      String[] modules = items[0].split("/");
      String[] groups = Arrays.copyOfRange(modules, 0, modules.length - 1);
      String groupId = Arrays.stream(groups).collect(Collectors.joining("."));
      String aId = modules[modules.length - 1];
      ST st = stg.getInstanceOf("coordinatesTemplate");
      st.add("groupId", groupId);
      st.add("artifactId", aId);
      st.add("tag", "dependency");
      setXML(ctx, st.render());
    }
  }
}

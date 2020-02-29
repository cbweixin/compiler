package com.weixin.pants.javalib;

import static com.weixin.pants.utils.Utils.stg;
import static com.weixin.pants.utils.Utils.stripSingleQuotes;

import com.weixin.pants.jarslib.ThirdPartyDependencyGenerator;
import com.weixin.pants.javalib.gen.PANTSBaseListener;
import com.weixin.pants.javalib.gen.PANTSParser;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;

public class JavaLibEmitter extends PANTSBaseListener {

  ParseTreeProperty<String> xml = new ParseTreeProperty<String>();

  String getXML(ParseTree ctx) {
    return xml.get(ctx);
  }

  void setXML(ParseTree ctx, String s) {
    xml.put(ctx, s);
  }

  @Override public void exitDependent_list(PANTSParser.Dependent_listContext ctx) {

  }

  @Override
  public void exitDependent_entry(PANTSParser.Dependent_entryContext ctx) {
    String entry = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    String[] items = entry.split(":");
    if (items[0].startsWith("3rdparty")) {
      ThirdPartyDependencyGenerator generator = new ThirdPartyDependencyGenerator();
      String text = generator.getDependency(items[0], items[1]);
      setXML(ctx, text);
    } else {
      String[] modules = items[0].split("/");
      String[] groups = Arrays.copyOfRange(modules, 0, modules.length - 1);
      String groupId = Arrays.stream(groups).collect(Collectors.joining("."));
      String aId = modules[modules.length - 1];
      ST st = stg.getInstanceOf("coordinatesTemplate");
      st.add("groupId", groupId);
      st.add("artifactId",aId);
      st.add("tag","dependency");
      setXML(ctx, st.render());
    }
  }
}

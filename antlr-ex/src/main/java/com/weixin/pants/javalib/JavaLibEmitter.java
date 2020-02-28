package com.weixin.pants.javalib;

import static com.weixin.pants.utils.Utils.stripSingleQuotes;

import com.weixin.pants.jarslib.ThirdPartyDependencyGenerator;
import com.weixin.pants.javalib.gen.PANTSBaseListener;
import com.weixin.pants.javalib.gen.PANTSParser;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class JavaLibEmitter extends PANTSBaseListener {

  ParseTreeProperty<String> xml = new ParseTreeProperty<String>();

  @Override public void exitDependent_entry(PANTSParser.Dependent_entryContext ctx) {
    String entry = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    String[] items = entry.split(":");
    List<String> fields = new ArrayList<>();
    if(items[0].startsWith("3rdparty")){
      ThirdPartyDependencyGenerator generator = new ThirdPartyDependencyGenerator();
      String text = generator.getDependency(items[0],items[1]);
      fields.add(text);
      System.out.println(text);
      System.out.println("===========");
    }
  }


}

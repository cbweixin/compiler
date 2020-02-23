package com.weixin.listeners.json2xml;

import com.weixin.listeners.json2xml.gen.JSONBaseListener;
import com.weixin.listeners.json2xml.gen.JSONParser;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class JSON2XMLWithStringTemplate {
  public static class XMLEmitter extends JSONBaseListener {
    ParseTreeProperty<ST> xml = new ParseTreeProperty<ST>();
    STGroup templates = new STGroupFile("XML.stg");

    @Override
    public void exitJson(JSONParser.JsonContext ctx) {
      xml.put(ctx, xml.get(ctx.getChild(0)));
    }

    @Override
    public void exitEmptyObject(JSONParser.EmptyObjectContext ctx) {
      xml.put(ctx, templates.getInstanceOf("empty"));
    }

    @Override
    public void exitAnObject(JSONParser.AnObjectContext ctx) {
      ST objectST = templates.getInstanceOf("object");
      for (JSONParser.PairContext pctx : ctx.pair()) {
        objectST.add("fields", xml.get(pctx));
      }
      xml.put(ctx, objectST);
    }

    @Override
    public void exitEmptyArray(JSONParser.EmptyArrayContext ctx) {
      xml.put(ctx, templates.getInstanceOf("empty"));
    }

    @Override
    public void exitArrayOfValues(JSONParser.ArrayOfValuesContext ctx) {
      ST arrayST = templates.getInstanceOf("array");
      for (JSONParser.ValueContext vctx : ctx.value()) {
        arrayST.add("values", xml.get(vctx));
      }
      xml.put(ctx, arrayST);
    }

    @Override
    public void exitPair(JSONParser.PairContext ctx) {
      String name = stripQuotes(ctx.STRING().getText());
      JSONParser.ValueContext vctx = ctx.value();
      ST tag = templates.getInstanceOf("tag");
      tag.add("name", name);
      tag.add("content", xml.get(vctx));
      xml.put(ctx, tag);
    }

    @Override
    public void exitAtom(JSONParser.AtomContext ctx) {
      xml.put(ctx, value(ctx.start.getText()));
    }

    @Override
    public void exitObjectValue(JSONParser.ObjectValueContext ctx) {
      xml.put(ctx, xml.get(ctx.object()));
    }

    @Override
    public void exitArrayValue(JSONParser.ArrayValueContext ctx) {
      JSONParser.ArrayContext array = ctx.array();
      xml.put(ctx, xml.get(array));
    }

    @Override
    public void exitString(JSONParser.StringContext ctx) {
      xml.put(ctx, value(stripQuotes(ctx.start.getText())));
    }

    ST value(Object x) {
      ST st = templates.getInstanceOf("value");
      st.add("x", x);
      return st;
    }

    public static String stripQuotes(String s) {
      if ( s==null || s.charAt(0)!='"' ) {
        return s;
      }
      return s.substring(1, s.length()-1);
    }
  }

}

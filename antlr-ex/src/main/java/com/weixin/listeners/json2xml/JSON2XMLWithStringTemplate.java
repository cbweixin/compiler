package com.weixin.listeners.json2xml;

import com.weixin.listeners.json2xml.gen.JSONBaseListener;
import com.weixin.listeners.json2xml.gen.JSONLexer;
import com.weixin.listeners.json2xml.gen.JSONParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class JSON2XMLWithStringTemplate {

  public static class XMLEmitter extends JSONBaseListener {

    ParseTreeProperty<ST> xml = new ParseTreeProperty<ST>();
    STGroup templates = new STGroupFile(
        "/Users/xinwei/Documents/weixin/study-antlr/antlr-ex/src/main/java/com/weixin/listeners/json2xml/XML.stg");

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
      if (s == null || s.charAt(0) != '"') {
        return s;
      }
      return s.substring(1, s.length() - 1);
    }
  }

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    JSONLexer lexer = new JSONLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    JSONParser parser = new JSONParser(tokenStream);
    ParseTree tree = parser.json();

    ParseTreeWalker walker = new ParseTreeWalker();
    XMLEmitter listener = new XMLEmitter();
    walker.walk(listener, tree);
    System.out.println(listener.xml.get(tree).render());

  }
}

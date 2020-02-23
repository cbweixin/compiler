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

public class JSON2XML {

  public static class XMLEmitter extends JSONBaseListener {

    ParseTreeProperty<String> xml = new ParseTreeProperty<String>();

    String getXML(ParseTree ctx) {
      return xml.get(ctx);
    }

    void setXML(ParseTree ctx, String s) {
      xml.put(ctx, s);
    }

    @Override
    public void exitJson(JSONParser.JsonContext ctx) {
      setXML(ctx, getXML(ctx.getChild(0)));
    }

    @Override
    public void exitAnObject(JSONParser.AnObjectContext ctx) {
      StringBuilder buf = new StringBuilder();
      buf.append("\n");
      for (JSONParser.PairContext pctx : ctx.pair()) {
        buf.append(getXML(pctx));
      }
      setXML(ctx, buf.toString());
    }

    @Override
    public void exitEmptyObject(JSONParser.EmptyObjectContext ctx) {
      setXML(ctx, "");
    }

    @Override
    public void exitArrayOfValues(JSONParser.ArrayOfValuesContext ctx) {
      StringBuilder buf = new StringBuilder();
      buf.append("\n");
      for (JSONParser.ValueContext vctx : ctx.value()) {
        buf.append("<element>"); // conjure up element for valid XML
        buf.append(getXML(vctx));
        buf.append("</element>");
        buf.append("\n");
      }
      setXML(ctx, buf.toString());
    }

    @Override
    public void exitEmptyArray(JSONParser.EmptyArrayContext ctx) {
      setXML(ctx, "");
    }

    @Override
    public void exitPair(JSONParser.PairContext ctx) {
      String tag = stripQuotes(ctx.STRING().getText());
      JSONParser.ValueContext vctx = ctx.value();
      String x = String.format("<%s>%s</%s>\n", tag, getXML(vctx), tag);
      setXML(ctx, x);
    }

    @Override
    public void exitObjectValue(JSONParser.ObjectValueContext ctx) {
      // analogous to String value() {return object();}
      setXML(ctx, getXML(ctx.object()));
    }

    @Override
    public void exitArrayValue(JSONParser.ArrayValueContext ctx) {
      setXML(ctx, getXML(ctx.array())); // String value() {return array();}
    }

    @Override
    public void exitAtom(JSONParser.AtomContext ctx) {
      setXML(ctx, ctx.getText());
    }

    @Override
    public void exitString(JSONParser.StringContext ctx) {
      setXML(ctx, stripQuotes(ctx.getText()));
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
    walker.walk(listener,tree);
    System.out.println(listener.getXML(tree));

  }

}

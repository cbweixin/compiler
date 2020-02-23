package com.weixin.listeners.json2xml;

import com.weixin.listeners.json2xml.gen.JSONBaseListener;
import com.weixin.listeners.json2xml.gen.JSONLexer;
import com.weixin.listeners.json2xml.gen.JSONParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class JSON2XMLDom {
  public static class Node {
  }

  public static class Element extends Node {
    String name;
    List<Node> children = new ArrayList<Node>();
    public Element(String name) { this.name = name; }
    @Override
    public String toString() {
      String content = Utils.join(children.iterator(), "");
      if ( name==null ) {
        return content;
      }
      return XMLEmitter.tag(name, content);
    }
  }

  public static class TextNode extends Node {
    String content;
    public TextNode(String content) { this.content = content; }
    @Override
    public String toString() { return content; }
  }

  public static class XMLEmitter extends JSONBaseListener {
    ParseTreeProperty<Node> nodes = new ParseTreeProperty<Node>();

    @Override
    public void exitJson(JSONParser.JsonContext ctx) {
      nodes.put(ctx, nodes.get(ctx.getChild(0)));
    }

    @Override
    public void exitAnObject(JSONParser.AnObjectContext ctx) {
      Element o = new Element(null);
      for (JSONParser.PairContext pctx : ctx.pair()) {
        o.children.add(nodes.get(pctx));
      }
      nodes.put(ctx, o);
    }

    @Override
    public void exitArrayOfValues(JSONParser.ArrayOfValuesContext ctx) {
      Element a = new Element(null);
      for (JSONParser.ValueContext vctx : ctx.value()) {
        a.children.add(nodes.get(vctx));
      }
      nodes.put(ctx, a);
    }

    @Override
    public void exitPair(JSONParser.PairContext ctx) {
      String name = stripQuotes(ctx.STRING().getText());
      JSONParser.ValueContext vctx = ctx.value();
      Element p = new Element(name);
      Node value = nodes.get(vctx);
      if ( value!=null ) {
        if ( value instanceof Element && ((Element)value).name==null ) {
          // if null content, must be object or array, copy in elements
          p.children.addAll(((Element)value).children);
        }
        else {
          p.children.add(value);
        }
      }
      nodes.put(ctx, p);
    }

    @Override
    public void exitObjectValue(JSONParser.ObjectValueContext ctx) {
      nodes.put(ctx, nodes.get(ctx.object()));
    }

    @Override
    public void exitArrayValue(JSONParser.ArrayValueContext ctx) {
      JSONParser.ArrayContext array = ctx.array();
      nodes.put(ctx, nodes.get(array));
    }

    @Override
    public void exitString(JSONParser.StringContext ctx) {
      TextNode text = new TextNode(stripQuotes(ctx.start.getText()));
      if ( ctx.parent instanceof JSONParser.ArrayContext ) {
        Element implicitTag = new Element("element");
        implicitTag.children.add( new TextNode(ctx.start.getText()) );
        nodes.put(ctx, implicitTag);
      }
      else {
        nodes.put(ctx, text);
      }
    }

    @Override
    public void exitAtom(JSONParser.AtomContext ctx) {
      TextNode text = new TextNode(ctx.start.getText());
      if ( ctx.parent instanceof JSONParser.ArrayContext ) {
        Element implicitTag = new Element("element");
        implicitTag.children.add( new TextNode(ctx.start.getText()) );
        nodes.put(ctx, implicitTag);
      }
      else {
        nodes.put(ctx, text);
      }
    }

    public static String stripQuotes(String s) {
      if ( s==null || s.charAt(0)!='"' ) {
        return s;
      }
      return s.substring(1, s.length()-1);
    }

    public static String tag(String name, String content) {
      StringBuilder buf = new StringBuilder();
      buf.append('<'+name+'>');
      buf.append(content);
      buf.append("</"+name+'>');
      return buf.toString();
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
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    JSONParser parser = new JSONParser(tokens);
    ParseTree tree = parser.json();

    ParseTreeWalker walker = new ParseTreeWalker();
    XMLEmitter listener = new XMLEmitter();
    walker.walk(listener,tree);
    System.out.println(listener.nodes.get(tree));

  }

  }

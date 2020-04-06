package com.weixin.listeners.callgraph;

import com.weixin.listeners.callgraph.gen.CymbolLexer;
import com.weixin.listeners.callgraph.gen.CymbolParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;

public class CallGraph {

  static class Graph {

    // I'm using org.antlr.v4.runtime.misc: OrderedHashSet, MultiMap
    // list of functions
    Set<String> nodes = new OrderedHashSet<String>();
    // caller->callee
    MultiMap<String, String> edges =
        new MultiMap<String, String>();

    public void edge(String source, String target) {
      edges.map(source, target);
    }

    @Override
    public String toString() {
      return "edges: " + edges.toString() + ", functions: " + nodes;
    }

    public String toDOT() {
      StringBuilder buf = new StringBuilder();
      buf.append("digraph G {\n");
      buf.append("  ranksep=.25;\n");
      buf.append("  edge [arrowsize=.5]\n");
      buf.append("  node [shape=circle, fontname=\"ArialNarrow\",\n");
      buf.append("        fontsize=12, fixedsize=true, height=.45];\n");
      buf.append("  ");
      for (String node : nodes) { // print all nodes first
        buf.append(node);
        buf.append("; ");
      }
      buf.append("\n");
      for (String src : edges.keySet()) {
        for (String trg : edges.get(src)) {
          buf.append("  ");
          buf.append(src);
          buf.append(" -> ");
          buf.append(trg);
          buf.append(";\n");
        }
      }
      buf.append("}\n");
      return buf.toString();
    }

    /**
     * Fill StringTemplate: digraph G { rankdir=LR; <edgePairs:{edge| <edge.a> -> <edge.b>;};
     * separator="\n"> <childless:{f | <f>;}; separator="\n"> }
     * <p>
     * Just as an example. Much cleaner than buf.append method
     */
    public ST toST() {
      ST st = new ST(
          "digraph G {\n" +
              "  ranksep=.25; \n" +
              "  edge [arrowsize=.5]\n" +
              "  node [shape=circle, fontname=\"ArialNarrow\",\n" +
              "        fontsize=12, fixedsize=true, height=.45];\n" +
              "  <funcs:{f | <f>; }>\n" +
              "  <edgePairs:{edge| <edge.a> -> <edge.b>;}; separator=\"\\n\">\n" +
              "}\n"
      );
      st.add("edgePairs", edges.getPairs());
      st.add("funcs", nodes);
      return st;
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

    CymbolLexer lexer = new CymbolLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CymbolParser parser = new CymbolParser(tokens);

    ParseTree tree = parser.file();
    FunctionListener listener = new FunctionListener();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(listener, tree);
    System.out.println(listener.graph.toString());
    System.out.println(listener.graph.toDOT());
    System.out.println(listener.graph.toST().render());


  }
}

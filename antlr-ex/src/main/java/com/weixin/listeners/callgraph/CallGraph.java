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

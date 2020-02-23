package com.weixin.listeners.callgraph;

import com.weixin.listeners.callgraph.gen.CymbolLexer;
import com.weixin.listeners.callgraph.gen.CymbolParser;
import com.weixin.listeners.callgraph.symboltable.Symbol;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CheckSymbol {

  public static Symbol.Type getType(int tokenType) {
    switch ( tokenType ) {
      case CymbolParser.K_VOID :  return Symbol.Type.tVOID;
      case CymbolParser.K_INT :   return Symbol.Type.tINT;
      case CymbolParser.K_FLOAT : return Symbol.Type.tFLOAT;
    }
    return Symbol.Type.tINVALID;
  }

  public static void error(Token t, String msg) {
    System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
        msg);
  }

  public void process(String[] args) throws Exception {
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

    parser.setBuildParseTree(true);
    ParseTree tree =  parser.file();

    ParseTreeWalker walker = new ParseTreeWalker();
  }

}

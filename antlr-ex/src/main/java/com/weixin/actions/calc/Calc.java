package com.weixin.actions.calc;

import com.weixin.actions.tools.ExprLexer;
import com.weixin.actions.tools.ExprParser;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Calc {

  public static void main(String[] args) throws Exception {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    // get first expression
    String expr = br.readLine();
    // track input expr line numbers
    int line = 1;

    // share single parser instance
    ExprParser parser = new ExprParser(null);
    // don't need trees
    parser.setBuildParseTree(false);

    // while we have more expressions
    while (expr != null) {
      // create new lexer and token stream for each line (expression)
      ExprLexer lexer = new ExprLexer(CharStreams.fromString(expr + "\n"));
      // notify lexer of input position
      lexer.setLine(line);
      lexer.setCharPositionInLine(0);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // notify parser of new token stream
      parser.setInputStream(tokens);
      // start the parser
      parser.stat();
      // see if there's another line
      expr = br.readLine();
      line++;
    }
  }
}

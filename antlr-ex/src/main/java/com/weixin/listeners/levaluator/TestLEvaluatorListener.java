package com.weixin.listeners.levaluator;

import com.weixin.listeners.levaluator.gen.LExprBaseListener;
import com.weixin.listeners.levaluator.gen.LExprLexer;
import com.weixin.listeners.levaluator.gen.LExprParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestLEvaluatorListener {
  public static class Evaluator extends LExprBaseListener {

    Stack<Integer> stack = new Stack<Integer>();

    @Override
    public void exitMult(LExprParser.MultContext ctx) {
      int right = stack.pop();
      int left = stack.pop();
      stack.push(left * right);
    }

    @Override
    public void exitAdd(LExprParser.AddContext ctx) {
      int right = stack.pop();
      int left = stack.pop();
      stack.push(left + right);
    }

    @Override
    public void exitInt(LExprParser.IntContext ctx) {
      stack.push(Integer.valueOf(ctx.INT().getText()));
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

    LExprLexer lexer = new LExprLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    LExprParser parser = new LExprParser(tokens);
    ParseTree tree = parser.s();

    ParseTreeWalker walker = new ParseTreeWalker();
    Evaluator evaluator = new Evaluator();
    walker.walk(evaluator,tree);
    System.out.printf("result is : %d\n", evaluator.stack.pop());
  }


}

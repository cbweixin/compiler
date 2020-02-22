package com.weixin.listeners.levaluator;

import com.weixin.listeners.levaluator.gen.LExprBaseListener;
import com.weixin.listeners.levaluator.gen.LExprLexer;
import com.weixin.listeners.levaluator.gen.LExprParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestLEvaluatorWithProps {

  public static class EvaluatorWithProps extends LExprBaseListener {

    /**
     * maps nodes to integers with Map<ParseTree,Integer>
     */
    ParseTreeProperty<Integer> values = new ParseTreeProperty<Integer>();

    /**
     * Need to pass e's value out of rule s : e ;
     */
    @Override
    public void exitS(LExprParser.SContext ctx) {
      setValue(ctx, getValue(ctx.e())); // like: int s() { return e(); }
    }

    @Override
    public void exitMult(LExprParser.MultContext ctx) {
      int left = getValue(ctx.e(0));  // e '*' e   # Mult
      int right = getValue(ctx.e(1));
      setValue(ctx, left * right);
    }

    @Override
    public void exitAdd(LExprParser.AddContext ctx) {
      int left = getValue(ctx.e(0)); // e '+' e   # Add
      int right = getValue(ctx.e(1));
      setValue(ctx, left + right);
    }

    @Override
    public void exitInt(LExprParser.IntContext ctx) {
      String intText = ctx.INT().getText(); // INT   # Int
      setValue(ctx, Integer.valueOf(intText));
    }

    public void setValue(ParseTree node, int value) {
      values.put(node, value);
    }

    public int getValue(ParseTree node) {
      return values.get(node);
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
    EvaluatorWithProps evaluator = new EvaluatorWithProps();
    walker.walk(evaluator, tree);
    System.out.printf("result is : %d\n", evaluator.getValue(tree));
  }

}

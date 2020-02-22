package com.weixin.listeners.levaluator;

import com.weixin.listeners.evaluator.TestEvaluatorListenerWithProps.EvaluatorWithProps;
import com.weixin.listeners.evaluator.gen.ExprLexer;
import com.weixin.listeners.levaluator.gen.LExprBaseListener;
import com.weixin.listeners.levaluator.gen.LExprBaseVisitor;
import com.weixin.listeners.levaluator.gen.LExprLexer;
import com.weixin.listeners.levaluator.gen.LExprParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class TestLEvalVisitor {
  public static class EvalVisitor extends LExprBaseVisitor<Integer> {
    @Override
    public Integer visitMult(LExprParser.MultContext ctx) {
      return visit(ctx.e(0)) * visit(ctx.e(1));
    }

    @Override
    public Integer visitAdd(LExprParser.AddContext ctx) {
      return visit(ctx.e(0)) + visit(ctx.e(1));
    }

    @Override
    public Integer visitInt(LExprParser.IntContext ctx) {
      return Integer.valueOf(ctx.INT().getText());
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

    EvalVisitor visitor = new EvalVisitor();
    int result = visitor.visit(tree);
    System.out.printf("result is : %d\n", result);


  }

}

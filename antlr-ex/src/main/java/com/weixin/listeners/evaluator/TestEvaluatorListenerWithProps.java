package com.weixin.listeners.evaluator;

import com.weixin.listeners.evaluator.TestEvaluatorListener.Evaluator;
import com.weixin.listeners.evaluator.gen.ExprBaseListener;
import com.weixin.listeners.evaluator.gen.ExprLexer;
import com.weixin.listeners.evaluator.gen.ExprParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TestEvaluatorListenerWithProps {
  public static class EvaluatorWithProps extends ExprBaseListener {
    ParseTreeProperty<Integer> values = new ParseTreeProperty<Integer>();

    @Override
    public void exitS(ExprParser.SContext ctx) {
      values.put(ctx, values.get(ctx.getChild(0)));
    }

    @Override
    public void exitE(ExprParser.EContext ctx) {
      if ( ctx.getChildCount()==3 ) { // operations have 3 children
        int left = values.get(ctx.e(0));
        int right = values.get(ctx.e(1));
        if ( ctx.op.getType()==ExprParser.MULT ) {
          values.put(ctx, left * right);
        }
        else {
          values.put(ctx, left + right);
        }
      }
      else {
        values.put(ctx, values.get(ctx.getChild(0))); // an INT
      }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
      Token symbol = node.getSymbol();
      if ( symbol.getType()==ExprParser.INT ) {
        values.put(node, Integer.valueOf(symbol.getText()));
      }
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

    ExprLexer lexer = new ExprLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ExprParser parser = new ExprParser(tokens);
    parser.setBuildParseTree(true);
    ParseTree tree = parser.s();
    System.out.println(tree.toStringTree(parser));

    ParseTreeWalker walker = new ParseTreeWalker();
    EvaluatorWithProps eval = new EvaluatorWithProps();
    walker.walk(eval,tree);
    System.out.println("result = "+eval.values.get(tree));

  }

}

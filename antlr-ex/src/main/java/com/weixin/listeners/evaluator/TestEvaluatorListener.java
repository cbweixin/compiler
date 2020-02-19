package com.weixin.listeners.evaluator;

import com.weixin.listeners.evaluator.gen.ExprBaseListener;
import com.weixin.listeners.evaluator.gen.ExprLexer;
import com.weixin.listeners.evaluator.gen.ExprParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TestEvaluatorListener {

  public static class Evaluator extends ExprBaseListener {

    Stack<Integer> stack = new Stack<Integer>();

    @Override
    public void exitE(ExprParser.EContext ctx) {
      if (ctx.getChildCount() == 3) { // operations have 3 children
        int right = stack.pop();
        int left = stack.pop();
        if (ctx.op.getType() == ExprParser.MULT) {
          stack.push(left * right);
        } else {
          stack.push(left + right); // must be add
        }
      }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
      Token symbol = node.getSymbol();
      if ( symbol.getType()==ExprParser.INT ) {
        stack.push( Integer.valueOf(symbol.getText()) );
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
    Evaluator eval = new Evaluator();
    walker.walk(eval,tree);
    System.out.println("result = "+eval.stack.pop());

  }

}

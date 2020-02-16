package com.weixin.tour.calc;

import com.weixin.tour.calc.gen.LabeledExprLexer;
import com.weixin.tour.calc.gen.LabeledExprParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calc {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    LabeledExprLexer lexer = new LabeledExprLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    LabeledExprParser parser = new LabeledExprParser(tokenStream);
    ParseTree tree = parser.prog();

    EvalVisitor eval = new EvalVisitor();
    eval.visit(tree);
    System.out.println(tree.toStringTree(parser));

  }

}

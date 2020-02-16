package com.weixin.tour.math;

import com.weixin.tour.math.gen.ExprLexer;
import com.weixin.tour.math.gen.ExprParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {

  public static void main(String[] args) throws IOException {
    System.out.println("Working Directory = " + System.getProperty("user.dir"));
    String inputFile = null;
    if ( args.length>0 ) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if ( inputFile!=null ) {
      is = new FileInputStream(inputFile);
    }

    ExprLexer lexer = new ExprLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    ExprParser parser = new ExprParser(tokenStream);
    ParseTree tree = parser.prog();
    System.out.println(tree.toStringTree(parser));
  }

}

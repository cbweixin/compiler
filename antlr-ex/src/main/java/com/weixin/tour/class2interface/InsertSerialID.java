package com.weixin.tour.class2interface;

import com.weixin.tour.class2interface.gen.JavaLexer;
import com.weixin.tour.class2interface.gen.JavaParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class InsertSerialID {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    JavaLexer lexer = new JavaLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    JavaParser parser = new JavaParser(tokenStream);
    ParseTree tree = parser.compilationUnit();

    ParseTreeWalker walker = new ParseTreeWalker();
    InsertSerialIDListener extractor = new InsertSerialIDListener(tokenStream);
    walker.walk(extractor,tree);

    // print back ALTERED stream
    System.out.println(extractor.rewriter.getText());
  }

}

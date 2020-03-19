package com.weixin.errors.ambiguity;

import com.weixin.errors.ambiguity.gen.AmbigLexer;
import com.weixin.errors.ambiguity.gen.AmbigParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    AmbigLexer lexer = new AmbigLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    AmbigParser parser = new AmbigParser(tokenStream);
    parser.removeErrorListeners();
    parser.addErrorListener(new DiagnosticErrorListener());
    ParseTree tree = parser.stat();
    parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
    System.out.println("tree = " + tree.toStringTree(parser));
  }
}

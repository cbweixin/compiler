package weixin.exception;

import weixin.lex.Token;

import java.io.IOException;

public class ParseException extends Exception {
    public ParseException(Token t) {
        this("", t);
    }

    public ParseException(String msg, Token t) {
        super("syntax error arround " + location(t) + " . " + msg);
    }

    private static String location(Token t) {
        if (t == Token.EOF) {
            return "the last line";
        } else {
            return new StringBuilder("\"").append(t.getText()).append("\" at line").append(t.getLineNumber()).toString();
        }
    }

    public ParseException(IOException e){
        super(e);
    }

    public ParseException(String msg){
        super(msg);
    }
}

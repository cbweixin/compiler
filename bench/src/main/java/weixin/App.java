package weixin;

import weixin.exception.ParseException;
import weixin.lex.Lexer;
import weixin.lex.Token;
import weixin.util.CodeDialog;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ParseException {
        System.out.println("Hello World!");
        Lexer l = new Lexer(new CodeDialog());
        for (Token t; (t = l.read()) != Token.EOF; ) {
            System.out.println("=> " + t.getText());
        }
    }

}

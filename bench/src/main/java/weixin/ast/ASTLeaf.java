package weixin.ast;

import weixin.lex.Token;

import java.util.ArrayList;

public class ASTLeaf extends ASTree {
    private static ArrayList<ASTree> empty = new ArrayList<ASTree>();
    protected Token token;

    @Override
    public ASTree child(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int numChildren() {
        return 0;
    }

    @Override
    public Iterable<ASTree> children() {
        return (Iterable<ASTree>) empty.iterator();
    }

    @Override
    public String location() {
        return "at line : " + token.getLineNumber();
    }

    public Token token() {
        return token;
    }
}

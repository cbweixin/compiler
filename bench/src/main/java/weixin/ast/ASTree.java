package weixin.ast;

import java.util.Iterator;

public abstract class ASTree implements Iterable<ASTree> {
    public abstract ASTree child(int i);

    public abstract int numChildren();

    public abstract Iterable<ASTree> children();

    public abstract String location();

    public Iterator<ASTree> iterator() {
        return (Iterator<ASTree>) children();
    }
}

import java.io.IOException;
class makefile1Gen extends MakeSupport {
    public makefile1Gen() throws IOException {
        Target target = null;

	target = new Target("t.o");
	target.addDependency("t.c");
	target.addAction("gcc -c -o t.o t.c");
	targets.put("t.o", target);
	target = new Target("u.o");
	target.addDependency("u.c");
	target.addAction("gcc -c -o u.o u.c");
	targets.put("u.o", target);
	target = new Target("go");
	target.addDependency("t.o");
	target.addDependency("u.o");
	target.addAction("gcc -o go t.o u.o");
	target.addAction("echo done");
	targets.put("go", target);
	target = new Target("clean");
	target.addAction("rm t.o u.o go");
	targets.put("clean", target);
    }   
    
    public static void main(String[] args) throws Exception {
        String target = args[0];
        makefile1Gen m = new makefile1Gen();
        if ( m.targets.get(target)==null ) {
            System.err.println("No such target: "+target);
            System.exit(-1);
        }
        int r = m.build(target);
        System.exit(r);
    }
}


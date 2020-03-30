package com.weixin.asmsample;

import com.sun.xml.internal.ws.org.objectweb.asm.MethodAdapter;
import com.sun.xml.internal.ws.org.objectweb.asm.MethodVisitor;
import com.sun.xml.internal.ws.org.objectweb.asm.Opcodes;

public class AddASMHelloWorlderMethodAdapter extends MethodAdapter {

  public AddASMHelloWorlderMethodAdapter(MethodVisitor mv) {
    super(mv);
  }

  @Override
  public void visitCode() {
    visitMethodInsn(Opcodes.INVOKESTATIC, "HelloASMer", "hello", "()V");
  }
}

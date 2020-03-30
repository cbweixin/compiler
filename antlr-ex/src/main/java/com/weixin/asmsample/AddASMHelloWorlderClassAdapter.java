package com.weixin.asmsample;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;
import com.sun.xml.internal.ws.org.objectweb.asm.ClassVisitor;
import com.sun.xml.internal.ws.org.objectweb.asm.MethodVisitor;

public class AddASMHelloWorlderClassAdapter extends ClassAdapter {

  public AddASMHelloWorlderClassAdapter(ClassVisitor cv) {
    super(cv);
  }

  @Override
  public MethodVisitor visitMethod(int access, String name, String desc, String signature,
      String[] exceptions) {
    MethodVisitor mv = cv.visitMethod(access, name, desc, signature, exceptions);
    MethodVisitor wrappedMv = mv;
    if (mv != null) {
      if (name.equals("say")) {
        wrappedMv = new AddASMHelloWorlderMethodAdapter(mv);
      }
    }
    return wrappedMv;
  }
}

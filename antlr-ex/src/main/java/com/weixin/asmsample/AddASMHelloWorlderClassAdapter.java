package com.weixin.asmsample;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;
import com.sun.xml.internal.ws.org.objectweb.asm.ClassVisitor;

public class AddASMHelloWorlderClassAdapter extends ClassAdapter {

  public AddASMHelloWorlderClassAdapter(ClassVisitor cv) {
    super(cv);
  }
}

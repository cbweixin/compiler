package com.weixin.asmsample;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

public class ClassGenerator {

  public static void main(String[] args) throws IOException {
    ClassReader classReader = new ClassReader("HelloWorlder");
    ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
    ClassAdapter classAdapter = new AddASMHelloWorlderClassAdapter(classWriter);
//    classReader.accept(classAdapter, ClassReader.SKIP_DEBUG);
    byte[] data = classWriter.toByteArray();
    File file = new File("Account.class");
    FileOutputStream fileOutputStream = new FileOutputStream(file);
    fileOutputStream.write(data);
    fileOutputStream.close();
  }

}

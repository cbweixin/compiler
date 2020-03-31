package com.weixin.asmsample2;

import static org.objectweb.asm.ClassWriter.COMPUTE_MAXS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.instrument.Instrumentation;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

public class Agent {

  public static void premain(String agentArgs, Instrumentation inst) {
    inst.addTransformer(
        (loader, className, classBeingRedefined, protectionDomain, classfileBuffer) -> {
          // only enhance com/weixin/asmsample2//Person
          if ("com/weixin/asmsample2/Person".equals(className)) {
            System.out.println("com/weixin/asmsample2/Person transforming...");
            ClassReader reader = new ClassReader(classfileBuffer);
            // specify COMPUTE_MAXS 新生成字节码需要自动计算操作数栈的最大值，否则会报错
            ClassWriter writer = new ClassWriter(reader, COMPUTE_MAXS);
            ClassVisitor cv = new EnhancerAdapter(writer);
            reader.accept(cv, 0);
            System.out.println("io/libriraries/asm/agent/Person transformed");


            // debug file to disk for auditing
            try (FileOutputStream fos = new FileOutputStream("F:\\Person.class")) {
              fos.write(writer.toByteArray());
            } catch (IOException e) {
              e.printStackTrace();
            }

            return writer.toByteArray();
          }
          return classfileBuffer;
        }
    );
  }

}

package com.java.base.io.iotest.ioexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 新特性 jdk7
 * 可以在 try()括号里定义新对象
 */
public class Demo01Exception {
    public static void main(String[] args) {
        try ( //字节输入流，源文件
              FileInputStream fis = new FileInputStream(new File("b.txt"));
              //字节输出流，目标文件
              FileOutputStream fos = new FileOutputStream(new File("bCopy.txt"));
        ) {
            //读取文件 流
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


package com.java.base.io.iotest;

import java.io.*;

/**
 * 文件复制
 */
public class Demo03Copy {
    public static void main(String[] args) {
        //复制 b.txt 到 bCopy.txt
        try {
            //字节输入流，源文件
            FileInputStream fis = new FileInputStream(new File("b.txt"));
            //字节输出流，目标文件
            FileOutputStream fos = new FileOutputStream(new File("bCopy.txt"));
            //读取文件 流
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes);
            }
            //先关闭写，在关闭读
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

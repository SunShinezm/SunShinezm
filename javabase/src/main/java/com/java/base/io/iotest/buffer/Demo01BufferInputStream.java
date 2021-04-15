package com.java.base.io.iotest.buffer;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节缓冲输入流
 * *      给基本的字节流增加一个缓冲区（数组）提高基本的字节输入流的读取效率
 */
public class Demo01BufferInputStream {

    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("b.txt"));
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

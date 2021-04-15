package com.java.base.io.iotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02InputStream {
    /**
     * 一次读取多个字节
     * read(byte[] b)
     * byte[] 起到缓冲作用，存储每次读取的多个字节
     * 返回参数 length
     * 返回的是 读取有效字节的个数
     *
     * @param args
     */
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("b.txt"));
            //读取文件 多个读取,一次读取十个
            byte[] bytes = new byte[10];
            //int len = fis.read(bytes);//每次读取有效字节个数
            //System.out.println(len);
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

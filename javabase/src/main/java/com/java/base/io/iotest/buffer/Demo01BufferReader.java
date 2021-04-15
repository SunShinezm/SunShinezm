package com.java.base.io.iotest.buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 缓冲流
 * java.io.BufferedReader extends Reader
 * <p>
 * 字符缓冲输入流
 * 给基本的字符流增加一个缓冲区（数组）提高基本的字符输入流的读取效率
 */
public class Demo01BufferReader {
    public static void main(String[] args) {
        /*try {
            BufferedReader brd = new BufferedReader(new FileReader("a.txt"));
            int len = 0;
            char[] chars = new char[1024];
            while ((len = brd.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        readLine();
    }


    public static void readLine() {
        try {
            BufferedReader brd = new BufferedReader(new FileReader("b.txt"));
            String str = null;
            while ((str = brd.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

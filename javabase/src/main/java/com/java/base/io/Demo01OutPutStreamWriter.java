package com.java.base.io;

import java.io.*;

/**
 * java.io.OutputStreamWriter extends writer
 * 可以查询默认编码
 * *      可以制定编码表，把字符转化成字节
 */
public class Demo01OutPutStreamWriter {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt", true), "GBK");
            osw.write("你好");
            osw.flush();
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.java.base.io;

import java.io.*;

/**
 * InputStreamReader 字节流向字符的桥梁
 * 可以查询默认的编码表
 * 也可以指定编码表
 * <p>
 * OutPutStreamWriter 字符流向字节的桥梁
 * 可以查询默认编码
 * 可以制定编码表，把字符转化成字节
 */
public class Demo01InputStreamReader {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("b.txt"), "GBK");
            BufferedReader br = new BufferedReader(isr);
            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println(new String(str));
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

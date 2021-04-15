package com.java.base.io.iotest.zifuio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流
 * <p>
 * 字节流读取中文
 * GBK：占用2个字节
 * UTF-8：占用3个字节
 * <p>
 * 字符流可以读写字符
 * 一次可以读取一个字符，不管中文还是英文
 * <p>
 * java.io.Reader 字符输入流最顶层的父类，定义了成员的共性方法，是一个抽象类
 * <p>
 * int read() 一次读取一个字符
 * int read(char[] char) 一次读取多个字符
 * void close()
 * <p>
 * <p>
 * <p>
 * java.io.FileReader extends InputStreamReader (字符转换流)   extends java.io.Reader
 * <p>
 * 构造方法
 * FileReader(String fileName)
 * FileReader(File file)
 * <p>
 * 步骤
 * 创建 FileReader 对象
 * 把 FileReader 对象指向 读取文件
 */
public class Demo01Reader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("a.txt");
            int len = 0;
            //一次读取一个
            /*while ((len=fr.read())!=-1){
                System.out.println((char)len);
            }*/
            //一次读取多个
            char[] chars = new char[1024];
            while ((len = fr.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

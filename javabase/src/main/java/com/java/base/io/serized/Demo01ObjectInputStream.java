package com.java.base.io.serized;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * java.io.ObjectInputStream extends InputStream
 * <p>
 * 把文件保存中的对象，以流的形式读取使用
 * <p>
 * 构造方法
 * ObjectInputStream(InputStream is) is:字节输入流
 * 特有方法
 * Object readObject()
 */
public class Demo01ObjectInputStream {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
            Object obj = ois.readObject();
            List<Person> list = (List) obj;
            System.out.println(list);
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

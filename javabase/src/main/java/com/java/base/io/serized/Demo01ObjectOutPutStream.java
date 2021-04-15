package com.java.base.io.serized;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * java.io.ObjectOutPutStream extends OutPutStream
 * <p>
 * 构造方法：
 * ObjectOutPutStream(InputStream out)  out：字节输出流
 */
public class Demo01ObjectOutPutStream {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
            Person person = new Person("zs", 18);
            Person person1 = new Person("ls", 15);
            List list = new ArrayList();
            list.add(person);
            list.add(person1);
            oos.writeObject(list);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

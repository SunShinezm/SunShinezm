package com.java.base.io.iotest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 追加写
 * FileOutPutStream(String name,boolean append)创建一个制定name的文件，写入数据的输出文件流
 * FileOutPutStream(File file,boolean append) 创建一个制定的File对象，写入文件输出流
 * append：false 创建一个新文件写入
 * true  在原文件基础上进行追加
 */
public class Demo02OutPutStream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("b.txt"), true);
            //文件中写入100，需要写几个字节？需要写三个 asc 49 ，48，48
            fos.write(49);
            fos.write(48);
            fos.write(48);
            //如果写多个字节，需要把他转成bytes[]
            //fos.write("100".getBytes());
            byte[] bytes = {65, 66, 67, 68, 69};
            fos.write(bytes);
            //换行：windows \r\n, linux:\n,mac:\r
            for (int i = 0; i < 10; i++) {
                fos.write("你好".getBytes());
                fos.write("\r".getBytes());
            }
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

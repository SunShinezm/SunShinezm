package com.java.base.io.iotest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * OutPutStream 此抽象类是表示字节输出流的所有类的超类
 * <p>
 * 直接已知子类：
 * ByteArrayOutputStream，FileOutputStream，FilterOutputStream，
 * ObjectOutputStream，OutputStream，PipedOutputStream
 * <p>
 * void	close()
 * 关闭此输出流并释放与此流关联的所有系统资源。
 * <p>
 * void	flush()
 * 刷新此输出流，并强制写出所有缓冲的输出字节。
 * <p>
 * void	write(byte[] b)
 * 将b.length指定字节数组中的字节写入此输出流。
 * <p>
 * void	write(byte[] b, int off, int len)
 * 将len指定字节数组中从偏移量开始的字节写入off此输出流。
 * <p>
 * abstract void	write(int b)
 * 将指定的字节写入此输出流
 * <p>
 * java.io.FileOutputStream 文件字节输出流
 * <p>
 * 构造函数和描述
 * FileOutputStream(File file)
 * 创建文件输出流以写入由指定File对象表示的文件。
 * <p>
 * FileOutputStream(File file, boolean append)
 * 创建文件输出流以写入由指定File对象表示的文件。
 * <p>
 * FileOutputStream(FileDescriptor fdObj)
 * 创建文件输出流以写入指定的文件描述符，该文件描述符表示到文件系统中实际文件的现有连接。
 * <p>
 * FileOutputStream(String name)
 * 创建文件输出流以写入具有指定名称的文件
 * 。
 * FileOutputStream(String name, boolean append)
 * 创建文件输出流以写入具有指定名称的文件。
 * <p>
 * 写入数据的原理
 * java程序-》jvm-》os（操作系统）-》os调用写入方法-》数据写到文件中
 * <p>
 * 字节输出流的使用步骤
 * 1。创建一个fileOutPutStream对象
 * 2。调用fileOutPutStream 的write方法，把数据写入到文件中
 * 3。释放资源，调用close（）方法
 */
public class Demo01OutPutStream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("b.txt"));
            String str = "hello world";
            fos.write(str.getBytes());
            fos.write(49);
            fos.write(48);
            fos.write(48);
            //byte[] bytes ={65,66,67,68,69};//ABCDE
            //byte[] bytes ={-65,-66,-67,68,69};
            byte[] bytes = {65, 66, 67, 68, 69};//ABCDE
            fos.write(bytes, 1, 2);
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

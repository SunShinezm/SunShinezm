package com.java.base.io.iotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.InputStream：字节输入流
 * 是所有字节输出流的超类
 * <p>
 * 定义了所有子类的共性方法
 * abstract int read()
 * 从输入流中读取数据的下一个字节。
 * int	read(byte[] b)
 * 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 * int	read(byte[] b, int off, int len)
 * 将输入流中最多 len 个数据字节读入 byte 数组。
 * <p>
 * void	close()
 * 关闭此输入流并释放与该流关联的所有系统资源。
 * <p>
 * 直接已知子类：
 * AudioInputStream, ByteArrayInputStream, FileInputStream,
 * FilterInputStream, InputStream, ObjectInputStream, PipedInputStream,
 * SequenceInputStream, StringBufferInputStream
 * <p>
 * <p>
 * <p>
 * FileInputStream extends InputStream
 * 把硬盘的数据读到内存中
 * <p>
 * 构造方法
 * <p>
 * 构造方法摘要
 * 重要  FileInputStream(File file)
 * 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
 * <p>
 * FileInputStream(FileDescriptor fdObj)
 * 通过使用文件描述符 fdObj 创建一个 FileInputStream，该文件描述符表示到文件系统中某个实际文件的现有连接。
 * <p>
 * 重要 FileInputStream(String name)
 * 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
 * <p>
 * 原理
 * java程序-》jvm——》os-》os读取方法-》读取文件
 * <p>
 * 使用步骤：
 * 创建FileInputStream对象
 * 使用read方法读取数据
 * close 释放资源
 */
public class Demo01InputStream {
    /**
     * 一次读取一个字节的方法
     *
     * @param args
     */
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("b.txt"));
            int len = 0;//因为fis.read() 读取后会把指针指向下一个，如果不定义变量len去接受数据，则会造成少读，丢失的情况
            //一次读取一个字节
            while ((len = fis.read()) != -1) {
                System.out.println((char) len);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

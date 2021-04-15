package com.java.base.io.iotest.zifuio;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流   字符流只能处理纯文本文件，不能处理图片音频等（这些会造成损坏）
 * java.io.Writer
 * 是所有字符输出流的父类* void	close()
 * * 关闭此输出流并释放与此流关联的所有系统资源。
 * * <p>
 * * void	flush()
 * * 刷新此输出流，并强制写出所有缓冲的输出字符。
 * * <p>
 * * void	write(char[] b)
 * * 将b.length指定字节数组中的字符写入此输出流。
 * * <p>
 * * void	write(char[] b, int off, int len)
 * * 将len指定字符数组中从偏移量开始的字节写入off此输出流。
 * <p>
 * <p>
 * java.io.FileWriter extends OutPustStreamWriter extends Writer
 * <p>
 * FileWriter 内存中的字符写到硬盘中
 * 构造方法
 * *      FileWriter(String fileName)
 * *      FileWriter(File file)
 * <p>
 * 创建FileWriter对象
 * 根据构造方法中的路径创建文件
 * 会把FileWriter对象指向创建好的文件
 * <p>
 * <p>
 * 步骤：
 * 1 创建对象FilterWriter
 * 2 使用FilterWriter中的Write，把数据写入到内存缓冲区中（字符转换成字节的过程）
 * 3 使用FileWriter中的flsh，把内存缓冲的数据写到文件中
 * 4 关闭流（关闭流前，会把内存对象写到文件中）
 * <p>
 * <p>
 * flush 和close的区别
 * flush：刷新缓冲区，流对象可以继续使用
 * close：先刷新缓冲区，然后通知系统释放资源，流不能在被使用
 */
public class Demo01Writer {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("c.txt");
            fw.write("你好");
            fw.flush();//如果不调用flush方法，在不调用close的情况下则不会把内存的数据写到硬盘中
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

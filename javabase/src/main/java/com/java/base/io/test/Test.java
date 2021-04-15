package com.java.base.io.test;

import java.io.*;

/**
 * 测试字节流
 * 字符流          字符流只能处理纯文本文件，不能处理图片音频等
 * 缓冲字节流
 * 缓冲字符流 的效率
 * 缓冲字节>字节>缓冲字符>字符
 */
public class Test {
    public static void main(String[] args) {
        /*System.out.println(getSumN(100));
        System.out.println(getFactorial(3));*/
        System.out.println("字节流速度：" + copyByByteStream());
        System.out.println("字符流速度：" + copyByReaderStream());
        System.out.println("缓冲字节流速度：" + copyByBufferedByteStream());
        System.out.println("缓冲字符流速度：" + copyByBufferedReaderStream());
    }
    //递归计算1-n之间的和

    /**
     * 递归必须明确
     * 1 递归的结束条件
     * 2 递归的目的
     */
    public static int getSumN(int n) {
        if (n > 1) {
            return n + getSumN(n - 1);
        } else {
            return 1;
        }
    }

    /**
     * 计算n的阶乘
     */
    public static int getFactorial(int n) {
        if (n == 2) {
            return 2;
        }
        return n * getFactorial(n - 1);
    }


    /**
     * 字节复制
     */
    public static Long copyByByteStream() {
        try {
            Long times = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream("dnf.png");
            FileOutputStream fos = new FileOutputStream("dnfCopyByte.png");
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes);
            }
            fos.flush();
            fos.close();
            fis.close();
            return (System.currentTimeMillis() - times);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 字符复制
     */
    public static Long copyByReaderStream() {
        try {
            Long times = System.currentTimeMillis();
            FileReader fis = new FileReader("dnf.png");
            FileWriter fos = new FileWriter("dnfCopyReader.png");
            int len = 0;
            char[] chars = new char[1024];
            while ((len = fis.read(chars)) != -1) {
                fos.write(chars);
            }
            fos.flush();
            fos.close();
            fis.close();
            return (System.currentTimeMillis() - times);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 缓冲字符复制
     */
    public static Long copyByBufferedReaderStream() {
        try {
            Long times = System.currentTimeMillis();
            BufferedReader fis = new BufferedReader(new FileReader("dnf.png"));
            BufferedWriter fos = new BufferedWriter(new FileWriter("dnfCopyBufferedReader.png"));
            int len = 0;
            char[] chars = new char[1024];
            while ((len = fis.read(chars)) != -1) {
                fos.write(chars);
            }
            fos.flush();
            fos.close();
            fis.close();
            return System.currentTimeMillis() - times;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 缓冲字节复制
     */
    public static Long copyByBufferedByteStream() {
        try {
            Long times = System.currentTimeMillis();
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream("dnf.png"));
            BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("dnfCopyBufferedReader.png"));
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes);
            }
            fos.flush();
            fos.close();
            fis.close();
            return (System.currentTimeMillis() - times);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

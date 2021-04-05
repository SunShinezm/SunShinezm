package com.java.base.io.file;

import java.io.File;

/**
 * java.io.fie 类
 * 可以对file类进行操作
 * 创建一个文件/文件夹
 * 删除文件/文件夹
 * 获取文件/文件夹
 * 判断文件/文件夹是否存在
 * 文件夹遍历
 * 获取文件大小
 * 记住三个单词
 * file：文件
 * directory：文件夹
 * path：路径
 * <p>
 * 路径：
 * 绝对路径：是一个完整路径，以盘符开始的路径（C:\\ideaproject\\a.txt）
 * 相对路径：是一个简化的路径 ,指的是当前项目的跟目录
 * ("a.txt")
 * 注意：
 * 路径不区分大小写
 * 路径中文件名分割符 windowns 反斜杠 ，反斜杠是转义字符，两个 // 代表一个/
 */
public class Demo01File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;//路径分隔符 ;
        String separator = File.separator;//文件名分隔符  \
        String path = "/Users/zhouming/Documents/a.txt";
        show(path);///Users/zhouming/Documents/a.txt
        // 父子路径
        show1("/Users/zhouming/Documents", "b.txt");///Users/zhouming/Documents/b.txt

        //获取file的绝对路径
        getAbsolutePath();///Users/zhouming/workspace/SunShinezm/a.txt
        //获取path
        getPath();//a.txt
        //获取结尾
        getName();//a.txt
        //获取length
        getLength();//12  0
        //判断文件/文件夹是否存在
        System.out.println(judgeExist("a.txt"));//false

        //false
        System.out.println(isDirectory("/Users/zhouming/workspace/SunShinezm/javabase/src/main/resources/a.txt"));
        //true
        System.out.println(isFile("/Users/zhouming/workspace/SunShinezm/javabase/src/main/resources/a.txt"));
    }

    /**
     * File(String)
     * 创建file对象，不考虑路径的真假，只是把路径字符串封装成一个File对象
     *
     * @param path
     */
    private static void show(String path) {
        File file = new File(path);
        System.out.println(file);//重写了Object.toString 方法  /Users/zhouming/Documents/a.txt
    }

    /**
     * File(String parent,String child)
     *
     * @param parent 父路径
     * @param child  子路径
     *               好处：
     *               父子路径都可以独立书写，使用起来非常灵活，而且可以随时变化
     */
    private static void show1(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /**
     * file.getAbsolutePath()
     * 获取文件的绝对路径
     */
    private static void getAbsolutePath() {
        File file = new File("/Users/zhouming/workspace/SunShinezm/javabase/src/main/resources/a.txt");
        System.out.println(file.getAbsolutePath());
    }

    /**
     * file.getPath()
     * 获取构造方法中传的路径
     */
    private static void getPath() {
        File file = new File("a.txt");
        System.out.println(file.getPath());
    }

    /**
     * file.getName()
     * 获取构造方法中结尾的部分
     */
    private static void getName() {
        File file = new File("a.txt");
        System.out.println(file.getName());
    }

    /**
     * file.length()
     * 获取构造方法指定文件的大小，以字节为单位
     * 注意：
     * 文件夹是没有大小的，所以不能获取文件夹大小
     * 如果构造方法的路径不存在，则返回length为0
     */
    private static void getLength() {
        File file = new File("/Users/zhouming/workspace/SunShinezm/javabase/src/main/resources/a.txt");
        System.out.println(file.length());

        File file1 = new File("2.txt");
        System.out.println(file1.length());
    }

    /**
     * file.exists()
     * 判断文件/文件夹是否存在
     *
     * @return
     */
    private static boolean judgeExist(String path) {
        File file = new File(path);
        return file.exists();
    }

    /**
     * 判断是否是文件夹
     *
     * @param path
     * @return
     */
    private static boolean isDirectory(String path) {
        File file = new File(path);
        return file.isDirectory();
    }

    /**
     * 判断是否是文件
     *
     * @param path
     * @return
     */
    private static boolean isFile(String path) {
        File file = new File(path);
        return file.isFile();
    }
}

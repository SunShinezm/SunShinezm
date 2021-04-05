package com.java.base.io.file;

import java.io.File;

/**
 * public String[] list(FilenameFilter filter)
 * 返回由包含在目录中的文件和目录的名称所组成的字符串数组，这一目录是通过满足指定过滤器的抽象路径名来表示的。
 * <p>
 * public File[] listFiles()
 * 返回一个抽象路径名数组，这些路径名表示此抽象路径名所表示目录中的文件。
 * <p>
 * 遍历文件夹
 */
public class Demo03File {
    public static void main(String[] args) {
        list("dir");
        list("dir");
    }

    /**
     * 遍历文件和文件夹,获取当前目录下面的文件和文件夹
     *
     * @param path
     * @return
     */
    private static String[] list(String path) {
        File file = new File(path);
        String[] strs = file.list();
        for (String str : strs) {
            System.out.println(str);
        }
        return strs;
    }

    private static File[] listFiles(String path) {
        File file = new File(path);
        File[] strs = file.listFiles();
        for (File str : strs) {
            System.out.println(str);
        }
        return strs;
    }
}

package com.java.base.io.file;

import java.io.File;
import java.io.IOException;

/**
 * 创建删除文件
 * public boolean createNewFile() throws IOException
 * 当且仅当不存在具有此抽象路径名指定的名称的文件时，原子地创建由此抽象路径名指定的一个新的空文件。
 * <p>
 * public boolean delete()
 * 删除此抽象路径名表示的文件或目录
 * <p>
 * public boolean mkdir()
 * 创建此抽象路径名指定的目录。
 * <p>
 * public boolean mkdirs()
 * 创建此抽象路径名指定的目录，包括创建必需但不存在的父目录。
 */
public class Demo02File {
    public static void main(String[] args) {
        System.out.println(createFile("a.txt"));
        System.out.println(deleteFile("a.txt"));
        System.out.println(createDir("dir"));
        System.out.println(createDirs("dir/111/222"));
    }

    /**
     * 当不存在这个文件时，才创建
     *
     * @param path
     * @return
     */
    public static boolean createFile(String path) {
        File file = new File(path);
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deleteFile(String path) {
        File file = new File(path);
        return file.delete();
    }

    /**
     * 只能创建一个文件夹，不能一次创建多层目录
     *
     * @param pathDir
     * @return
     */
    public static boolean createDir(String pathDir) {
        File file = new File(pathDir);
        return file.mkdir();
    }

    public static boolean createDirs(String pathDir) {
        File file = new File(pathDir);
        return file.mkdirs();
    }
}

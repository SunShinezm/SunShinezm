package com.java.base.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件过滤器优化
 * java.io.FileNameFilter接口
 * 作用：可以过滤文件名称
 * 抽象方法：用籁过滤文件名称
 * accept(File dir,String name)
 * dir:便利的目录，name文件/文件夹名称
 * public String[] list(FilenameFilter filter)
 * 返回由包含在目录中的文件和目录的名称所组成的字符串数组，
 * 这一目录是通过满足指定过滤器的抽象路径名来表示的。
 * <p>
 * <p>
 * java.io.FileFilter接口
 * 作用：用于过滤文件（file对象）
 * 抽象方法：用来过滤文件方法
 * accept(File pathname)
 * <p>
 * public File[] listFiles(FileFilter filter)
 * 返回表示此抽象路径名所表示目录中的文件和目录的抽象路径名数组，这些路径名满足特定过滤器。
 */
public class Demo03Filter {
    public static void main(String[] args) {
        getAllFile("/Users/zhouming/workspace/SunShinezm");
    }

    public static void getAllFile(String path) {
        File file = new File(path);
        List<File> files = new ArrayList<>();
        getFileList(file, files);
        for (File file1 : files) {
            System.out.println(file1.getName());
        }

    }

    /**
     * 递归方法
     * @param file
     * @param list
     */
    /*public static void getFileList(File file,List<File> list){
        if(file!=null){
            File[] fileList= file.listFiles();
            if(fileList!=null&&fileList.length>0){
                for(File arg:fileList){
                    list.add(arg);
                    getFileList(arg,list);
                }
            }
        }
    }*/


    /**
     * 过滤出java结尾的文件
     *
     * @param file
     * @param list
     */
    public static void getFileList(File file, List<File> list) {
        if (file != null) {
            //用fileFilter接口
            /*File[] fileList = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if(pathname.isDirectory()){
                        return true;
                    }
                    if(pathname.getName.toUpperCase().endsWith(".JAVA")){
                        return true;
                    }
                    return false;
                }
            });*/
            //用fileNameFilter
            /*File[] fileList = file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return new File(dir,name).isDirectory()||name.toUpperCase().endsWith(".JAVA");
                }
            });*/
            //lambda 表达式 fileFIlter
            File[] fileList = file.listFiles(filename -> {
                return filename.isDirectory() || filename.getName().toUpperCase().endsWith(".JAVA");
            });
            if (fileList != null && fileList.length > 0) {
                for (File arg : fileList) {
                    list.add(arg);
                    getFileList(arg, list);
                }
            }
        }
    }
}


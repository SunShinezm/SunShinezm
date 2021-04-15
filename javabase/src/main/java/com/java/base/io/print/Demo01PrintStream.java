package com.java.base.io.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * java.io.PrintStream ：打印流
 * PrintStream 为其他输出流添加了功能，使他们能够方便的打印出各种数据表示形式
 * <p>
 * printStream特点：
 * 1。只负责数据的输出，不负责数据的读取
 * 2。与其他输出流不同，PrintStream 永远不会跑出 IOException
 * 3。特有方法，print，println 方法
 * <p>
 * PrintStream extends OutPutStream
 * <p>
 * 注意：
 * 如果继承自父类的write方法写数据，那么查看数据的时候会查询编码表  97-》a
 * 如果使用的自己特有的print/println方法写数据，写扽数据原样输出  97-》97
 */
public class Demo01PrintStream {
    public static void main(String[] args) {
        try {
            System.out.println("我在控制台输出");
            PrintStream ps = new PrintStream("b1.txt");
            System.setOut(ps);
            System.out.println("我在打印流的目的地输出");
            ps.write(97);
            ps.println(97);
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

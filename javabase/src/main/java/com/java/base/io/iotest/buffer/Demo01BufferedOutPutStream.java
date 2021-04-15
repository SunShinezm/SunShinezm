package com.java.base.io.iotest.buffer;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutPutStream {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e.txt"));
            bos.write("你好啊xxx".getBytes());
            bos.flush();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

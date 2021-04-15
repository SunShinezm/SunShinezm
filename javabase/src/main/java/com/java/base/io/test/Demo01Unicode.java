package com.java.base.io.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 对编码操作，编码/解码
 */
public class Demo01Unicode {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("e.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

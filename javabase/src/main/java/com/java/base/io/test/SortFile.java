package com.java.base.io.test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SortFile {
    /**
     * 对文本根据序号进行排序
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            BufferedReader bis = new BufferedReader(new FileReader("a.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("acopy.txt"));
            Map<String, String> map = new HashMap<>();
            String str = null;
            while ((str = bis.readLine()) != null) {
                String index = str.substring(0, str.indexOf("."));
                map.put(index, str);
            }
            Set<Map.Entry<String, String>> set = map.entrySet();
            for (Map.Entry<String, String> entry : set) {
                String value = entry.getValue();
                bw.write(value);
                bw.newLine();//写换行
            }
            bw.flush();
            bw.close();
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

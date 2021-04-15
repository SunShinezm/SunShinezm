package com.java.base.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * java.util.Properties 集合  extends HashTable<K,V> implement Map<K,V>
 * Properties 类表示了一个持久的属性，Properties 可以保存在流中或从流中加载
 * <p>
 * Properties 集合是一个唯一和IO流结合的集合
 * 可以使用Properties集合中的方法store，把集合中的临时数据，持久化的写到硬盘中存储
 * 可以受用Properties集合中的 load方法，把硬盘中保存的文件，读取到集合中使用
 * <p>
 * 属性列表中，每个健对应的都是一个字符串
 * Properties集合是一个双列集合，key和value 默认都是字符串
 */
public class Demo01Properties {

    public static void main(String[] args) {
        //show01();
        loadProperties();
    }

    /**
     * 使用properties存储数据，遍历取出properties的数据
     * <p>
     * setProperty(String key,String value)
     * getProperty(String key)
     * set<String> stringPropertyNames() 返回此集合的键集
     */
    public static void show01() {
        Properties properties = new Properties();
        properties.setProperty("jdbcKey", "jdbcProperties");
        properties.setProperty("mysqlKey", "mySqlProperties");
        for (String key : properties.stringPropertyNames()) {
            System.out.println(properties.getProperty(key));
        }
        try {
            //comments 不能使用中文，因为会产生乱码，因为他的编码是unicode编码，一般使用""字符串
            properties.store(new FileWriter("c.txt"), "测试properties属性");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("c.txt"));
            for (String key : properties.stringPropertyNames()) {
                System.out.println("读取的key:" + key + ",value:" + properties.getProperty(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

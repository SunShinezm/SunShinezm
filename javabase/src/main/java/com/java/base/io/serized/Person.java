package com.java.base.io.serized;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 3266830950645952637L;

    private String name;

    private Integer age;

    private String school;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

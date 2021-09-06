package com.wdm;

import java.io.Serializable;

/**
 * @author wdm
 * @ Date: 2021/9/6 17:20
 * @ Description:
 * @ version:1.0
 */
public class Student implements Serializable {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

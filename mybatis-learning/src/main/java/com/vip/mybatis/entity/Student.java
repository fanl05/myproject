package com.vip.mybatis.entity;

import java.io.Serializable;

/**
 * @author Ryland
 */
public class Student implements Serializable {

    private String name;

    private int age;

    private String major;

    private String hometown;

    public Student(String name, int age, String major, String hometown) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.hometown = hometown;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}

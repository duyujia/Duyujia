package com.extend1.improve;
//父类，Graduate和Pupil的父类
public class Student {
    //共有属性
    public String name;
    public int age;
    public double score;

    //共有方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {

        System.out.println("小学生" + name +"年龄" +age + "成绩" + score);
    }

}

package com.extend1;

public class Graduate {
    public String name;
    public int age;
    public double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("大学生" + name + "正在写大学数学..");
    }

    public void showInfo() {
        System.out.println("小学生" + name +"年龄" +age + "成绩" + score);
    }

}

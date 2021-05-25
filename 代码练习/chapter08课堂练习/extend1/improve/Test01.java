package com.extend1.improve;


import com.extend1.Graduate;
import com.extend1.Pupil;

public class Test01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();//com.extend1.可省略
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("===================");
        com.extend1.Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
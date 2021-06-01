package com.dyj.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu jack = new Stu("jack");
        jack.payFee(100);
        Stu tom = new Stu("tom");
        tom.payFee(200);

        Stu.showFee();

    }
}

class Stu {

    private String name;//普通成员
    //定义一个静态变量，来积累学生的学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //1. 当方法使用了static修饰后，该方法就是静态方法
    //2. 静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        Stu.fee +=fee;
    }
    public static void showFee(){
        System.out.println("总学费有:" +Stu.fee);
    }
}

package com.dyj.static_.main_;

public class Main01 {
    private static String name = "教育";
    private int n1 = 100000;
    //静态方法
    public static void hi() {
        System.out.println("Main01的hi方法");
    }
    //

    public static void main(String[] args) {
        System.out.println("name=" + name);
        hi();
        //System.out.println("n1=" + n1);//静态方法不能访问静态属性
        //静态方法main要访问本类的非静态成员，需要先创建对象，再调用即可
        Main01 main01 = new Main01();
        System.out.println(main01.n1);//n1虽然是private，但在同一个类
    }
}

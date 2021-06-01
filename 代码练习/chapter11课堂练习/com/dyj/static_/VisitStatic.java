package com.dyj.static_;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.name);
        A a = new A();
        //通过对象名，类变量名
        System.out.println("a.name="+a.name);
    }
}

class A {
    //类变量
    public static String name = "教育";
}

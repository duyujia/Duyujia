package com.modifier;

public class B {
    public void say() {
        A a = new A();//A和B在同一个包下，不需要再引用
        //在同一包下，可访问public,protected和默认修饰属性或方法，不能访问private属性
        System.out.println("n1=" +a.n1 + "n2=" +a.n2 +"n3=" +a.n3);
        a.m1();
        a.m2();
        a.m3();
    }
}

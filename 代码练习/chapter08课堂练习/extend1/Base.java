package com.extend1;
//输入ctrl + H 可以看到类的继承关系
public class Base extends TopBase {

    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {//构造无参构造器
        System.out.println("父类构造器调用Base()..");
    }

    //自己写了一个有参的构造器，无参构造器会被覆盖
    public Base(String name,int age) {
        System.out.println("父类Base(String name,int age)构造器被调用");
    }

    public Base(String name) {
        System.out.println("父类Base(String name)构造器被调用");
    }

    //在父类提供一个public方法
    public int getN4() {
        return n4;
    }

    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

    void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    public void callTest400() {
        test400();

    }


}

package com.dyj.static_.interface_;

public interface AInterface {
    //写属性
    public int n1 = 10;
    //写方法
    public void hi();
    //Jdk8.0后接口可以默认方法，需要使用default关键字修饰
    default public void ok() {
        System.out.println("ok");
    }
    //Jdk8.0后接口可以有静态方法
    public static void cry(){
        System.out.println("nocry");
    }
}

package com.dyj.pkg.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car car = new Car("宝马");
        car = null;//这时car对象就是一个垃圾，垃圾回收器就会回收(销毁)对象，
        //在销毁对象前，会调用该对象的finalize方法
        //程序员就可以在finalize中，写自己的业务逻辑代码(比如释放资源：数据库连接，或者打开文件..)
        //如果程序员不重写finalize方法，那么就会调用Object类的finalize方法，即默认处理
        //如果程序员重写了finalize方法，就可以实现自己的逻辑
        System.gc();//主动调用垃圾回收器

        System.out.println("程序退出了");

    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override

    protected void finalize() throws Throwable {
        //super.finalize();//默认finalize()方法:调用的父类finalize()方法
        //写自己的逻辑代码
        System.out.println("销毁" + name);
        System.out.println("释放某些资源");
    }
}
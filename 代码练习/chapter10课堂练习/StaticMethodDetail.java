package com.dyj.static_;

public class StaticMethodDetail {
    public static void main(String[] args) {

        D.hi();//ok
        //D.say();//非静态方法，不能通过类名调用,需要先创建对象再调用
    }
}

class D {
    private int n1 = 100;
    private static int n2 = 200;
    public void say() {

    }

    public static void hi() {
        //System.out.println(this.n1);//类方法中不允许使用和对象有关的关键字，比如this和super。

    }

    public static void Hello(){
        System.out.println(n2);
        System.out.println(D.n2);
        //System.out.println(this.n2);//类方法中不允许使用和对象有关的关键字，比如this和super。
        hi();
        //say();//类方法(静态方法)只能访问静态变量或方法

    }

    public void Ok() {
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(D.n2);
        Hello();
        say();
    }
}

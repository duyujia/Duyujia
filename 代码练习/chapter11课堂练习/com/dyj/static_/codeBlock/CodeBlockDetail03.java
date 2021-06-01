package com.dyj.static_.codeBlock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();//1.AAA()构造器被调用 2.BBB普通代码块 3.BBB()构造器被调用
    }
}
class AAA{
    public AAA() {
        System.out.println("AAA()构造器被调用");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB普通代码块");
    }

    public BBB() {
        System.out.println("BBB()构造器被调用");
    }
}

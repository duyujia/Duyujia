package com.dyj.static_.codeBlock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        AA aa = new AA();//1.getN1被调用 2.A静态代码块01 3.getN2被调用 4.A普通代码块01 5.AA()构造器被调用

    }
}

class AA {
    private int n2 = getN2();
    {
        System.out.println("A普通代码块01");
    }

    //静态属性初始化
    private static int n1 = getN1();
    static {
        System.out.println("A静态代码块01");
    }

    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2被调用");
        return 200;
    }

    //无参构造器

    public AA() {
        System.out.println("AA()构造器被调用");
    }
}

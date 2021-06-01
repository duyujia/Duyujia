package com.dyj.static_.codeBlock;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new AAAAA();
        //1.进行类加载
        //1.1 先加载父类 1.2再加载子类
        //1.1.1 getVal01
        //1.1.2 BBBBB的一个静态代码块
        //1.2.1 getVal03
        //1.2.2 AAAAA的一个静态代码块
        //2.创建对象
        //2.1 从子类的构造器开始
        //2.1.1 BBBBB的一个普通代码块
        //2.1.2 getVal02
        //2.1.3 BBBBB构造器
        //2.1.4 getVal04()
        //2.1.5 AAAAA的第一个普通代码块
        //2.1.6 AAAAA构造器

        new C();
    }
}

class BBBBB{
    private static int n1= getVal01() ;
    static{
        System.out.println("BBBBB的一个静态代码块");
    }
    {
        System.out.println("BBBBB的一个普通代码块");
    }
    public int n2 = getVal02();
    public static int getVal01() {
        System.out.println("getVal01");
        return 10;
    }

    public static int getVal02() {
        System.out.println("getVal02");
        return 10;
    }

    public BBBBB() {
        //隐藏了super()和普通代码块
        System.out.println("BBBBB构造器");
    }
}

class AAAAA extends BBBBB{
    private static int n3 = getVal03();
    static {
        System.out.println("AAAAA的一个静态代码块");
    }
    public int n5 = getVal04();

    {
        System.out.println("AAAAA的第一个普通代码块");
    }

    public static int getVal03() {
        System.out.println("getVal03");
        return 10;
    }

    public int getVal04(){
        System.out.println("getVal04()");
        return 10;
    }

    public AAAAA() {
        //隐藏了super()和普通代码块
        System.out.println("AAAAA构造器");
    }
}

class C{
    private int n1 = 100;
    private static int n2 = 200;

    private void m1() {
    }

    private static void m2() {

    }

    static {
        //System.out.println(n1);//no	静态代码块只能调用静态成员
        System.out.println(n2);
        //m1();//no	静态代码块只能调用静态成员
        m2();
    }
    {
        //普通代码块可以调用任意成员
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }
}
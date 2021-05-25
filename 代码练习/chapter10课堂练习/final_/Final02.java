package com.dyj.static_.final_;

public class Final02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);

    }
}

class BBB{
    public final static int num = 1000000;// final static位置可互换
    static {
        System.out.println("BBB静态代码块执行");
    }
}
final class AAA{//如果一个类已经是final类，就没有必要再将方法修饰成final方法
//    public final void cry(){
//
//    }
}

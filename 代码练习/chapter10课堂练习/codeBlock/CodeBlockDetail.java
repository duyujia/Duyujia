package com.dyj.static_.codeBlock;

public class CodeBlockDetail {
    public static void main(String[] args) {
        //类加载情况举例
        //1.创建类对象
        A a1 = new A();

        //2.创建子类对象实例，父类也会被加载，而且，父类先被加载，子类后被加载
        A a2 = new A();

        //3.使用类的静态成员时(静态成员，静态方法)
        System.out.println(Cat.n1);

        D d = new D();
        D d1 = new D();
        System.out.println(D.n2);//999999999,静态代码块一定执行

    }
}

class D {
    public  static int n2 = 999999999;
    //静态代码块
    static {
        System.out.println("D的静态代码块1被执行..");
    }
    //静态代码块，在new对象时，被调用，而且是每创建一个对象，就调用一次，和类对否加载没有关系

    //普通代码块
    {
        System.out.println("D的普通代码块执行..");
    }

}


class Cat{
    public static int n1 = 999;//静态属性

    //静态代码块
    static {
        System.out.println("Cat的静态代码块1被执行..");
    }
}

class B {
    //静态代码块
    static {
        System.out.println("B的静态代码块1被执行..");
    }
}

class A extends B{
    //静态代码块
    static{
        System.out.println("A的静态代码块1被执行..");
    }

}

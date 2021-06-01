package com.dyj.static_.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        //new IA();接口本身就是一个抽象概念，不能被实例化
        System.out.println(IB.n1);//可以通过类名访问，说明n1是static的
        //IB.n1 = 2;//说明n1是final

    }
}

interface IA{
    void say();
    void hi();
}

class Cat implements IA{
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

//抽象类实现接口，可以不用实现接口的方法
abstract class Tiger implements IA{

}

interface IB{
    int n1 = 10;//等价于public static final int n1 = 10;
    void hi();
}
interface IC{
    void say();
}

//接口不能继承其他的类，但是可以继承多个别的接口
interface ID extends IB,IC{}

//接口的修饰符只能是public和默认，这点和类的修饰符是一样的
interface IE{}//默认

class Pig implements IB,IC{
    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}
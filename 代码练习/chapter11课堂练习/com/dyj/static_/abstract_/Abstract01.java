package com.dyj.static_.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //考虑将eat()设计为抽象方法，所谓抽象方法就是没有实现的方法即没有方法体
    //当一个类中存在抽象方法，需要将该类声明为abstract类
    public abstract void eat();


}
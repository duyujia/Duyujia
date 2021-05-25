package com.dyj.pkg.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //animal编译类型就是Animal，运行类型是Dog
        Animal animal = new Dog();
        animal.cry();//cry是Dog的cry()方法

        animal = new Cat();
        animal.cry();
    }
}

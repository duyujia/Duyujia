package com.dyj.static_.Single_;


public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);

    }
}

class Cat{
    private String name;
    private static Cat cat;//默认是null
    public static int n1 = 999;
    //步骤
    //1. 仍然构造器私有化
    //2. 定义一个静态属性对象
    //3. 提供一个public的static方法，可以返回一个Cat对象
    //4.

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if(cat == null) {//如果没有创建对象
            cat = new Cat("jack");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}


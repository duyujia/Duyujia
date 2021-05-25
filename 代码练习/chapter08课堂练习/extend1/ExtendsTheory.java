package com.extend1;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);//此时按照查找规则来返回信息
        System.out.println(son.getAge());
        System.out.println(son.hobby);

        //(1) 先查看子类是否有该属性
        //(2)如果子类有这个属性，并且可以访问，则返回信息
        //(3)如果没有这个属性，就看父类有没有这个属性（如果有该属性，并且可以访问，则返回信息）
        //(4)如果父类没有就按照(3)的规则，继续找上级父类，直到Object

    }

}
class Grandpa {//爷爷类
    String name = "爷爷";
    String hobby = "旅游";

}

class Father extends Grandpa {//父类
    String name = "爸爸";
     private int age = 39;//age改成private，内存图依然有age，但是不能直接访问

     public int getAge() {
         return age;
     }
}

class Son extends Father {//子类
    String name = "儿子";
}

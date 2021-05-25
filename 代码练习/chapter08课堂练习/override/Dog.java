package com.dyj.pkg.override;

public class Dog extends Animal{
    //1.Dog 是Animal的子类
    //2.Dog的cry和Animal的cry定义形式一样(名称、返回类型、参数)
    //3.这时我们就说Dog的cry方法，重写了Animal的cry方法
    public void cry() {
        System.out.println("小狗汪汪叫..");
    }

    public String m1() {
        return null;//此时Dog子类m1()方法与Object父类的m1()也构成方法重写
    }

    //这里的Object不是String的子类，编译错误
//        public Object m2() {
//            return null;
//        }
    public BBB m3() {
        return null;
    }

    public void eat() {//子类可扩大父类方法的访问范围

    }
}

class AAA{//父类

}

class BBB extends AAA {//子类

}

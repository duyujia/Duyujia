package com.dyj.innerclass;

//演示匿名内部类的使用
public class AnonymousInterfaceClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
//        Tiger tiger = new Tiger();
//        tiger.cry();

    }
}

class Outer04{//外部类
    private int n1 = 10;
    public void method(){
        //基于接口的匿名内部类
        //1.需求：使用A接口，并创建对象。
        //1.1 传统方式是写一个类，实现该接口，并创建对象
//        Tiger tiger = new Tiger();
//        tiger.cry();
        //1.2 假设Tiger类只使用一次，后面再不使用
        //1.3 这时可以使用匿名内部类来简化开发
        //1.3.1 tiger的编译类型是A
        //1.3.2 tiger的运行类型就是匿名内部类名(xxxx)就是外部类名Outer04$1
        /*
        看底层会分配类名Outer04$1
        class xxxx implements IA{
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        }
         */
        //1.3.3 jdk底层在创建匿名内部类Outer04$1后，立即马上就创建了Outer04$1实例，并且把地址返回给tiger
        //1.3.4 匿名内部类使用一次，就不能再使用
        A tiger = new A(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        tiger.cry();
        System.out.println("tiger的运行类型=" + tiger.getClass());



        //演示基于类的匿名内部类
        //1.father编译类型是Father
        //2.father运行类型是Outer04$2
        //3.底层会创建匿名内部类
        /*
        class Outer04$2 extends Father{
        }
         */
        //4.同时也直接返回了匿名内部类Outer04$2的对象
        //5.(jack)参数列表会传递给构造器
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());//Outer04$2
        father.test();

        //基于抽象类的匿名内部类
         Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头..");
            }
        };
        animal.eat();
    }
}

interface A{//接口
    public void cry();
}

//class Tiger implements A{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤");
//    }
//}

class Father{
    public Father(String name){//构造器
        System.out.println("接收到name=" + name);
    }

    public void test(){//方法

    }
}

abstract class Animal{
    abstract void eat();
}

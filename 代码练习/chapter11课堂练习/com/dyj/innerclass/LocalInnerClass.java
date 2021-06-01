package com.dyj.innerclass;

//演示局部内部类的使用
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02hashcode=" + outer02);

    }
}

class Outer02 {
    private int n1 = 100;

    private void m2() {
        System.out.println("Outer02 m2()");
    }

    public void m1() {//方法
        //局部内部类是定义在外部类的局部位置，通常在方法
        final class Inner02 {//局部内部类,加了final表示class Inner02不能被继承

            public void f1() {
                //可以直接访问外部类的所有成员，包含私有的
                //System.out.println("n1=" + n1);
                //Outer02.this本质就是外部类的对象，即那个对象调用了m1，Outer02.this就是那个对象
                System.out.println("n1=" + n1 +"外部类的n1=" + Outer02.this.n1);//这里Outer02.this就是outer02
                System.out.println("Outer02.this hashcode=" + Outer02.this);//不写Outer02的this表示Inner02这个对象
                m2();
            }

        }

        Inner02 inner02 = new Inner02();
        inner02.f1();

//        class AA extends Inner02{}
    }
    //代码块
    {
        class Inner03{}

    }
}

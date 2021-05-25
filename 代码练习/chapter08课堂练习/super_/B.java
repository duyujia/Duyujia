package com.dyj.pkg.super_;

public class B extends A {

    public  int n1 = 888;

    public void test() {
        //Super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用super去访问爷爷类的成员
        // 如果多个基类(上级类)中都有同名的成员，使用super访问遵循就近原则。A->B ->C
        System.out.println("super.n1=" + super.n1);


    }


    //1.	访问父类的属性，但不能访问父类的private属性
    public void hi () {
        System.out.println(super.n1 + "" +super.n2 + "" +super.n3);
    }

    //2.  访问父类的方法，不能访问父类的private方法 super.方法名(参数列表)；
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
    }

    public B() {
        super("jack",10);
    }

    public void cal() {
        System.out.println("B类的cal()方法");
    }

    public void sum() {
        System.out.println("B类的sum()方法");
        //如果要调用父类的cal方法，可使用以下三种方法
        //找cal方法时(cal(),this.cal())，顺序是：
        // (1)先找本类，如果有，则调用；
        // (2)如果没有，则找父类(如果有，并且可以调用，则调用)
        //(3)如果父类没有，则继续找父类的父类，整个规则，就是一样的，直到Object类
        //提示：如果查找方法的过程中，找到了，但是不能访问，就报错
        //     如果查找方法的过程中,没有找到，则提示方法不存在
        //cal();//方法一
        this.cal();//方法二：等价cal
        //super.cal();//方法三：找cal方法的顺序是跳过本类，直接查找父类，其他的规则一样

        //演示访问属性的规则
        //n1和this.n1查找的规则是
        //(1) 先找本类，如果有，则调用
        //(2) 如果没有，则找父类(如果有，并且可以调用，则调用)
        //(3)如果父类没有，则继续找父类的父类，整个规则，就是一样的，直到Object类
        //提示：如果查找属性的过程中，找到了，但是不能访问(private)，就报错
        //     如果查找属性的过程中,没有找到，则提示方法不存在
        System.out.println(n1);//方法一
        System.out.println(this.n1);//方法二
        System.out.println(super.n1);//方法三：找cal方法的顺序是跳过本类，直接查找父类，其他的规则一样



    }
    }




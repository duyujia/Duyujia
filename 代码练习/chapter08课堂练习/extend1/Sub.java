package com.extend1;

public class Sub extends Base{//子类
    public Sub() {//构造器
        //super();//父类为无参构造器时，写不写这句话，都会默认调用父类构造器
        super("smith",30);//父类为有参构造器是，需要使用super()来指定使用父类的那个构造器
        System.out.println("子类构造器调用Sub()..");
    }

    public Sub(String name) {
        //do nothing..
        super("jack",17);
        System.out.println("子类构造器调用Sub(String name)..");
    }

    public Sub(String name,int age) {
//        //1.若要调用父类的无参构造器，如下或者什么都不写
//        super();//调用父类的无参构造器
//        System.out.println("子类构造器调用Sub(String name,int age)..");

//        //2.调用父类的Base(String name)构造器
//        super("youga");
//        System.out.println("子类构造器调用Sub(String name,int age)..");
        //3.调用父类的Base(String name,int age)构造器
        super("king",20);
        System.out.println("子类构造器调用Sub(String name,int age)..");
    }

    public void sayOk() {
        //非私有属性和方法可以在子类直接访问
        System.out.println(n1 + n2 +n3);
        test100();
        test200();
        test300();
        //test400()错误，要通过父类提供的公共的方法去访问
        System.out.println("n4=" + getN4());
        callTest400();
    }

}

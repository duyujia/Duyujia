package com.dyj.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        //外部其他类访问静态内部类
        //方法一
        //因为静态内部类是可以通过类名直接访问访问的，前提是满足访问权限
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        System.out.println("===================================");
        //方法二:非静态方法
        //编写一个方法可以返回静态内部类的实例
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.say();
        System.out.println("==============================");
        //方法三:静态方法
        Outer10.Inner10 inner102 = Outer10.getInner10_();//不需创建Outer10对象实例
        inner102.say();

    }
}
class Outer10 {
    private int n1 = 10;
    public static String name = "jack";
    private static void cry(){}

    //Inner10就是静态内部类
    //1.放在外部类的成员位置
    //2.使用static修饰
    //
    static class Inner10{
        private static String name = "教育";
        public void say(){
            //System.out.println(n1);//静态类不能访问非静态属性
            //3.可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
            System.out.println(name +" 3"+"外部类name=" +Outer10.name);
            cry();
        }
    }

    public void m1(){
        Inner10 inner10 = new Inner10();//创建对象
        inner10.say();
    }

    public Inner10 getInner10(){
        return new Inner10();
    }

    public static Inner10 getInner10_(){//也可写成静态的
        return new Inner10();
    }

}
package com.dyj.innerclass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //外部其他类访问成员内部类
        //第一种方式
        //outer08.new Inner08():相当于把new Inner08()当做是outer08成员
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();
        //第二种方式
        //在外部类中编写一个方法，可以返回Inner08对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
        //第三种方式
        new Outer08().new Inner08();

    }
}

class Outer08{
    private int n1 = 10;
    public String name = "jack";
    public void hi(){
        System.out.println("hi~");
    }

    class Inner08{//成员内部类没有写在方法或代码块中
        private double sal = 99.9;
        private int n1 = 999;//就近原则
        public void say(){
            //可以直接访问外部类的所有成员，包含私有的
            //如果成员内部类的成员和外部类的成员重名，就会遵守就近原则
            //可以通过 外部类名.this.属性 来访问外部类的成员
            System.out.println("n1=" + n1 + "name=" + name + "外部类的n1=" + Outer08.this.n1);
            hi();
        }
    }

    //该方法返回一个Inner08实例
    public Inner08 getInner08Instance(){
        return new Inner08();
    }

    public void t1(){
        //使用成员内部类
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}

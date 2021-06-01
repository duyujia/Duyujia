package com.dyj.static_.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println("hello");

    }
}
abstract class H{
    public abstract void hi();//抽象方法
    //抽象方法不能使用private、final、 static来修饰，因为这些关键字都是和重写相违背的
//    private abstract void hi1();
//    public final abstract void hi2();
//    public static abstract void hi11();
}

abstract class D{
    public int n1 = 10;
    public static String name = "教育";
    public void hi(){
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok(){
        System.out.println("ok");
    }
}
abstract class E{
    public abstract void hi();
}

abstract class F extends E{

}

class G extends E{
    @Override
    public void hi() {//这里相当于子类G实现了父类G的抽象方法，所谓实现方法，就是有方法体
    }
}

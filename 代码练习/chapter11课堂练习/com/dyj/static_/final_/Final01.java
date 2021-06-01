package com.dyj.static_.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
//        e.Tax = 0.09;//当不希望类的某个属性的值被修改，可以用final修饰
        C c = new C();
        new EE().cal();//如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承

    }
}

//如果我们要求A类不能被其他类继承，可以使用final修饰A
final class A{

}

class C{
    public final void hi() {

    }
}

//class D extends C{
//    @Override
//    public void hi() {
//        super.hi();
//        System.out.println("重写C类的say()方法");
//    }
//}
class E{
    public final double Tax = 0.08;
}

class F{
    public void cry(){
        //这时，NUM也称为局部常量
        final double NUM = 0.01;
//        NUM = 0.9
        System.out.println("NUM=" + NUM);
    }
}

class AA{
    public final double TAX_RATE = 0.08;//定义时赋值
    public final double TAX_RATE2;//在构造器赋值
    public final double TAX_RATE3;//代码块赋值

    public AA() {
        TAX_RATE2 = 1.1;
    }

    {
        TAX_RATE3 = 0.8;
    }
}

class BB {
    public static final double TAX_RATE = 99.99;
    public static final double TAX_RATE2;
    //不能在构造器中赋值
//    public BB() {
//        TAX_RATE2 = 99.99;
//    }

    static {
        TAX_RATE2 = 3.3;
    }
}

class CC{

}

class DD{
    public final void cal(){
        System.out.println("cal()方法");
    }
}

class EE extends DD{

}
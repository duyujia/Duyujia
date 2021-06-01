package com.dyj.static_.interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {

    }
}

interface A1{
    int x = 0;//等价于public static final int x = 0;
}
class B{
    int x = 1;//普通属性
}
class C extends B implements A1{
    public void pX(){
        //System.out.println(x);//no,不明确x是谁
        //可以明确的指定x
        //访问接口的x就使用A1.x
        //访问父类的x就使用super.x
        System.out.println(A1.x + super.x);

    }

    public static void main(String[] args) {
        new C().pX();
    }
}

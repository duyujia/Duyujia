package com.dyj.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();

        //传递的是实现了Bell接口的匿名内部类
        //重写了ring方法
        //相当于bell接收了
        /*
        (new Bell() {
            @Override
            public void ring() {
                System.out.println("起床啦");
            }
        });

         */
        cellphone.Clock(new Bell() {
            @Override
            public void ring() {
                  System.out.println("起床啦");
            }
        });

        cellphone.Clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课啦");
            }
        });
    }
}

interface Bell{
    void ring();
}

class Cellphone {
    public void Clock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }

}
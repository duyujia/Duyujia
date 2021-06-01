package com.dyj.static_.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        circle circle = new circle(5.0);
        System.out.println("面积=" + circle.calArea());

    }
}

class circle{
    private double radius;
    private final double PI;//private final double PI = 3.14;

    //构造器
    public circle(double radius) {
        this.radius = radius;
        PI = 3.14;
    }

//    //代码块
//    {
//        PI = 3.14;
//    }

    public double calArea(){
        return PI * radius * radius;
    }

}

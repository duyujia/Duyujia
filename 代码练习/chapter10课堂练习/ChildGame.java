package com.dyj.static_;

public class ChildGame {
    public static void main(String[] args) {

        //定义一个变量，统计多少个小孩加入游戏
        //int count = 0;
        Child jack = new Child("jack");
        jack.join();
        //count++;
        jack.count++;
        Child tom = new Child("tom");
        tom.join();
        //count++;
        tom.count++;
        Child marry = new Child("marry");
        marry.join();
        //count++;
        marry.count++;
        System.out.println("共有" + Child.count +"个小孩加入游戏");//类变量可直接用类名访问
        System.out.println("jack.count=" + jack.count);
        System.out.println("tom.count=" + tom.count);
        System.out.println("marry.count=" + marry.count);

    }
}
class Child {
    private String name;
    //定义一个变量count，是一个类变量(静态变量)static
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name +"加入了游戏");
    }
}
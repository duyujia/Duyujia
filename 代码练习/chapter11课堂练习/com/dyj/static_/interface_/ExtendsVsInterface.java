package com.dyj.static_.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey jack = new LittleMonkey("jack");
        jack.climbing();
        jack.swimming();
        jack.flying();
    }
}

class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name + "猴子会爬树..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//接口
interface Fishable{
    void swimming();
}
interface Birdable{
    void flying();
}

//继承
class LittleMonkey extends Monkey implements Fishable,Birdable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习，可以像鱼儿一样游泳");

    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习，可以像鸟儿一样飞翔");

    }
}
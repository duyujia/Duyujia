package com.dyj.static_.codeBlock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
        System.out.println("===============================================");
        Movie movie1 = new Movie("唐探3", 100, "陈思诚");
    }

}

class Movie{
    private String name;
    private double price;
    private String director;

    //3个构造器->重载
    //(1)几个构造器都有相同的语句
    //(2)代码看起来冗余
    //(3)我们可以把相同的语句放到一个代码块中
    //(4)这样当我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
    //(5)代码块调用的优先级高于构造器
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影正式开始");
        //;可省略
    };

    public Movie(String name) {
        System.out.println("构造器Movie(String name)调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("构造器Movie(String name, double price)调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("构造器Movie(String name, double price, String director)调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }


}

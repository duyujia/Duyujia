package com.dyj.static_.Single_;

public class SingleTon {
    public static void main(String[] args) {
        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }

}
class GirlFriend{
    private String name;
    //为了能在静态方法中返回gf对象，需要将其修饰为static
    private static GirlFriend gf = new GirlFriend("marry");
    //保障只能创建一个GirlFriend对象
    //饿汉式单例步骤：
    //1.构造器私有化
    //2.在类的内部直接创建一个对象
    //3.提供一个公共的static方法，返回gf对象
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
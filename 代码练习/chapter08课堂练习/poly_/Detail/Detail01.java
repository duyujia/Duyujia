package com.dyj.pkg.poly_.Detail;

public class Detail01 {
    public static void main(String[] args) {
        Base base = new Sub();//向上转型
        System.out.println(base.count);
        Sub sub = new Sub();
        System.out.println(sub.count);
    }
}

class Base{
    int count = 10;
}

class Sub extends Base {
    int count = 20;
}

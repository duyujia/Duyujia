package com.dyj.pkg.poly_.Detail;

public class Detail02 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b instanceof B);
        System.out.println(b instanceof A);

        A a = new B();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);

        Object obj = new Object();
        System.out.println(obj instanceof A);
        String str = "hello";
        System.out.println(str instanceof Object);

    }
}

class A{}
class B extends A{}

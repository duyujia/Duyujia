package com.dyj.pkg.object_;

public class HashCode {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        A a2= a;
        System.out.println("a.hashCode=" + a.hashCode());
        System.out.println("a1.hashCode=" + a1.hashCode());
        System.out.println("a2.hashCode=" + a2.hashCode());
    }
}
class A {

}

class B{

}
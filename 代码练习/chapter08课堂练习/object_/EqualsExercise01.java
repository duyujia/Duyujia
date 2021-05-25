package com.dyj.pkg.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack",10,'男');
        //System.out.println(person1.equals(person2));//假，比较两个是不是一个对象
        System.out.println(person1.equals(person2));//真

    }
}
 class Person {
     private String name;
     private int age;
     private char gender;

     public Person(String name, int age, char gender) {
         this.name = name;
         this.age = age;
         this.gender = gender;
     }

     //重写Object的equals方法
     public boolean equals(Object obj) {
         //1.如果两个对象是同一个对象，则直接返回true
         if(this == obj) {
             return true;
         }
         //2.判断是不是Person,如果是才比较
         if(obj instanceof Person) {

             //进行类型转换：向下转型以得到obj的各个属性
             Person p = (Person)obj;
             return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
         }
         return false;
     }

     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public char getGender() {
         return gender;
     }

     public void setGender(char gender) {
         this.gender = gender;
     }


 }



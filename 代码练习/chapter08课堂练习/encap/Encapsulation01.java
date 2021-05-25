package com.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        //person.salary;//不能用person.salary直接查看工资，只能使用person.getSalaryl来查看


        //使用构造器指定属性
        Person smith = new Person("smith", 2000, 5000);
        System.out.println(smith.info());



    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    //有三个属性的构造器
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

        //我们可以将set方法写在构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //构造器
    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >=2 && name.length() <=6) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄设置需要在1-120，默认年龄17");
            this.age = 18;
        }
    }

    public double getSalary() {
        //可以增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法，返回属性信息
    public String info() {
        return "信息为 name=" + name + "age=" + age + "薪水=" +salary;
    }
}

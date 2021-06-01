package com.dyj.static_.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", "123456", 9999999);
        jack.setBonus(80000);
        jack.work();
        CommonEmployee tom = new CommonEmployee("tom", "123456", 99999);
        tom.work();

    }
}
abstract class Employee{
    private String name;
    private String id;
    private double Salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public abstract void work();


}

class Manager extends Employee{
    private double bonus;
    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");
    }
}

class CommonEmployee extends Employee{
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中");
    }
}
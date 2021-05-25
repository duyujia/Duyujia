package com.dyj.pkg.poly_.polyarameter;

public class Woker extends Employee{
    public Woker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() +"正在工作");
    }

    public double getAnnual() {
        return super.getAnnual();
    }
}

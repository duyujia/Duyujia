package com.dyj.pkg.poly_.polyarameter;

public class PolyParameter {
    public static void main(String[] args) {

        Woker tom = new Woker("tom",2500);
        Manager milan = new Manager("milan",500000,200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);
        polyParameter.testWork(tom);

    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    //添加一个方法，如果是普通员工，调用work方法；如果是经理，调用manage方法
    public void testWork(Employee e) {
        if (e instanceof Woker) {
            ((Woker) e).work();//向下转型
        } else if(e instanceof Manager) {
            ((Manager) e).manage();
        } else {}

    }
}

/**
 * @auther dyj
 */
public class homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculate() {//匿名内部类最经典的使用就是可以作为一个参数传进去
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8);

        cellphone.testWork(new Calculate() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },10,8);
    }
}

/*
匿名内部类是：
new Calculate() {//匿名内部类最经典的使用就是可以作为一个参数传进去
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },同时，也是一个对象
        这个匿名内部类会传给Calculate calculate
        calculate的运行类型就是匿名内部类,编译类型是Calculate
 */

interface Calculate{
    //work方法是完成计算。但是题没有具体要求，所以自己设计
    //至于该方法是怎样完成的，交给匿名内部类完成
    public double work(double n1,double n2);
}
class Cellphone{
    //当我们调用testWork方法时，直接传入一个实现了Calculate接口的匿名内部类即可
    //该匿名内部类，可以灵活的实现work，完成不同的计算任务
    public void testWork(Calculate calculate,double n1,double n2){
        double result = calculate.work(n1, n2);//动态绑定类型，又回到calculate匿名内部类work方法
        System.out.println("计算结果=" + result);

    }
}

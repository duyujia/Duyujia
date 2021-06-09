import houserent.House;

/**
 * @auther dyj
 */
public class homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();//一般情况
        tang.passRiver();//过河
        tang.passMountain();
        tang.common();//一般情况
        tang.passMountain();
        tang.passRiver();//过河
    }
}

interface Vehicles{
    public void work();

}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般骑马");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("过河乘船");
    }
}

class Plane implements Vehicles{
    @Override
    public void work() {
        System.out.println("坐飞机过火焰山");
    }
}
class Factory{//使用static，不用创建Factory对象
    //马儿始终是同一匹
    private Factory(){};//构造器私有化，不让其创建Factory对象
    private static Horse horse = new Horse();//饿汉式
    public static Horse getHorse(){
//        return new Horse();//马儿始终是同一匹,不用每次都新创建
        return horse;
    }

    public static Boat getBoat(){
       return new Boat();
    }

    public static Plane getPlane(){
        return new Plane();
    }
}

class Person{
    private String name;
    private Vehicles vehicles;

    //在创建人对象时，事先给他分配一个交通工具


    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    //这里的编程思路：可以把具体的要求，封装成方法
    public void passRiver(){
        //先得到船
//        Boat boat = Factory.getBoat();
//        boat.work();
        //如果当前vehicles属性是null，就获取一匹马
        if(!(vehicles instanceof Boat)){
            //这里使用的是多态(向上转型)
            vehicles = Factory.getBoat();
        }
        //这里体现接口调用
        vehicles.work();


    }

    public  void common(){
        //为防止在创建人对象时赋的交通工具浪费，判断一下当前的vehicle属性是否已经存在了
        //如果当前vehicles属性是null，就获取一匹马
        //如何防止始终使用马
//        if(vehicles ==null){
        //vehicles instanceof Horse:判断当前的vehicles是不是Boat
        //(1)vehicles ==null||vehicles ==Boat:vehicles instanceof Horse==>false
        //(2)vehicles ==Horse:vehicles instanceof Horse==>true
        if(!(vehicles instanceof Horse)){
            //这里使用的是多态(向上转型)
            vehicles = Factory.getHorse();
        }
        //这里体现接口调用
        vehicles.work();
    }

    public void passMountain(){
        if(!(vehicles instanceof Plane)){
            vehicles = Factory.getPlane();
        }
        vehicles.work();
    }
}
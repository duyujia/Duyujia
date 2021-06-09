import com.sun.xml.internal.fastinfoset.util.ValueArrayResourceException;

/**
 * @auther dyj
 */
public class homework07 {
    public static void main(String[] args) {
        //实例化不同的Air对象
//        Car1 car1 = new Car1(60);
//        car1.getAir().flow();
        Car1 car11 = new Car1();
        car11.getAir().flow(26);
    }

}

class Car1{
    private double temperature;

    //温度要初始化，所以提供构造器
//    public Car1(double temperature) {
//        this.temperature = temperature;
//    }

    //成员内部类Air
    class Air{
        public void flow(double temperature){
            if(temperature > 40){
                System.out.println("吹冷风");
            } else if (temperature < 0){
                System.out.println("吹暖气");
            } else {
                System.out.println("关掉空调");
            }
        }
    }

    //提供一个方法，返回Air对象
    public Air getAir(){
        return new Air();
    }
}

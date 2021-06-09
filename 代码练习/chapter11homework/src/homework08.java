/**
 * @auther dyj
 */
public class homework08 {
    public static void main(String[] args) {
        //枚举switch的匹配使用
        Color green = Color.GREEN;
        green.show();

        //使用switch
        //可以拿一个枚举对象根每个case(在枚举类中定义的枚举对象)比较
        switch (green){
            case RED:
                System.out.println("匹配到红色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;

        }
    }
}
interface Aa{
    public void show();
}
enum Color implements Aa{
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为：" + redValue + "\t" + greenValue + "\t" + blueValue);
    }
}
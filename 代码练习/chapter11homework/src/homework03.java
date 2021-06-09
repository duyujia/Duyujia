/**
 * @auther dyj
 */
public class homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();//向上转型，让父类的一个变量名指向子类对象
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}

abstract class Animal{
    public abstract void shout();
}

class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}

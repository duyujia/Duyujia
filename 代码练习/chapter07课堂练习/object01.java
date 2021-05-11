public class object01 {
	public static void main(String[] args) {

		//1.new Cat()创建一只猫
		//2.Cat cat1 = new Cat() 把创建的猫赋给cat1
		Cat cat1 = new Cat();//cat1是对象名（对象引用）,new Cat()创建的对象空间(数据)才是真正的对象
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		//访问对象属性
		System.out.println("第1只猫信息" + cat1.name + " " + cat1.age + " " + cat1.color);
		System.out.println("第2只猫信息" + cat2.name + " " + cat2.age + " " + cat2.color);
	}
} 

class Cat {
	String name;
	int age;
	String color;
} 
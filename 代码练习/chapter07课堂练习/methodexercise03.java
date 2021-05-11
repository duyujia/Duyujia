public class methodexercise03 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "mainn";
		p1.age = 100;
		Mytools tools = new Mytools();
		Person p2 = tools.copyperson(p1);

		//到此p1,p2是两个独立的对象，属性相同
		System.out.println("p1的属性 age=" + p1.age + "名字=" + p1.name);
		System.out.println("p2的属性 age=" + p2.age + "名字=" + p2.name);
		//可以通过对象比较看看是否为一个对象
		System.out.println(p1 == p2);

	}
}
class Person {
	String name;
	int age;
}
class Mytools {
	//编写思路
	//1.方法的返回类型
	//2.方法的名字
	//3.方法的形参
	//4.方法体，创建一个新的对象，并复制属性返回即可
	public Person copyperson(Person p) {
		Person p2 = new Person();
		//把原来对象的属性值赋给新的对象
		p2.name = p.name;
		p2.age = p.age;
		return p2;

	}
}
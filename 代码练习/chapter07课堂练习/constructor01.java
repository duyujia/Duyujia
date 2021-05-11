public class constructor01 {
	public static void main(String[] args) {

		//当我们new一个对象时，直接通过构造器指定名字和年龄
		Person t1 = new Person("smith",80);
		Person t2 = new Person("tom");
		System.out.println("t对象的name" + t1.name);
		System.out.println("t对象的age" + t1.age);
		System.out.println("t对象的name" + t2.name);
		System.out.println("t对象的age" + t2.age);
		//t1.person()调用构造器是不行
		Dog d1 = new Dog();//显示定义无参构造器了可以使用


		

	}
}

class Dog {

	//如果程序员没有定义构造器，系统会自动给类生成一个默认无参参构造器
	/* Dog() {

	 }*/ 

	 public Dog(String dname) {
	 	//...
	 }

	 Dog() {//显示定义一下无参构造器

	 }
}

class Person {

	String name;
	int age;
	//1.构造器没有返回值，也不能写void
	//2.构造器的名称和类person一样
	//3.(String pname,int page)是构造器形参列表，规则和成员方法一样

	public Person(String pname,int page) {
		System.out.println("构造器被调用,完成对象属性的初始化");
		name = pname;
		age = page;
	}

	public Person(String p1name) {
		System.out.println("构造器2完成对象属性的初始化");
		name = p1name;

	}

}
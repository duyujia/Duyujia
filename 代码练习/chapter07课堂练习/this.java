public class this {
	public static void main(String[] args) {
		Person t = new Person("大壮",17);
		System.out.println("t对象的name=" + t.name);
		System.out.println("t对象的age=" + t.age);
		


	}
}


class Person {

	String name;
	int age;
	

	public Person(String name,int age) {
		System.out.println("构造器被调用,完成对象属性的初始化");
		this.name = name;
		this.age = age;
	}


}
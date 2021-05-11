public class constructorexercise01 {
	public static void main(String[] args) {

		//当我们new一个对象时，直接通过构造器指定名字和年龄
		Person t1 = new Person();
		Person t2 = new Person("tom",17);
		System.out.println("t1对象的name=" + t1.name);
		System.out.println("t1对象的age=" + t1.age);
		System.out.println("t2对象的name=" + t2.name);
		System.out.println("t2对象的age=" + t2.age);


	}
}

class Person {
	String name;//默认值null
	int age;//默认值0

	public Person() {
		age = 18;
	}

	public Person(String pname,int page){
		name = pname;
		age = page;
	}

}		
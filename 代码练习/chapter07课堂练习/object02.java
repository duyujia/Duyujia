public class object02 {
	public static void main(String[] args) {

		Person p1 = new Person();

		//访问对象属性
		System.out.println("\n当前这个人的信息");
		System.out.println("age=" + p1.age + "name=" + p1.name + "sal=" + p1.sal + "ispass=" + p1.ispass);
	}
} 

class Person {
	int age;
	String name;
	double sal;
	boolean ispass;
}

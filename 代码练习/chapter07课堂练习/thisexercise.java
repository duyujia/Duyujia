public class thisexercise {
	public static void main(String[] args) {
		Person t1 = new Person("marry",20);
		Person t2 = new Person("smith",30);
		System.out.println(t1.compareto(t2));

		
	}
}

class Person {
	String name;
	int age;

	//¹¹ÔìÆ÷
	public Person(String name,int age) {
		this.name = name;
		this.age = age; 
	}


	public boolean compareto(Person p) {
		return this.name.equals(p.name) && this.age == p.age;

	}
}
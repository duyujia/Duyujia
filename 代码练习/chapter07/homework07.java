public class homework07 {
	public static void main(String[] args) { 
		Dog dog = new Dog("jak","white",1);
		dog.show();


	}
}

class Dog {
	String name;
	String color;
	int age;

	public Dog(String name,String color,int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show() {
		System.out.println("����Ϊ" + name + "��ɫΪ" + color + "����Ϊ" + age);
	}
}
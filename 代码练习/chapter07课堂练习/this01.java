public class this01 {
	public static void main(String[] args) {
		Person t = new Person("��׳",17);
		System.out.println("t�����name=" + t.name);
		System.out.println("t�����age=" + t.age);
		System.out.println("t��hashcode=" + t.hashCode());
		


	}
}


class Person {

	String name;
	int age;
	

	public Person(String name,int age) {
		System.out.println("������������,��ɶ������Եĳ�ʼ��");
		this.name = name;
		this.age = age;
		System.out.println("this��hashcode=" + this.hashCode());
	}


}
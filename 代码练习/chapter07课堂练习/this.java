public class this {
	public static void main(String[] args) {
		Person t = new Person("��׳",17);
		System.out.println("t�����name=" + t.name);
		System.out.println("t�����age=" + t.age);
		


	}
}


class Person {

	String name;
	int age;
	

	public Person(String name,int age) {
		System.out.println("������������,��ɶ������Եĳ�ʼ��");
		this.name = name;
		this.age = age;
	}


}
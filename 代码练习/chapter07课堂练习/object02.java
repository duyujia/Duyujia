public class object02 {
	public static void main(String[] args) {

		Person p1 = new Person();

		//���ʶ�������
		System.out.println("\n��ǰ����˵���Ϣ");
		System.out.println("age=" + p1.age + "name=" + p1.name + "sal=" + p1.sal + "ispass=" + p1.ispass);
	}
} 

class Person {
	int age;
	String name;
	double sal;
	boolean ispass;
}

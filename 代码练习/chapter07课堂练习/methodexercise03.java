public class methodexercise03 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "mainn";
		p1.age = 100;
		Mytools tools = new Mytools();
		Person p2 = tools.copyperson(p1);

		//����p1,p2�����������Ķ���������ͬ
		System.out.println("p1������ age=" + p1.age + "����=" + p1.name);
		System.out.println("p2������ age=" + p2.age + "����=" + p2.name);
		//����ͨ������ȽϿ����Ƿ�Ϊһ������
		System.out.println(p1 == p2);

	}
}
class Person {
	String name;
	int age;
}
class Mytools {
	//��д˼·
	//1.�����ķ�������
	//2.����������
	//3.�������β�
	//4.�����壬����һ���µĶ��󣬲��������Է��ؼ���
	public Person copyperson(Person p) {
		Person p2 = new Person();
		//��ԭ�����������ֵ�����µĶ���
		p2.name = p.name;
		p2.age = p.age;
		return p2;

	}
}
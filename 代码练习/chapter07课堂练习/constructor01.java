public class constructor01 {
	public static void main(String[] args) {

		//������newһ������ʱ��ֱ��ͨ��������ָ�����ֺ�����
		Person t1 = new Person("smith",80);
		Person t2 = new Person("tom");
		System.out.println("t�����name" + t1.name);
		System.out.println("t�����age" + t1.age);
		System.out.println("t�����name" + t2.name);
		System.out.println("t�����age" + t2.age);
		//t1.person()���ù������ǲ���
		Dog d1 = new Dog();//��ʾ�����޲ι������˿���ʹ��


		

	}
}

class Dog {

	//�������Աû�ж��幹������ϵͳ���Զ���������һ��Ĭ���޲βι�����
	/* Dog() {

	 }*/ 

	 public Dog(String dname) {
	 	//...
	 }

	 Dog() {//��ʾ����һ���޲ι�����

	 }
}

class Person {

	String name;
	int age;
	//1.������û�з���ֵ��Ҳ����дvoid
	//2.�����������ƺ���personһ��
	//3.(String pname,int page)�ǹ������β��б�����ͳ�Ա����һ��

	public Person(String pname,int page) {
		System.out.println("������������,��ɶ������Եĳ�ʼ��");
		name = pname;
		age = page;
	}

	public Person(String p1name) {
		System.out.println("������2��ɶ������Եĳ�ʼ��");
		name = p1name;

	}

}
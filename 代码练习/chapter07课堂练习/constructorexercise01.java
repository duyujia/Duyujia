public class constructorexercise01 {
	public static void main(String[] args) {

		//������newһ������ʱ��ֱ��ͨ��������ָ�����ֺ�����
		Person t1 = new Person();
		Person t2 = new Person("tom",17);
		System.out.println("t1�����name=" + t1.name);
		System.out.println("t1�����age=" + t1.age);
		System.out.println("t2�����name=" + t2.name);
		System.out.println("t2�����age=" + t2.age);


	}
}

class Person {
	String name;//Ĭ��ֵnull
	int age;//Ĭ��ֵ0

	public Person() {
		age = 18;
	}

	public Person(String pname,int page){
		name = pname;
		age = page;
	}

}		
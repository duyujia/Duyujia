public class varscopedetail {
	public static void main(String[] args) {
		Person t = new Person();
		t.say();//��ִ��say����ʱ��say�����ľֲ���������name,�ᴴ������sayִ����Ϻ�name�ֲ����������٣��������ԣ�ȫ�ֱ�������Ȼ����ʹ��
		T t1 = new T();
		//��1�ֿ�����ʶ������Եķ�ʽ
		t1.test();
		//��2�ֿ�����ʶ������Եķ�ʽ
		t1.test2(t);


	}
}

class T {
	//ȫ�ֱ���/���ԣ����Ա�����ʹ�ã���������ʹ�ã�ͨ��������ã�
	public void test() {
		Person p = new Person();
		System.out.println(p.name);//jack
	}

	public void test2(Person p) {
		System.out.println(p.name);
	}
}

class Person {
	String name = "jack";
	public void say() {
		String name = "king";
		System.out.println("say() name=" + name);
	}

	public void hi() {
		String address = "����";
		//String address = "�Ϻ�";//�����ظ��������
		String name = "hsp";//OK
	}

} 
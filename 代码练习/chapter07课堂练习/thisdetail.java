public class thisdetail {

	public static void main(String[] args) {
		// T t1 = new T();
		// t1.f2();
		T t2 = new T();
		t2.f3();


	}
}

class T {

	String name = "jack";
	int num = 100;

	public T() {
		this("jack",100);//������仰ȥ����T(String name,int age)������
		System.out.println("T()������");
	}

	public T(String name,int age) {
		System.out.println("T(String name,int age)������");
		
	}

	public void f1() {
		System.out.println("f1()����..");
	}

	public void f2() {
		System.out.println("f2()����..");
		//���ñ���f1
		//��һ�ַ�ʽ
		f1();
		//�ڶ��ַ�ʽ
		this.f1();
	}

	//this�ؼ��ֿ����������ʱ�������
	public void f3() {
		String name = "smith";
		//��ͳ��ʽ
		System.out.println("name=" + name + "num" + num);//����оֲ������ͷ��ʾֲ�������û�о�������
		//ʹ��this��������
		System.out.println("name=" + this.name + "num" + this.num);//������û���оֲ��������ʵĶ�������

	}


} 
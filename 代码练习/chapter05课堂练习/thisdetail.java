public class thisdetail {

	public static void main(String[] args) {
		T t = new T();
		t.f2();


	}
}

class T {

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


}
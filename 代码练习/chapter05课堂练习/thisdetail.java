public class thisdetail {

	public static void main(String[] args) {
		T t = new T();
		t.f2();


	}
}

class T {

	public void f1() {
		System.out.println("f1()方法..");
	}

	public void f2() {
		System.out.println("f2()方法..");
		//调用本类f1
		//第一种方式
		f1();
		//第二种方式
		this.f1();
	}


}
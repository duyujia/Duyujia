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
		this("jack",100);//看到这句话去访问T(String name,int age)构造器
		System.out.println("T()构造器");
	}

	public T(String name,int age) {
		System.out.println("T(String name,int age)构造器");
		
	}

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

	//this关键字可以用来访问本类属性
	public void f3() {
		String name = "smith";
		//传统方式
		System.out.println("name=" + name + "num" + num);//如果有局部变量就访问局部变量，没有就找属性
		//使用this访问属性
		System.out.println("name=" + this.name + "num" + this.num);//不管有没有有局部变量访问的都是属性

	}


} 
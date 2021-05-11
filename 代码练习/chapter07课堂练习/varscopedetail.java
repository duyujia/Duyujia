public class varscopedetail {
	public static void main(String[] args) {
		Person t = new Person();
		t.say();//当执行say方法时，say方法的局部变量比如name,会创建，当say执行完毕后name局部变量就销毁，但是属性（全局变量）任然可以使用
		T t1 = new T();
		//第1种跨类访问对象属性的方式
		t1.test();
		//第2种跨类访问对象属性的方式
		t1.test2(t);


	}
}

class T {
	//全局变量/属性：可以被本类使用，或其他类使用（通过对象调用）
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
		String address = "北京";
		//String address = "上海";//错误，重复定义变量
		String name = "hsp";//OK
	}

} 
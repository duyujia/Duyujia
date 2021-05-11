public class methodparameter02 {
	public static void main(String[] args) {
		// AA a = new AA();
		// int[] arr = {1,2,3};
		// a.testarr(arr);
		// System.out.println("main的arr数组");
		// for(int i = 0;i < arr.length;i++) {
		// 	System.out.println(arr[i] + "\t");
		// }
		// System.out.println();
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		B a = new B();
		a.testarr1(p);
		System.out.println("main的p.age=" + p.age);
	}
}

class Person {
	String name;
	int age;
}
class B {
	public void testarr1(Person p) {
		p.age = 10000;//修改对象属性
	}
}

class AA {
	public void testarr(int[] arr) {
		arr[0] = 200;
		System.out.println("testarr的arr数组");
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i] + "\t");
		}
		System.out.println();
	}
}

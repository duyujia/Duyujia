public class methodparameter02 {
	public static void main(String[] args) {
		// AA a = new AA();
		// int[] arr = {1,2,3};
		// a.testarr(arr);
		// System.out.println("main��arr����");
		// for(int i = 0;i < arr.length;i++) {
		// 	System.out.println(arr[i] + "\t");
		// }
		// System.out.println();
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		B a = new B();
		a.testarr1(p);
		System.out.println("main��p.age=" + p.age);
	}
}

class Person {
	String name;
	int age;
}
class B {
	public void testarr1(Person p) {
		p.age = 10000;//�޸Ķ�������
	}
}

class AA {
	public void testarr(int[] arr) {
		arr[0] = 200;
		System.out.println("testarr��arr����");
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i] + "\t");
		}
		System.out.println();
	}
}

public class methoddetail02 {
	public static void main (String[] args) {
		A a = new A();
		a.sayok();
		a.m1();
	}
}

class A {
	public void print(int n) {
		System.out.println("print()���������� n=" + n);
	}

	public void sayok() { //sayok����print(ֱ�ӵ��ü���)
		print(10);
		System.out.println("����ִ��sayok()~~~");
	}
}


//�����еķ���A����B�෽������Ҫͨ������������
//ִ��һ�������Ϳ���һ��ջ
public void m1() {
	//����B����Ȼ���ٵ��÷�������
	System.out.println("m1()����������");
	B b = new B();
	b.hi;
	System.out.println("m1()����ִ��");
}


class B {
	public void hi() {
		System.out.println("B���е�hi()��ִ��");
	}
}
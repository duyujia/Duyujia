public class homework11 {
	public static void main(String[] args) {
		Test t = new Test();
		
	}
}

class Test {
	double num1;
	double num2;

	public Test(double num1,double num2) {
		this.num1 = num1;
		this.num1 = num2;
	}
	public double method(double tnum1,double tnum2) {
		return num1 + num2;

	}
}


class Test01 {
	public static void main(String[] args) {
		System.out.println(method(method(10.0,20.0),100));
	}
}
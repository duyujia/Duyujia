public class overload02 {
	public static void main(String[] args) {
		Mycaculator t = new Mycaculator();
		System.out.println(t. caculate(1,2));
		System.out.println(t. caculate(1.1,2));
		System.out.println(t. caculate(1,2.1));



	}
}

class Mycaculator {

	//下面的四个caculate方法构成了重载
	public int caculate(int n1,int n2) {
		return n1 + n2;
	}

	public double caculate(int n1,double n2) {
		return n1 + n2;
	}

	public double caculate(double n1,int n2) {
		return n1 + n2;
	}

	public int caculate(int n1,int n2,int n3) {
		return n1 + n2 + n3;
	}
}
public class recursion {
	public static void main(String[] args) {
		T t = new T();
		t.test(5); 

		int res = t.factorial(5);
		System.out.println("res=" + res);

	}
}


class T {
	public void test(int n) {
		if (n > 2 ) {
			test(n-1);
		} 
		System.out.println("n=" + n);
	}

	//�׳�

	public int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return factorial (n-1) * n;
		}
	}
}
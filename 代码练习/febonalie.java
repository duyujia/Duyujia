public class febonalie {
	public static void main(String[] args) {
		T t = new T();
		int n = 7;
		//System.out.println("��n=7��Ӧ��쳲�������=" + t.sum(7));
		for (int i = 1;i <= n;i++) {
			System.out.print(t.sum(i) +"\t");
		}
	}
}

class T {
	public int sum(int n) {
		if  (n >= 1) {
			if (n == 1 ||n == 2) {
			return 1;

		} else {
			return sum(n-1) + sum(n-2);
		} 
			} else {
			System.out.println("Ҫ�������n>=1");
			return -1;

		}
		
	}
}
public class recursionexercise02 {
	public static void main(String[] args) {
		T t = new T();
		int n = 8;
		int peachnum = t.peach(n);
		if (peachnum != -1) {
			System.out.println("第" + n + "天有" + peachnum + "个桃子");

		}


	}
}

class T {
	public int peach(int n) {
		if (n ==10) {
			return 1;
		} else if (n >=1 && n <=9 ) {
			return((peach(n+1)+1)) * 2;
		} else {
			System.out.println("要求输入的n在1-10");
			return -1;
		}
	}
}
public class recursionexercise02 {
	public static void main(String[] args) {
		T t = new T();
		int n = 8;
		int peachnum = t.peach(n);
		if (peachnum != -1) {
			System.out.println("��" + n + "����" + peachnum + "������");

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
			System.out.println("Ҫ�������n��1-10");
			return -1;
		}
	}
}
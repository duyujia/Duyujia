public class methodexercise {
	public static void main(String[] args) {
		AA aa = new AA();
		if(aa.is0dd(20)) {
			System.out.println("ʵ����");

		} else {
			System.out.println("ʵż��");
				}
	}
}

class AA {
	public boolean is0dd(int num) {
		// if(num % 2 !=0  ) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		// return num % 2 !=0 ? true; false;
		return num % 2 !=0;
	}
}
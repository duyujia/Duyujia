public class assignoperator {
	
	//��дһ��main����
	public static void main(String[] args) {
		int n1 = 10;
		n1 += 4;
		System.out.println(n1);
		n1 /=3;
		System.out.println(n1);

		int a = 10;
		int b = 99;
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result);//99
		
	}
}
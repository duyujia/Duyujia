public class arithmeticoperator {
	
	//��дһ��main����
	public static void main(String[] args) {

		System.out.println(10 / 4);//java����2int
		double d = 10 / 4;//2.0double
		System.out.println(d);
		System.out.println(10.0 / 4);//2.5double

		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);  //1
		System.out.println(-10 % -3);//-1

		//+=��ʹ��
		int i = 10;
		i++;//���� �ȼ��� i = i+1
		++i;//���� �ȼ��� i = i+1
		System.out.println("i=" + i);//-1

		int j = 8;
		int k = j++;
		System.out.println("k=" + k + "j=" + j);//8 9
	}
}
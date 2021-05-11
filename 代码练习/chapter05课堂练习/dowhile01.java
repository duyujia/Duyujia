public class dowhile01{
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("你好，韩顺平教育" + i);
			i++;
		} while(i <= 10);
		System.out.println(i);
		System.out.println("退出while，继续");
w

		int j = 1;
		int sum1 = 0;
		do {
			System.out.println("j=" + j);
			j++;
			sum1 +=j;

		} while (j<=100);
		System.out.println(sum1);

		System.out.println("==============================");

		int m = 1;
		int count =0;
		do {
			if(m % 3 !=0 && m % 5 ==0) {
				count++;
			} m++;
		} while (m <= 200);
		System.out.println(count);
	}
} 
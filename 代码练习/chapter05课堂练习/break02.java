public class break02{
	public static void main(String[] args) {
		int sum = 0;
		//i的作用域在for，使用n可在for的作用域外输出
		int n = 0;
		for (int i = 1;i <=100;i++) {
			sum += i;
			if (sum > 20) {
				System.out.println("和>20时候，当前数i=" +i);
				n = i;
				break;
			}
		}
		System.out.println("和>20时候，当前数=" +n);
	}
}
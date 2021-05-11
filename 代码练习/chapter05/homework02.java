import java.util.Scanner;
public class homework02{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num1 = myscanner.nextInt();
		if(num1 > 0) {
			System.out.println("大于0");
		} else if (num1 == 0) {
			System.out.println("等于0");
		} else {
			System.out.println("小于0");
		}
	}
} 
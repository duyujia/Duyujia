import java.util.Scanner;
public class homework02{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("������һ������");
		int num1 = myscanner.nextInt();
		if(num1 > 0) {
			System.out.println("����0");
		} else if (num1 == 0) {
			System.out.println("����0");
		} else {
			System.out.println("С��0");
		}
	}
} 
import java.util.Scanner;
public class homework08 {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("������һ�����");
		int year = myscanner.nextInt();
		if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("������");

		} else {
			System.out.println("��������");
		}
	}
}
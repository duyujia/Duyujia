import java.util.Scanner;
public class if06 {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("�������·�");
		int month = myscanner.nextInt();
		if (month >=4 && month <=10) {
			System.out.println("����������");
			int age = myscanner.nextInt();
			if (age > 60) {
				System.out.println("20");
			} else if (age < 18) {
				System.out.println("30");
			} else {
				System.out.println("60");
			}

		} else {
			System.out.println("����������");
			int age = myscanner.nextInt();
			if (age >= 18 && age <=60) {
				System.out.println("40");
			} else {
				System.out.println("20");
			}

		}

	}
}
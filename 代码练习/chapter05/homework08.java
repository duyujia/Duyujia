import java.util.Scanner;
public class homework08 {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入一个年份");
		int year = myscanner.nextInt();
		if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("是闰年");

		} else {
			System.out.println("不是闰年");
		}
	}
}
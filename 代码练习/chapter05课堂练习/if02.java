import java.util.Scanner;
public class if02{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int age = myscanner.nextInt();
		if (age > 18) {
			System.out.println("你年龄大于18，要对自己的行为负责");
		} else {
			System.out.println("你的年龄不大");
		}
		System.out.println("程序继续");
	}
}
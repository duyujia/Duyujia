import java.util.Scanner;
public class if01 {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);//接收输入的年龄，应该定义一个Scanner对象
		System.out.println("请输入年龄");
		int age = myscanner.nextInt();
		if(age > 18) {
			System.out.println("你年龄大于18，要对自己的行为负责");
		}
		System.out.println("程序继续执行");
	}
}
import java.util.Scanner;
public class switch01{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入一个字符a-g");
		char c1 = myscanner.next().charAt(0);
		switch(c1) {
			case 'a':
			System.out.println("一");
			break;
			case 'b':
			System.out.println("二");
			break;
			case 'c':
			System.out.println("三");
			break;
			case 'd':
			System.out.println("四");
			break;
			case 'e':
			System.out.println("五");
			break;
			case 'f':
			System.out.println("六");
			break;
			case 'g':
			System.out.println("日");
			break;
			default:
			System.out.println("你输入的字符不正确，没有匹配的");

		}
		System.out.println("退出了switch,继续执行程序");
	}
}
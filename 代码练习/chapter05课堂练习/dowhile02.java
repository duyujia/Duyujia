import java.util.Scanner;
public class dowhile02{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("还钱吗");
			answer = myscanner.next().charAt(0);
			System.out.println("他的回答是" + answer);
		}while( answer != 'y');
		System.out.println("退出while，继续");
	}
}
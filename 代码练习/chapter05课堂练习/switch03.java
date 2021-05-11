import java.util.Scanner;
public class switch03{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入a-e");
		char c1 = myscanner.next().charAt(0);
		switch(c1) {
			case 'a':
			System.out.println("A");
			break;
			case 'b'://写成'2'也可以，'2'也为字符类型
			System.out.println("B");
			break;
			case 'c':
			System.out.println("C");
			break;
			case 'd':
			System.out.println("D");
			break;
			case 'e':
			System.out.println("E");
			break;
			default:
			System.out.println("请重新输入");
		}

		System.out.println("请输入学生成绩");
		double score = myscanner.nextDouble();
		int a = (int)(score/60);
		if (score >= 0 && score <=100) {
			switch(a) {
				case 0:
				System.out.println("不及格");
				break;
				case 1:
				System.out.println("及格");
				break;
				default:
				System.out.println("成绩要在0-100");
			}
		} else {
			System.out.println("请重新输入");
			}

		System.out.println("请输入月份");
		int month = myscanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("这是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("这是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("这是秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("这是冬季");
				break;
			default:
				System.out.println("请重新输入");
		}
	}
}
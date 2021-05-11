import java.util.Scanner; 
public class if04{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入信用分");
		int grade = myscanner.nextInt();
		//如果输入的不是整数，而是hello,后面可以使用异常处理机制搞定
		//先对输入的信用分进行一个范围的有效判断1-100，否则提示输入错误
		if(grade >=1 && grade <= 100) {
			if(grade == 100) {
				System.out.println("信用极好");
			} else if (grade >80 && grade <=99) {
				System.out.println("信用优秀");
			} else if (grade >= 60 && grade <=80) {
				System.out.println("信用一般");
			} else {
				System.out.println("信用不及格");
			}
		} else {
			System.out.println("信用分需要在1-100");
		}

	}
}
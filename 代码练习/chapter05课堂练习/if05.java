import java.util.Scanner;
public class if05{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入该歌手的成绩");
		double score = myscanner.nextDouble();
		if( score > 8.0) {
			System.out.println("请输入性别");
			char  gender = myscanner.next().charAt(0);//把字符串转换成字符
			if (gender == '男') {
				System.out.println("进入男子组");
			} else if(gender == '女') {
				System.out.println("进入女子组");
			} else {
				System.out.println("重新输入性别");
			}
		} else {System.out.println("淘汰");

		}
	}
}
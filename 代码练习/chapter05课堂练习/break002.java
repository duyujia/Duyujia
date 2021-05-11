import java.util.Scanner;
public class break002{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		int chance = 3;
		String name = "";
		String passwd = "";
		for(int i = 1;i <= 3;i++) {
			System.out.println("请输入姓名");
			name = myscanner.next();
			System.out.println("请输入密码");
	 		passwd = myscanner.next();
			//比较输入的名字和密码是否正确
			if("丁真".equals(name) && "666".equals(passwd)) {
				System.out.println("登录成功");
				break;
			}chance--;
			 System.out.println("你还有" + chance + "次登录机会" );
		}
	}
}
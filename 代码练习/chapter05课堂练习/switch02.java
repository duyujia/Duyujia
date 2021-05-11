public class switch02{
	public static void main(String[] args) {
		char c = 'a';
		switch(c) {
			case 'a':
			System.out.println("ok1");
			break;
			case 'b'://写成'2'也可以，'2'也为字符类型
			System.out.println("ok2");
			break;
			default:
			System.out.println("ok3");
		}

	}
}
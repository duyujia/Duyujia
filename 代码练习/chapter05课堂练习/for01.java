public class for01{
	public static void main(String[] args) {
		for( int i = 1;i <=10; i++) {
			System.out.println("你好，韩顺平教育" +i);
		}


		int i = 1;
		for (; i<=10 ;) {
			System.out.println("你好，韩顺平教育" +i);
			i++;
		}

		System.out.println(i);

		//补充
		// int j = 1;
		// for（; ;） {//表示一个无限循环
		// 	System.out.println("ok" + j++);
		// }

		int count = 3;
		for (int i = 0;j = 0; i < count; i++,j+=2) {
			System.out.println("i=" + i + "j=" + j);
		}
	}
}
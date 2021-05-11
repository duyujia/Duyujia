public class arithmeticoperator {
	
	//编写一个main方法
	public static void main(String[] args) {

		System.out.println(10 / 4);//java中是2int
		double d = 10 / 4;//2.0double
		System.out.println(d);
		System.out.println(10.0 / 4);//2.5double

		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);  //1
		System.out.println(-10 % -3);//-1

		//+=的使用
		int i = 10;
		i++;//自增 等价于 i = i+1
		++i;//自增 等价于 i = i+1
		System.out.println("i=" + i);//-1

		int j = 8;
		int k = j++;
		System.out.println("k=" + k + "j=" + j);//8 9
	}
}
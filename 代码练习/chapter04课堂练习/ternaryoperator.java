public class ternaryoperator {
	
	//编写一个main方法
	public static void main(String[] args) {

		int n1 = 553;
		int n2 = 33;
		int n3 = 123;

		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 :n3;
		System.out.println("最大数=" + max2);

		//使用一条语句
		int max = (n1 > n2 ? n1 : n2) >n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.println("最大数=" + max);
	}
}
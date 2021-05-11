public class floatdetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		double num1 = 2.7;
		double num2 = 8.1 / 3;
		if(num1 == num2) {
			System.out.println("相等");
		}
		//正确的写法
		if(Math.abs(num1-num2) < 0.0000001) {
			System.out.println("差值很小，达到规定的精度，认为相等");

		}
		//可以通过Java API看
		System.out.println(Math.abs(num1-num2));
	}
}
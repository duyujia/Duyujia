public class forceconvert {
	
	//编写一个main方法
	public static void main(String[] args) {
		int num1 = (int)1.7;

		System.out.println("num1=" + num1);//1,造成精度损失
		
		int num2 = 2000;
		byte b1 = (byte)num2;
		System.out.println("b1=" + b1);//造成数据溢出
	}
}
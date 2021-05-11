public class stringbasic {
	
	//编写一个main方法
	public static void main(String[] args) {
		int num1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = num1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		

		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 );//1,造成精度损失
		String s5 = "123";
		int n1 = Integer.parseInt(s5);
		double n2 = Double.parseDouble(s5);
		float n3 = Float.parseFloat(s5);
		byte n4 = Byte.parseByte(s5);
		long n5 = Long.parseLong(s5);
		boolean b = Boolean.parseBoolean("true");
		short n6 =Short.parseShort(s5);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(b1);
	}
}
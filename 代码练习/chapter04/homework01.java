public class homework{
	public static void main (String[] args) {
		System.out.println(1 >> 2);
		System.out.println(1 << 2);
		System.out.println(4 << 3);
		System.out.println(15 >> 2);
		System.out.println(-10.5 % 3);//有小数参与的运算得到的结果是近似值,且a%b当a是小数时，公式=a-(int)a/b*b:-10.5-（-10)/3*3

		int i = 66;
		System.out.println(++i+i);//134

		// 在Java中，以下正确的赋值语句是（）
		// A） int num1 = (int)"18";  错误，将一个字符串转成一个整数应该使用对应包装类的方法来转义：Integer.parseInt("18");
		// B)  int num2 = 18.0; 错误，double赋值给一个Int
		// c)  double num3 = 3d; OK：d代表3自动转换成double类型
		// d)  double num4 = 8;  OK:一个整数赋给一个double
		// e） int i = 48;char ch = i+1; int的精度比char高
		// f)  byte b = 19;short s = b+2;错误，int赋给一个short

		//将String转成double类型
		double num1 = Double.parseDouble("18.8");
		char c = '韩';
		String str =c + " ";
		System.out.println(num1);
		System.out.println(str);

		}
}
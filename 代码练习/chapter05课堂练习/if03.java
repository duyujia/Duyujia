public class if03{
	public static void main(String[] args) {
		int x = 7;
		int y = 4;
		if (x > y) {//t
			if(y > 5) {//f
				System.out.println(x+y);

			}
				System.out.println("韩顺平教育");
		} else
			System.out.println(" x is" + x);

		double num1 = 19.0;
		double num2 = 8.0;
		double num3 = num1+num2;
		if(num1 > 10.0 && num2 <20.0) {
			System.out.println(num3);
		}

		int a = 10;
		int b = 12;
		int c = a+b;
		if(c % 3 == 0 && c % 5 == 0) {
			System.out.println("可以整除");
		} else {
			System.out.println("不能整除");
		}

		int year = 1000;
		if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("是闰年");

		} else {
			System.out.println("不是闰年");
		}
	}
}
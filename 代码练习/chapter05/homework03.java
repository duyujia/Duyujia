import java.util.Scanner;
public class homework03{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("������һ������");
		int num1 = myscanner.nextInt();
		int a = num1 % 10;
		int b = num1 % 100 / 10;
		int c =  num1 / 100;
		if(a * a * a + b * b *b + c * c * c == num1) {
			System.out.println(num1 + "��ˮ�ɻ���");
		} else {
			System.out.println(num1 + "����ˮ�ɻ���");
		}
	}
} 
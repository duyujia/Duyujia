import java.util.Scanner;
public class if02{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("�������������");
		int age = myscanner.nextInt();
		if (age > 18) {
			System.out.println("���������18��Ҫ���Լ�����Ϊ����");
		} else {
			System.out.println("������䲻��");
		}
		System.out.println("�������");
	}
}
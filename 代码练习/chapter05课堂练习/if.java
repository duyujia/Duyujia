import java.util.Scanner;
public class if {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);//������������䣬Ӧ�ö���һ��Scanner����
		System.out.println("����������");
		int age = myscanner.nextInt();
		if(age > 18) {
			System.out.println("���������18��Ҫ���Լ�����Ϊ����");
		}
		System.out.println("�������ִ��");
	}
}
import java.util.Scanner;
public class switch03{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("������a-e");
		char c1 = myscanner.next().charAt(0);
		switch(c1) {
			case 'a':
			System.out.println("A");
			break;
			case 'b'://д��'2'Ҳ���ԣ�'2'ҲΪ�ַ�����
			System.out.println("B");
			break;
			case 'c':
			System.out.println("C");
			break;
			case 'd':
			System.out.println("D");
			break;
			case 'e':
			System.out.println("E");
			break;
			default:
			System.out.println("����������");
		}

		System.out.println("������ѧ���ɼ�");
		double score = myscanner.nextDouble();
		int a = (int)(score/60);
		if (score >= 0 && score <=100) {
			switch(a) {
				case 0:
				System.out.println("������");
				break;
				case 1:
				System.out.println("����");
				break;
				default:
				System.out.println("�ɼ�Ҫ��0-100");
			}
		} else {
			System.out.println("����������");
			}

		System.out.println("�������·�");
		int month = myscanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("���Ǵ���");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�����ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�����＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("���Ƕ���");
				break;
			default:
				System.out.println("����������");
		}
	}
}
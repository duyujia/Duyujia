import java.util.Scanner;
public class if05{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("������ø��ֵĳɼ�");
		double score = myscanner.nextDouble();
		if( score > 8.0) {
			System.out.println("�������Ա�");
			char  gender = myscanner.next().charAt(0);//���ַ���ת�����ַ�
			if (gender == '��') {
				System.out.println("����������");
			} else if(gender == 'Ů') {
				System.out.println("����Ů����");
			} else {
				System.out.println("���������Ա�");
			}
		} else {System.out.println("��̭");

		}
	}
}
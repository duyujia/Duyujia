import java.util.Scanner;
public class array02 {
	public static void main(String[] args) {
		double scores[] = new double[5];
		//��д�� double scores[];
		//scores = new double[5];
		Scanner myscanner = new Scanner(System.in);
		for (int i = 0;i<scores.length;i++) {
			System.out.println("�������" + (i+1) + "��Ԫ�ص�ֵ");
			scores[i] = myscanner.nextDouble();
		}
		//��������
		System.out.println("����Ԫ�ص��������");
		for(int i = 0;i<scores.length;i++) {
			System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ=" + scores[i]);
		}
	}
} 
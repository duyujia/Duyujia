import java.util.Scanner;//��ʾ��java.util�µ�Scanner�ർ��
public class input {
	
	//��дһ��main����
	public static void main(String[] args) {
		//1.����/����Scanner�����ڵİ�
		//2.����Scanner����new��ʾ����һ������
		//scanner����Scanner��Ķ���

		Scanner scanner = new Scanner(System.in);
		//3.�����û�������
		System.out.println("����������");
		String name = scanner.next();//�����û������ַ���
		System.out.println("����������");
		int age = scanner.nextInt();//�����û�����int
		System.out.println("������нˮ");
		double sal = scanner.nextDouble();//�����û�����double
		System.out.println("�˵���Ϣ����");
		System.out.println("����=" + name + "����=" + age + "нˮ=" + sal);
	}
}
import java.util.Scanner;
public class seqsearch {
	public static void main(String[] args) {
		//����һ���ַ�������
		String[] names = {"һ","��","��","��"}��
		Scanner myscanner = new Scanner(System.in);
		System.out.println("����������");
		String findname = myscanner.next();
		//�������飬����Ƚϣ�����У�����ʾ��Ϣ�����˳�
		int index = -1;
		for(int i = 0;i < names.length;i++) {
			if(findname.equals(names[i])) {
				System.out.println("�ҵ�" + findname);
				System.out.println("�±�Ϊ=" + i);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("û�ҵ�" + findname);
		}
	}
} 
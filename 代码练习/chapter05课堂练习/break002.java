import java.util.Scanner;
public class break002{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		int chance = 3;
		String name = "";
		String passwd = "";
		for(int i = 1;i <= 3;i++) {
			System.out.println("����������");
			name = myscanner.next();
			System.out.println("����������");
	 		passwd = myscanner.next();
			//�Ƚ���������ֺ������Ƿ���ȷ
			if("����".equals(name) && "666".equals(passwd)) {
				System.out.println("��¼�ɹ�");
				break;
			}chance--;
			 System.out.println("�㻹��" + chance + "�ε�¼����" );
		}
	}
}
public class return01{
	public static void main(String[] args) {

	
		for (int i = 1;i <=5;i++) {
			if (i == 3) {
				System.out.println("��˳ƽ����" +i);
				return;//��return���ڷ���ʱ����ʾ�������ڷ��������ʹ����main����ʾ�˳����򡣴�return��ʾ����main
			}
			System.out.println("Hello World!");
		}
		System.out.println("go on..");
	}
}
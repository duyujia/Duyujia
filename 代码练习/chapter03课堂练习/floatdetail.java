public class floatdetail {
	
	//��дһ��main����
	public static void main(String[] args) {
		double num1 = 2.7;
		double num2 = 8.1 / 3;
		if(num1 == num2) {
			System.out.println("���");
		}
		//��ȷ��д��
		if(Math.abs(num1-num2) < 0.0000001) {
			System.out.println("��ֵ��С���ﵽ�涨�ľ��ȣ���Ϊ���");

		}
		//����ͨ��Java API��
		System.out.println(Math.abs(num1-num2));
	}
}
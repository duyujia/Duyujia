public class homework{
	public static void main (String[] args) {
		System.out.println(1 >> 2);
		System.out.println(1 << 2);
		System.out.println(4 << 3);
		System.out.println(15 >> 2);
		System.out.println(-10.5 % 3);//��С�����������õ��Ľ���ǽ���ֵ,��a%b��a��С��ʱ����ʽ=a-(int)a/b*b:-10.5-��-10)/3*3

		int i = 66;
		System.out.println(++i+i);//134

		// ��Java�У�������ȷ�ĸ�ֵ����ǣ���
		// A�� int num1 = (int)"18";  ���󣬽�һ���ַ���ת��һ������Ӧ��ʹ�ö�Ӧ��װ��ķ�����ת�壺Integer.parseInt("18");
		// B)  int num2 = 18.0; ����double��ֵ��һ��Int
		// c)  double num3 = 3d; OK��d����3�Զ�ת����double����
		// d)  double num4 = 8;  OK:һ����������һ��double
		// e�� int i = 48;char ch = i+1; int�ľ��ȱ�char��
		// f)  byte b = 19;short s = b+2;����int����һ��short

		//��Stringת��double����
		double num1 = Double.parseDouble("18.8");
		char c = '��';
		String str =c + " ";
		System.out.println(num1);
		System.out.println(str);

		}
}
public class method {
	public static void main(String[] args) {
		//����ʹ��
		//1.����д�ú󣬲����ã���ִ��
		//2.�ȴ�������Ȼ����÷�������
		//3.
		Person p1 = new Person();
		p1.speak();//���÷���
		p1.cal01();
		p1.cal02(5);//����cal02����,ͬʱn=5

		//����getsum������ͬʱnum1 = 10��num2=20
		//�ѷ���getsum���ص�ֵ��������returnres
		int returnres = p1.getsum(10,20);
		System.out.println(returnres);
	}
} 


class Person {
	String name;
	int age;


	//����(��Ա����)
	//���speak��Ա�������������һ������
	//1.public:��ʾ��������
	//2.void:��ʾ����û�з���ֵ
	//3.speak()��speak�Ƿ�������()���β��б�
	//4.{}�����壬����д����Ҫִ�еĴ���
	//5.System.out.println("����һ������");��ʾ���ǵķ�������Ҫ���һ�仰
	public void speak() {
		System.out.println("����һ������");
	}

	//���cal01��Ա���������Լ����1+..+100�Ľ��
	public void cal01() {
		//ѭ�����
		int res = 0;
		for(int i = 1;i <= 1000;i++) {
			res += i;
		}
		System.out.println("cal01������=" + res);
	}

	//���cal02��Ա�������÷������Խ���һ����n,�����1+..+n�Ľ��
	//1.void:��ʾ����û�з���ֵ
	//2. cal02�Ƿ�������(int n)���β��б�
	//3.{}�����壬����д����Ҫִ�еĴ���
	public void cal02(int n) {
		//ѭ�����
		int res = 0;
		for(int i = 1;i <= n;i++) {
			res += i;

		}
	System.out.println("cal02������=" + res);

	}

	//���getsum��Ա���������Լ����������ĺ�
	//1.public:��ʾ��������
	//2.int:��ʾ����ִ�к󣬷���һ��intֵ
	//3.getsum()������
	//4.(int num1,int num2)�β��б�2���βΣ����Խ����û������������ֵ
	//5.return res;��ʾ��res��ֵ����
	public int getsum(int num1,int num2) {
		//ѭ�����
		int res = num1 + num2;
		return res;
		}
}
public class Test { //teatΪ������
	int count = 9; //����
	public void  count1() {//test��Ա����
		count = 10;//count�������ԣ��ĳ�10
		System.out.println("count1=" + count);//10

	}
	public  void count2() {//test��Ա����
		System.out.println("count1=" + count++);
}

	public static void main(String[] args) {
		//1.new Test()û�аѵ�ַ����һ������Ϊ��������,��������ֻ��ʹ��һ��
		//2.new Test().count1()��������������󣬾͵���count1()
		new Test().count1();//10

		Test t1 = new Test();
		t1.count2();//9
		t1.count2();//10

	}
}

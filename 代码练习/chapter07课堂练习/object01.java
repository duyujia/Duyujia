public class object01 {
	public static void main(String[] args) {

		//1.new Cat()����һֻè
		//2.Cat cat1 = new Cat() �Ѵ�����è����cat1
		Cat cat1 = new Cat();//cat1�Ƕ��������������ã�,new Cat()�����Ķ���ռ�(����)���������Ķ���
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";

		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";

		//���ʶ�������
		System.out.println("��1ֻè��Ϣ" + cat1.name + " " + cat1.age + " " + cat1.color);
		System.out.println("��2ֻè��Ϣ" + cat2.name + " " + cat2.age + " " + cat2.color);
	}
} 

class Cat {
	String name;
	int age;
	String color;
} 
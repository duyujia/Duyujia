public class methoddetail {
	public static void main(String[] args) {
		AA a = new AA();
		int[] arr1 = a.getsumandsub(3,6);
		System.out.println("��=" + arr1[0]);
		System.out.println("��=" + arr1[1]);
		a.f3("abc",10);

	}
}
class AA {
	public int[] getsumandsub(int n1,int n2) {
		int[] arr = new int[2];//����һ������
	arr[0] = n1 + n2;
	arr[1] = n1 - n2;
	return arr;
	}

	public double f1() {
		int d1 = 1;
		return d1; //int ->double�����Զ�ת����double->int������ 
	}

	public void f2() {

		System.out.println("hello");
		int n = 10;
		return;
	}

	public void f3(String str,int n) {

	}
}
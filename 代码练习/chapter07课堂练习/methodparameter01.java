public class methodparameter01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		AA aa = new AA();
		aa.swap(a,b);
		System.out.println("������a=" + a + " b=" + b);//10 20

	}
}
class AA {
	public void swap(int a,int b) {
		System.out.println("\na��b����ǰ��ֵ\na=" + a + " b=" + b);//10 20
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na��b����ǰ��ֵ\na=" + a + " b=" + b);//20 10
	}
}
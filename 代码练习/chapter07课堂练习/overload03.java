public class overload03 {
	public static void main(String[] args) {
		Methods t = new Methods();
		t.m(10);
		t.m(10,20);
		t.m("韩顺平教育");


		System.out.println(t.max(10,20));
		System.out.println(t.max(10,20.0));
		System.out.println(t.max(10,20,30));



	}
}
class Methods {

	public void m(int n) {
		System.out.println("平方=" + (n * n));
	}

	public void m(int n1,int n2) {
		System.out.println("相乘=" + (n1 * n2));
	}

	public void m(String str) {
		System.out.println("传入的str=" + str);
	}


	public int max(int n1,int n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1,double n2) {
		return n1 > n2 ? n1 : n2;
	}


	public double max(double n1,double n2,double n3) {
		double max1 =  n1 > n2 ? n1 : n2;
		return  max1 = max1 > n3 ? max1 :n3;
	}



}
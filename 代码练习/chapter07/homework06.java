public class homework06 {
	public static void main(String[] args) {
		Cale t = new Cale(2,1);
		System.out.println("��=" + t.sum());
		System.out.println("��=" + t.minus());
		System.out.println("��=" + t.mul());
		Double divres = t.div();
		if(divres != null) {
			System.out.println("��=" + t.div());
		}
	}
}

class Cale {
	double num1;
	double num2;

	public Cale(double num1,double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double sum() {
		return num1+num2;
	}

	public double minus() {
		return num1 - num2;
	}

	public double mul() {
		return num1 * num2;
	}

	public Double div() {//�ð�װ��

		if (num2 == 0 ) {
			System.out.println("num2����Ϊ0");
			return null;
		} else {
			return num1 / num2;
		}
		
	}

}
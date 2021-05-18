public class homework06 {
	public static void main(String[] args) {
		Cale t = new Cale(2,1);
		System.out.println("和=" + t.sum());
		System.out.println("差=" + t.minus());
		System.out.println("乘=" + t.mul());
		Double divres = t.div();
		if(divres != null) {
			System.out.println("除=" + t.div());
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

	public Double div() {//用包装类

		if (num2 == 0 ) {
			System.out.println("num2不能为0");
			return null;
		} else {
			return num1 / num2;
		}
		
	}

}
public class homework05 {
	public static void main(String[] args) {
		circle t = new circle(3);
		System.out.println("面积=" + t.areas());
		System.out.println("周长=" + t.len());


	}
}

class circle {
	double radius;

	public circle(double radius ){
		this.radius = radius;

	}

	public double areas() {
		return Math.PI * radius * radius;
	}

	public double len() {
		return Math.PI * radius * 2;

	}

}
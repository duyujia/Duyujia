public class homework13 {
	public static void main(String[] args) { 
		circle c = new circle();
		Passobject po = new Passobject();
		po.printareas(c,5);


	}
}

class circle {//����
	double radius;

	// public circle(double radius) {
	// 	this.radius = radius;
	// }

	public double findareas() {//�������
		return Math.PI * radius * radius;
	}
	//��ӷ������޸Ķ���İ뾶ֵ
	public void setradius(double radius) {
		this.radius = radius;
	}

}

class Passobject {
	public void printareas(circle c,int times) {
		System.out.println("radius\tarea");
		for (int i = 1;i <= times;i++) {
			c.setradius(i);//�޸�c����İ뾶ֵ
			System.out.println((double)i + "\t" + c.findareas());
		}
	}
}

public class homework13 {
	public static void main(String[] args) { 
		circle c = new circle();
		Passobject po = new Passobject();
		po.printareas(c,5);


	}
}

class circle {//属性
	double radius;

	// public circle(double radius) {
	// 	this.radius = radius;
	// }

	public double findareas() {//返回面积
		return Math.PI * radius * radius;
	}
	//添加方法，修改对象的半径值
	public void setradius(double radius) {
		this.radius = radius;
	}

}

class Passobject {
	public void printareas(circle c,int times) {
		System.out.println("radius\tarea");
		for (int i = 1;i <= times;i++) {
			c.setradius(i);//修改c对象的半径值
			System.out.println((double)i + "\t" + c.findareas());
		}
	}
}

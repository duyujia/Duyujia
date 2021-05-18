public class homework03 {
	public static void main(String[] args) {
		Book t = new Book("jack",200);
		t.info();
		t.updateprice();
		t.info();


	}
}


class Book {
	String name;
	double price;

	public Book(String name,double price) {
		this.name = name;
		this.price = price;
		

	}

	public void updateprice () {
		//局部变量无price，this可省略
		
		if (this.price > 150) {
			this.price = 150;
		} else if(this.price > 100) {
			this.price = 100;
		}

	}
	public void info () {
		System.out.println("书名=" + this.name + "价格" +this.price);
	}
}
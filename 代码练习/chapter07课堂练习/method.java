public class method {
	public static void main(String[] args) {
		//方法使用
		//1.方法写好后，不调用，不执行
		//2.先创建对象，然后调用方法即可
		//3.
		Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();
		p1.cal02(5);//调用cal02方法,同时n=5

		//调用getsum方法，同时num1 = 10，num2=20
		//把方法getsum返回的值赋给变量returnres
		int returnres = p1.getsum(10,20);
		System.out.println(returnres);
	}
} 


class Person {
	String name;
	int age;


	//方法(成员方法)
	//添加speak成员方法，输出我是一个好人
	//1.public:表示方法公开
	//2.void:表示方法没有返回值
	//3.speak()：speak是方法名，()是形参列表
	//4.{}方法体，可以写我们要执行的代码
	//5.System.out.println("我是一个好人");表示我们的方法就是要输出一句话
	public void speak() {
		System.out.println("我是一个好人");
	}

	//添加cal01成员方法，可以计算从1+..+100的结果
	public void cal01() {
		//循环完成
		int res = 0;
		for(int i = 1;i <= 1000;i++) {
			res += i;
		}
		System.out.println("cal01计算结果=" + res);
	}

	//添加cal02成员方法，该方法可以接收一个数n,计算从1+..+n的结果
	//1.void:表示方法没有返回值
	//2. cal02是方法名，(int n)是形参列表
	//3.{}方法体，可以写我们要执行的代码
	public void cal02(int n) {
		//循环完成
		int res = 0;
		for(int i = 1;i <= n;i++) {
			res += i;

		}
	System.out.println("cal02计算结果=" + res);

	}

	//添加getsum成员方法，可以计算两个数的和
	//1.public:表示方法公开
	//2.int:表示方法执行后，返回一个int值
	//3.getsum()方法名
	//4.(int num1,int num2)形参列表，2个形参，可以接收用户传传入的两个值
	//5.return res;表示把res的值返回
	public int getsum(int num1,int num2) {
		//循环完成
		int res = num1 + num2;
		return res;
		}
}
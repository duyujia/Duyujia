import java.util.Scanner;//表示把java.util下的Scanner类导入
public class input {
	
	//编写一个main方法
	public static void main(String[] args) {
		//1.引入/导入Scanner类所在的包
		//2.创建Scanner对象，new表示创建一个对象
		//scanner就是Scanner类的对象

		Scanner scanner = new Scanner(System.in);
		//3.接收用户的收入
		System.out.println("请输入名字");
		String name = scanner.next();//接收用户输入字符串
		System.out.println("请输入年龄");
		int age = scanner.nextInt();//接收用户输入int
		System.out.println("请输入薪水");
		double sal = scanner.nextDouble();//接收用户输入double
		System.out.println("人的信息如下");
		System.out.println("名字=" + name + "年龄=" + age + "薪水=" + sal);
	}
}
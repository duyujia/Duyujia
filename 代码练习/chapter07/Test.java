public class Test { //teat为公有类
	int count = 9; //属性
	public void  count1() {//test成员方法
		count = 10;//count就是属性，改成10
		System.out.println("count1=" + count);//10

	}
	public  void count2() {//test成员方法
		System.out.println("count1=" + count++);
}

	public static void main(String[] args) {
		//1.new Test()没有把地址返回一个对象，为匿名对象,匿名对象只能使用一次
		//2.new Test().count1()创建好匿名对象后，就调用count1()
		new Test().count1();//10

		Test t1 = new Test();
		t1.count2();//9
		t1.count2();//10

	}
}

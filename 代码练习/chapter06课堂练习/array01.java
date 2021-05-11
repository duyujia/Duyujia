public class array01 {
	public static void main(String[] args) {
		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;
		// double totalweight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
		// double avgweight = totalweight / 6;
		// System.out.println(avgweight);

		//定义一个数组
		//1.double[]表示是double类型的数组，数组名hens
		//2.{3,5,1,3.4,2,50}表示数组的值/元素，一次表示数组的第几个元素
		//3.
		double[] hens = {3,5,1,3.4,2,50};

		//遍历数组得到数组的所有元素的和，使用for
		//1.我们可以通过hens[下标]来访问数组的元素，第一个元素就是hens[0]
		//2.通过for就可以循环的访问数组的元素/值
		//3.使用一个变量totalweight
		double totalweight = 0;
		for(int i = 0;i < hens.length;i++) {
			System.out.println("第" + (i + 1) + "个元素的值=" + hens[i]);
			totalweight += hens[i];
		}
		System.out.println("总体重=" + totalweight + "平均体重=" +totalweight / hens.length);
	}
} 
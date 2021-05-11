public class varparameter01 {
	public static void main(String[] args) {
		Methods t = new Methods();
		// System.out.println(t.sum(1,2,100));
		//可以使用数组传参
		int[] arr = {1,2,100};
		System.out.println(t.sum(arr));


	}
}
class Methods {

	//使用可变参数
	//1.int...表示接受的是可变参数，类型是int，即可以接受多个int(0-多)
	//2.使用可变参数可以当做数组来使用，即nums可以当做数组
	public int sum(int... nums) {
		int res = 0;
		System.out.println("接受参数个数=" + nums.length);
		for (int i = 0;i < nums.length;i++) {
			res += nums[i];
		}

		return res;
	}

}
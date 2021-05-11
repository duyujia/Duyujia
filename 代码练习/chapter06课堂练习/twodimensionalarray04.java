public class twodimensionalarray04 {
	public static void main(String[] args) {

		int arr[][] = {{4,6},{1,4,5,7},{-2}};
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			//遍历二维数组的每个元素（数组）
			//arr[i].length得到对应的每一个一维数组的长度
			for(int j = 0;j < arr[i].length;j++) {
				sum +=arr[i][j];
			}
		}
		System.out.println("sum=" + sum);
	}
} 
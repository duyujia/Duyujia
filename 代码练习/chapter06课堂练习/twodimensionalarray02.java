public class twodimensionalarray02 {
	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		arr[1][2] = 8;
		for(int i = 0;i < arr.length;i++) {
			//遍历二维数组的每个元素（数组）
			//arr[i].length得到对应的每一个一维数组的长度
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
} 
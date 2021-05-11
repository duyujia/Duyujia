public class yanghui {
	public static void main(String[] args) {

		int yanghui[][] = new int[10][];
		for(int i = 0;i < yanghui.length;i++) {//遍历二维数组的每个元素（数组）
			//给每个一维数组开空间，如果没有给一维数组new，那么arr[i]就是null
			yanghui[i] = new int[i+1];
			//遍历一维数组，并给一维数组的每个元素赋值
			for(int j = 0;j < yanghui[i].length;j++) {
				if (j == 0 ||j == yanghui[i].length - 1){
					yanghui[i][j] = 1;
				} else {

					yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];

				}
			}
		}


		for(int i = 0;i < yanghui.length;i++) {
			for(int j = 0;j < yanghui[i].length;j++) {
				System.out.print(yanghui[i][j] + " " );
			}
			System.out.println();

		}

	}
} 
public class yanghui {
	public static void main(String[] args) {

		int yanghui[][] = new int[10][];
		for(int i = 0;i < yanghui.length;i++) {//������ά�����ÿ��Ԫ�أ����飩
			//��ÿ��һά���鿪�ռ䣬���û�и�һά����new����ôarr[i]����null
			yanghui[i] = new int[i+1];
			//����һά���飬����һά�����ÿ��Ԫ�ظ�ֵ
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
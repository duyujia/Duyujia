public class twodimensionalarray03 {
	public static void main(String[] args) {

		int arr[][] = new int[3][];
		for(int i = 0;i < arr.length;i++) {//������ά�����ÿ��Ԫ�أ����飩
			//��ÿ��һά���鿪�ռ䣬���û�и�һά����new����ôarr[i]����null
			arr[i] = new int[i+1];
			//����һά���飬����һά�����ÿ��Ԫ�ظ�ֵ
			for(int j = 0;j < arr[i].length;j++) {
				arr[i][j] = i + 1;
			}
	
		}
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println("\n");
		}
	}
} 
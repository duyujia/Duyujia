public class twodimensionalarray02 {
	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		arr[1][2] = 8;
		for(int i = 0;i < arr.length;i++) {
			//������ά�����ÿ��Ԫ�أ����飩
			//arr[i].length�õ���Ӧ��ÿһ��һά����ĳ���
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
} 
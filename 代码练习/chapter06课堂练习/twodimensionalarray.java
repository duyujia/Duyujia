public class twodimensionalarray {
	public static void main(String[] args) {
		int [][] arr = {{0,0,0,0,0,0},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,0,0,0,0}};
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
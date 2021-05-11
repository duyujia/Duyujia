public class methodexercise02 {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.printchar(9,10,'*');
	}
}

class AA {
	public void printchar(int row,int col,char c1) {
		for (int i =0;i < row;i++) {
			for (int j =0;j < col;j++) {
				System.out.print(c1);
			}
			System.out.println();
		}
	}
}
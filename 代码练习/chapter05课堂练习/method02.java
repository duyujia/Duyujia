 public class method02 {
	public static void main(String[] args) {

		int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
		Mytools  tool = new Mytools; 
		tool.printarr(map);
	}
} 

class Mytools {
	public void printarr(int[][] map1) {
		System.out.println("===========================")
			//对传入的map1数组进行遍历输出
		for (int i = 0;i < map1.length;i++) {
			for (int j = 0;j < map1[i].length;j++) {
			System.out.println(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
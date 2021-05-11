public class migong {
	public static void main(String[] args) {

		int[][] map = new int[8][7];
		for (int i = 0;i < 7;i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for (int i = 0;i < 7;i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		//map[2][2] = 1;//测试回溯

		//使用findway
		T t = new T();
		t.findway(map,1,1);

		System.out.println("当前地图情况===========================================");
		for (int i = 0;i < 7;i++) {
			for (int j = 0;j < 7;j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}



	}
}

class T {
	public boolean findway(int[][] map,int i,int j) {
		//1.findway方法专门用来找出迷宫的路径
		//2.如果找到，就返回true，否则返回false
		//3.map就是二维数组，即表示迷宫
		//4.i,j就是老鼠的位置，初始化的位置为（1,1）
		//5.规定map数组的各个值的含义：0表示可以走，1表示障碍物，2表示可以走t通，3表示走过，但是走不通是死路
		//6.当map[6][5] == 2就说明找到通路，就可以结束，否则就继续找
		//7.确定老鼠找路策略：下->右->上->左
		//1.
		//1.
		//1.
		if (map[6][5] == 2) {
			return true;
		} else {
			if(map[i][j] == 0) {//当前这个位置为0，说明表示可以走
				//假定可以走通
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否真的可以走通
				//下->右->上->左
				if(findway(map,i+1,j)) {
					return true;
				} else if(findway(map,i,j+1)) {
					return true;
				} else if(findway(map,i-1,j)) {
					return true;
				} else if(findway(map,i,j-1)) {
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}

			} else {
				//map[i][j] == 1,2,3
				return false;
			}
		}
	}
}
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
		//map[2][2] = 1;//���Ի���

		//ʹ��findway
		T t = new T();
		t.findway(map,1,1);

		System.out.println("��ǰ��ͼ���===========================================");
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
		//1.findway����ר�������ҳ��Թ���·��
		//2.����ҵ����ͷ���true�����򷵻�false
		//3.map���Ƕ�ά���飬����ʾ�Թ�
		//4.i,j���������λ�ã���ʼ����λ��Ϊ��1,1��
		//5.�涨map����ĸ���ֵ�ĺ��壺0��ʾ�����ߣ�1��ʾ�ϰ��2��ʾ������tͨ��3��ʾ�߹��������߲�ͨ����·
		//6.��map[6][5] == 2��˵���ҵ�ͨ·���Ϳ��Խ���������ͼ�����
		//7.ȷ��������·���ԣ���->��->��->��
		//1.
		//1.
		//1.
		if (map[6][5] == 2) {
			return true;
		} else {
			if(map[i][j] == 0) {//��ǰ���λ��Ϊ0��˵����ʾ������
				//�ٶ�������ͨ
				map[i][j] = 2;
				//ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
				//��->��->��->��
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
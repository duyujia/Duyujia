public class continue01{
	public static void main(String[] args) {
		// int i = 1;
		// while(i <=4) {
		// 	i++;
		// 	if ( i == 2) {
		// 		continue;
		// 	}
		// 	System.out.println("i=" + i);
		// }

		System.out.println("================================================");

		label1:
		for(int j = 0;j < 4;j++) {
			label2:
			for(int i = 0;i < 10;i++) {
				if(i == 2) {
					continue;//�ȼ���continue label2//�ĳ�label1�������[0,1]
				}
				System.out.println("i=" + i);//����Ĵ�[0,1,2,3,4,5,6,7,8,9]
			}
		}
	}
} 
import java.util.Scanner;
public class mulfor05 {
	public static void main(String[] args) {
		for (int i = 1;i <= 5; i++) { //i表示层数
			//在打印*之前，还要输出对应空格
			for (int k = 1;k <=5-i;k++) {
				System.out.print(" ");
			}
			//控制打印每层的*个数
			for (int j = 1;j <= 2 * i-1;j++) {
				if(j == 1 ||  j ==2 * i-1 || i == 5) { 
					System.out.print("*");//不写ln不换行
				} else {
					System.out.print(" ");//不写ln不换行
				}
			}
			//每打印完一层的*后，就换行
			System.out.println("");//println本身会换行，也可写成System.out.print("\n");
		}
	}
}
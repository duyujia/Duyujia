import java.util.Scanner;
public class mulfor05 {
	public static void main(String[] args) {
		for (int i = 1;i <= 5; i++) { //i��ʾ����
			//�ڴ�ӡ*֮ǰ����Ҫ�����Ӧ�ո�
			for (int k = 1;k <=5-i;k++) {
				System.out.print(" ");
			}
			//���ƴ�ӡÿ���*����
			for (int j = 1;j <= 2 * i-1;j++) {
				if(j == 1 ||  j ==2 * i-1 || i == 5) { 
					System.out.print("*");//��дln������
				} else {
					System.out.print(" ");//��дln������
				}
			}
			//ÿ��ӡ��һ���*�󣬾ͻ���
			System.out.println("");//println����ỻ�У�Ҳ��д��System.out.print("\n");
		}
	}
}
import java.util.Scanner;
public class arrayreduce {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		//��Ϊ�û�ʲôʱ���˳���֪����ʹ��do-while + break������
		int[] arr = {1,2,3,4,5};
		do{
			int[] arrnew = new int[arr.length-1];

		for ( int i =0;i < arr.length-1;i++) {//ѭ��26��
				arrnew[i] = arr[i];
			} 
		arr = arrnew;//��arrָ��arrnew��arr = arrnew����arrnew�ĵ�ַ����arr��û�ж���ָ��ԭ��arr�ĵ�ַ����ôԭ��arr����ͱ�����
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		} 
		if(arr.length > 1){
			System.out.println("�Ƿ����ɾ�� y/n");
		char key = myscanner.next().charAt(0);
			if(key == 'n') {
				break;
			} 
		}
		else {
			System.out.print("������ɾ��");
					break;
				}
		}while(true);
	}
} 
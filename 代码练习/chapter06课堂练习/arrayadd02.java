import java.util.Scanner;
public class arrayadd02 {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		//��Ϊ�û�ʲôʱ���˳���֪����ʹ��do-while + break������
		int[] arr = {1,2,3};
		do{
			int[] arrnew = new int[arr.length+1];

		for ( int i =0;i < arr.length;i++) {//ѭ��26��
				arrnew[i] = arr[i];
			} 
		System.out.println("��������Ҫ��ӵ�Ԫ��");
		int addnum = myscanner.nextInt();
		arrnew[arr.length-1] = addnum;
		arr = arrnew;//��arrָ��arrnew��arr = arrnew����arrnew�ĵ�ַ����arr��û�ж���ָ��ԭ��arr�ĵ�ַ����ôԭ��arr����ͱ�����
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		} 
		System.out.println("�Ƿ������� y/n");
		char key = myscanner.next().charAt(0);
		if(key == 'n') {
			break;
		}
	}while(true);
	}
} 
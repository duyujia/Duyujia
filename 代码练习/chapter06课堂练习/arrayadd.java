public class arrayadd {
	public static void main(String[] args) {

		int[] arr = {1,2,3};
		//arr[3] = 4;�����±겻��ָ����Χ��
		//����һ��������
		int[] arrnew = new int[arr.length+1];

		for ( int i =0;i < arr.length+1;i++) {//ѭ��26��
			if(i <3) {
				arrnew[i] = arr[i];
			} else {
				arrnew[i] = 4;
			}
		}
		arr = arrnew;//��arrָ��arrnew��arr = arrnew����arrnew�ĵ�ַ����arr��û�ж���ָ��ԭ��arr�ĵ�ַ����ôԭ��arr����ͱ�����
		for(int i = 0;i < arrnew.length;i++) {
			System.out.print(arr[i] + " ");
		}

		
	}
} 
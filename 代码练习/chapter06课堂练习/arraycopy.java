public class arraycopy {
	public static void main(String[] args) {

		int[] arr1 = {10,20,30};
		int[] arr2 = new int[arr1.length];//ֻҪ���ٿռ䣬�ͻ�����µ�ַ
		//����arr1����ÿ��Ԫ�ؿ��������õ�λ��
		for(int i = 0;i < arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		arr2[0] = 100;//�����arr1��Ӱ��
		for(int i = 0;i < arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i = 0;i < arr1.length;i++) {
			System.out.println(arr2[i]);
		}
	}
} 
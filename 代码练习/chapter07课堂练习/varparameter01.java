public class varparameter01 {
	public static void main(String[] args) {
		Methods t = new Methods();
		// System.out.println(t.sum(1,2,100));
		//����ʹ�����鴫��
		int[] arr = {1,2,100};
		System.out.println(t.sum(arr));


	}
}
class Methods {

	//ʹ�ÿɱ����
	//1.int...��ʾ���ܵ��ǿɱ������������int�������Խ��ܶ��int(0-��)
	//2.ʹ�ÿɱ�������Ե���������ʹ�ã���nums���Ե�������
	public int sum(int... nums) {
		int res = 0;
		System.out.println("���ܲ�������=" + nums.length);
		for (int i = 0;i < nums.length;i++) {
			res += nums[i];
		}

		return res;
	}

}
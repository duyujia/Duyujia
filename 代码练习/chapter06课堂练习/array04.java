public class array04 {
	public static void main(String[] args) {
		int [] nums = {4,-1,9,10,23};
		int max = nums[0];
		int maxindex = 0;
		for ( int i =1;i < nums.length;i++) {//ѭ��26��
			if(max < nums[i]) {
				max = nums[i];
				maxindex = i;

			}
		}
		System.out.println(maxindex);
	}
} 
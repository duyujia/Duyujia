public class bubblesort {
	public static void main(String[] args) {
		int [] nums = {24,69,80,57,13};
		int max = nums[0];
		for (int i = 0;i < nums.length-1;i++) {
			for(int j =0;j < nums.length-i-1;j++) {
				if (nums[j] > nums[j+1]) {
					max = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = max;
				}
		} 
		System.out.println("��" + (i+1) + " ��������Ϊ��");
		for (int m = 0;m < nums.length;m++){
			System.out.print(nums[m] + "\t");

		}
		System.out.print("\n");
	}

		for ( int i =0;i < nums.length;i++) {//ѭ��26��
			System.out.println(nums[i]);
		}
	}
} 
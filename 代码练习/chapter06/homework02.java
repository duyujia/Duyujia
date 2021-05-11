public class homework02 {
	public static void main(String[] args) {
		int[] num = {10,12,45,90};
		int num2 = 23;
		int index = -1;
		for (int i = 0;i < num.length;i++) {
			if(num2 <= num[i]) {
				index = i;
				break;
			}
		}

		if(index == -1) {
			index = num.length;

		}
		int[] num1 = new int[num.length + 1];
		for (int i = 0,j = 0; i < num1.length;i++) {
			if (i != index) {
				num1[i] = num[j];
				j++;
			} else {
				num1[i] = num2;
			}

		}
		num = num1; 
		System.out.println(index);
		for (int i = 0;i < num1.length;i++) {
			System.out.print(num1[i] + "\t");
		}
	}
} 
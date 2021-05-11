public class homework03 {
	public static void main(String[] args) { 
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}

		for(int i =  arr.length-1;i >=0;i--){
			System.out.print(arr[i] + "\t");
		}

		int max = arr[0];
		int maxindex = 0;
		double sum = arr[0];

		for(int i =  1;i < arr.length;i++) {

			sum +=arr[i];
			if (arr[i] >= max) {
				max = arr[i];
				maxindex = i;
			}
		}
		System.out.println();
		System.out.println("max=" + max + " "+ "maxindex=" + maxindex);
		System.out.println("average=" + (sum / arr.length));

		int findnum = 8;
		int index = -1;
		for(int i =  0;i < arr.length;i++) {
			if(findnum == arr[i]) {
				System.out.println("找到数" + findnum +  "下标=" + i);
				index = i;
				break;
			}
		}

		if (index ==-1) {

			System.out.println("没有找到" + findnum);
	}

		}
		
} 
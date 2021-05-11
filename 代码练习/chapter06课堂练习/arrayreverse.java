public class arrayreverse {
	public static void main(String[] args) {

		int [] arr = {11,22,33,55,66,88};

		for(int i= 0;i < arr.length/2;i++) {
			int temp = arr[arr.length-i-1];
			arr[arr.length-i-1] = arr[i];
			arr[i] = temp;
		}

		for(int i =0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
			System.out.print("\n");
		}
		

		 //逆序赋值法
		int [] arr1 = {11,22,33,55,66,88};
		int[] arr2 = new int[arr1.length];
		for(int i = arr1.length-1,j=0;i >= 0;i--,j++) {

			arr2[j] = arr1[i];

		}

		arr1 = arr2;//让arr指向arr2数据空间，此时，arr原来的数据空间就没有变量引用，会被当做垃圾销毁
		for(int i = 0;i < arr1.length;i++) {

			System.out.print(arr1[i] + "\t");
			System.out.print("\n");
		}

		for(int i = 0;i < arr2.length;i++) {

			System.out.print(arr2[i] + "\t");
		}

	}
} 
public class arraycopy {
	public static void main(String[] args) {

		int[] arr1 = {10,20,30};
		int[] arr2 = new int[arr1.length];//只要开辟空间，就会分配新地址
		//遍历arr1，把每个元素拷贝到对用的位置
		for(int i = 0;i < arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		arr2[0] = 100;//不会对arr1有影响
		for(int i = 0;i < arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i = 0;i < arr1.length;i++) {
			System.out.println(arr2[i]);
		}
	}
} 
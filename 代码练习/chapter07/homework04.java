public class homework04 {
	public static void main(String[] args) {
		A03 t = new A03();
		int[] arr = {10,20,30};
		int[] newarr=t.copyarr(arr);
		for(int i = 0;i < newarr.length;i++) {
			System.out.println(newarr[i]);
		}


	}
}

class A03 {

	public int[] copyarr(int[] arr1) {
		int[] arr2 = new int[arr1.length];
		for(int i = 0;i < arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		return arr2;
	}


}
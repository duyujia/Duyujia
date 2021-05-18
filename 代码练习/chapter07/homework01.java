public class homework01 {
	public static void main(String[] args) {
		T t = new T();
		double[] arr1 = {2.6,9.0,10.1};
		Double res = t.max(arr1);
		if (res !=null) {
			System.out.println("arr的最大值=" + res); 
		} else {
			System.out.println("arr输入有误"); 
		}
	}
}

class T {
	public Double max(double[] arr) {//Double表示double类

		if(arr != null && arr.length > 0) {
			double max = arr[0];
		for (int i = 1;i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

		} else {
			return null;
		}
		
	}

}
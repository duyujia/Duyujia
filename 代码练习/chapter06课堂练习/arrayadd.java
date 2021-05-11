public class arrayadd {
	public static void main(String[] args) {

		int[] arr = {1,2,3};
		//arr[3] = 4;不行下标不在指定范围内
		//定义一个新数组
		int[] arrnew = new int[arr.length+1];

		for ( int i =0;i < arr.length+1;i++) {//循环26次
			if(i <3) {
				arrnew[i] = arr[i];
			} else {
				arrnew[i] = 4;
			}
		}
		arr = arrnew;//让arr指向arrnew，arr = arrnew，将arrnew的地址赋给arr，没有对象指向原来arr的地址，那么原来arr数组就被销毁
		for(int i = 0;i < arrnew.length;i++) {
			System.out.print(arr[i] + " ");
		}

		
	}
} 
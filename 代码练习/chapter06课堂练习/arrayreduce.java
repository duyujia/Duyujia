import java.util.Scanner;
public class arrayreduce {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		//因为用户什么时候退出不知道，使用do-while + break来控制
		int[] arr = {1,2,3,4,5};
		do{
			int[] arrnew = new int[arr.length-1];

		for ( int i =0;i < arr.length-1;i++) {//循环26次
				arrnew[i] = arr[i];
			} 
		arr = arrnew;//让arr指向arrnew，arr = arrnew，将arrnew的地址赋给arr，没有对象指向原来arr的地址，那么原来arr数组就被销毁
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		} 
		if(arr.length > 1){
			System.out.println("是否继续删减 y/n");
		char key = myscanner.next().charAt(0);
			if(key == 'n') {
				break;
			} 
		}
		else {
			System.out.print("不能再删减");
					break;
				}
		}while(true);
	}
} 
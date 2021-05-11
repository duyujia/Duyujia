import java.util.Scanner;
public class arrayadd02 {
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		//因为用户什么时候退出不知道，使用do-while + break来控制
		int[] arr = {1,2,3};
		do{
			int[] arrnew = new int[arr.length+1];

		for ( int i =0;i < arr.length;i++) {//循环26次
				arrnew[i] = arr[i];
			} 
		System.out.println("请输入你要添加的元素");
		int addnum = myscanner.nextInt();
		arrnew[arr.length-1] = addnum;
		arr = arrnew;//让arr指向arrnew，arr = arrnew，将arrnew的地址赋给arr，没有对象指向原来arr的地址，那么原来arr数组就被销毁
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		} 
		System.out.println("是否继续添加 y/n");
		char key = myscanner.next().charAt(0);
		if(key == 'n') {
			break;
		}
	}while(true);
	}
} 
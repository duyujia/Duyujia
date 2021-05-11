public class homework04 {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 1;i <=100;i++) {
			if (i % 5 != 0) {
				count++;
				System.out.print(i +" ");//可使用制表位
				if(count % 5 ==0) {
					System.out.println("\n");
				}
			}
		//System.out.println("go on..");
		}
	}
}
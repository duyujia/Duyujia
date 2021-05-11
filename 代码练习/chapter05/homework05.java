public class homework05 {
	public static void main(String[] args) {
        int count = 0;
		for (int i = 97;i <=122;i++) {
			char c1 = (char)i;
			count++;
				System.out.print(c1 +" ");//可使用制表位
				if(count % 5 == 0) {
					System.out.println("\n");
				}
		//System.out.println("go on..");
		}
		System.out.println("\n");
		int count2 = 0;
		for(char c2='Z';c2 >='A';c2--) {
			count2++;
			System.out.print(c2 + " ");
			if(count2 % 5 == 0) {
					System.out.println("\n");
				}
		}
	}
}
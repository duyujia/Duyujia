public class for02{
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int count = 0;
		int start = 1;
		int end = 100;
		int t = 9;
		for (i=start;i<=end;i++) {
			if (i % t ==0) {
				sum += i;
				count +=1;
			}

		}
		System.out.println(sum);
		System.out.println(count);

		//化繁为简，先死后活
		int m = 0;
		for(;m<=5;m++) {
			System.out.println(m + "+" + (5-m) +"=5"); 
		}
	}
}
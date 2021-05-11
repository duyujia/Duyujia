public class while02{
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=100) {
			if (i % 3  ==0) {
				sum += i;
				System.out.println(i);
			}
			i++;
		}

		System.out.println(sum);
		System.out.println("ÍË³öwhile£¬¼ÌÐø");

		int j = 40;
		while (j <= 200) {
			if (j % 2 ==0 ) {

				System.out.println("j=" + j);
			}
			j++;
		}
	}
}
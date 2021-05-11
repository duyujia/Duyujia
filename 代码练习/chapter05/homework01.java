public class homework01{
	public static void main(String[] args) {
		double cash = 100000;
		double submit = 0;
		int i = 0;
		int j = 0;
		while (cash > 50000) {
			submit = cash * 0.05;
			cash -= submit;
			i++;
			if (cash <= 50000) {
				break;
			}
		} 
		while (cash <= 50000 && cash-1000 > 0){
		
				submit = 1000;
				cash -=1000;
				j++;
				if (cash-1000 < 0) {
					break;
				}
		}
		System.out.println(i+j);
	}
}
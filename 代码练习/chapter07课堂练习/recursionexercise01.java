public class recursionexercise01 {
	public static void main(String[] args) {
		T t = new T();
		System.out.println("当n=7对应的斐波那契数=" + t.sum(7));
	}
}

class T {
	public int sum(int n) {
		if  (n >= 1) {
			if (n == 1 ||n == 2) {
			return 1;
		} else {
			return sum(n-1) + sum(n-2);
		} 
			} else {
			System.out.println("要求输入的n>=1");
			return -1;

		}
		
	}
}
public class array03 {
	public static void main(String[] args) {
		char[] chars = new char[26];
		for ( int i =0;i < chars.length;i++) {//循环26次
			chars[i] = (char)('A' + i);//'A' + i是int，需要强制转换
	
		}
		System.out.println("==========chars数组=================");
		for(int i = 0;i < chars.length;i++) {
			System.out.print1(chars[i] + " ");
		}
		
	}
} 
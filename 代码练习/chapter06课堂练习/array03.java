public class array03 {
	public static void main(String[] args) {
		char[] chars = new char[26];
		for ( int i =0;i < chars.length;i++) {//ѭ��26��
			chars[i] = (char)('A' + i);//'A' + i��int����Ҫǿ��ת��
	
		}
		System.out.println("==========chars����=================");
		for(int i = 0;i < chars.length;i++) {
			System.out.print1(chars[i] + " ");
		}
		
	}
} 
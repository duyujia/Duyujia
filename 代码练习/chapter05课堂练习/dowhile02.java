import java.util.Scanner;
public class dowhile02{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("��Ǯ��");
			answer = myscanner.next().charAt(0);
			System.out.println("���Ļش���" + answer);
		}while( answer != 'y');
		System.out.println("�˳�while������");
	}
}
import java.util.Random;
import java.util.Scanner;

public class homework14 {
	public static void main(String[] args) { 
		Tom t = new Tom();
		//������¼�����Ӯ����
		int iswincount = 0;

		//����һ����ά���飬�������վ�����Tom��ȭ����Լ����Գ�ȭ���
		int[][] arr1 = new int[3][3];
		int j = 0;

		//����һ��һά���飬����������Ӯ���
		String[] arr2 = new String[3];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0;i < 3;i++) {//��������
			//��ȡ��ҳ���ȭ
			System.out.println("��������Ҫ����ȭ��0-ȭͷ��1-������2-������");
			int num = scanner.nextInt();
			t.settomguessnum(num);
			int tomguess = t.gettomguessnum();
			arr1[i][j+1] = tomguess;

			//��ȡ���Գ���ȭ
			int comguess = t.computernum();
			arr1[i][j+2] = comguess;

			//����Ҳµ�ȭ��������Ƚ�
			String iswin = t.vscomputer();
			arr2[i] = iswin;
			arr1[i][j] = t.count;

			//��ÿһ�ֵ�����������
			System.out.println("===================================");
			System.out.println("����\t��ҳ���ȭ\t���Գ���ȭ\t��Ӯ���\t");
			System.out.println(t.count +"\t" + tomguess + "\t\t" + comguess + "\t\t" + iswin);
			System.out.println("===================================");
			System.out.println("\n\n");
			iswincount = t.wincount(iswin);
		}

		//����Ϸ���ս���������
		System.out.println("����\t��ҳ���ȭ\t���Գ���ȭ\t��Ӯ���\t");
		for(int a = 0;a < arr1.length;a++) {
			for(int b = 0;b < arr1[a].length;b++) {
				System.out.print(arr1[a][b] + "\t\t\t");
			}
			System.out.print(arr2[a]);
			System.out.println();
		}
		System.out.println("��Ӯ��" + iswincount + "��");
	}
}

class Tom {

	//��ҳ�ȭ����
	int tomguessnum;
	//���Գ�ȭ����
	int comguessnum;
	//���Ӯ�ô���
	int wincountnum;
	//��������
	int count = 1;

	public void showinfo() {
		//...

	}

	public int computernum() {
			Random r = new Random();
			comguessnum = r.nextInt(3);//����������0-2�������
			return comguessnum;
	}

	public void settomguessnum(int tomguessnum) {
		if(tomguessnum > 2 || tomguessnum < 0) {
			throw new IllegalArgumentException("������������");
		} 
		this.tomguessnum = tomguessnum;
	}

	public int gettomguessnum() {
		return tomguessnum;
	}

	public String vscomputer() {
		if(tomguessnum == 0  &&  comguessnum == 1) {
			return "��Ӯ��";
		} else if (tomguessnum == 1  &&  comguessnum == 2) {
			return "��Ӯ��";
		} else if(tomguessnum == 2  &&  comguessnum == 0) {
			return "��Ӯ��";
		} else if (tomguessnum == comguessnum) {
			return "ƽ��";
		} else {
			return "������";
		}
	}

	public int wincount(String s) {
		count++;
		if(s.equals("��Ӯ��")) {
			wincountnum++;
		}
		return wincountnum;
	}
}
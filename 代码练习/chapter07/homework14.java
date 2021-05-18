import java.util.Random;
import java.util.Scanner;

public class homework14 {
	public static void main(String[] args) { 
		Tom t = new Tom();
		//用来记录最后输赢次数
		int iswincount = 0;

		//创建一个二维数组，用来接收局数，Tom出拳情况以及电脑出拳情况
		int[][] arr1 = new int[3][3];
		int j = 0;

		//创建一个一维数组，用来接收输赢情况
		String[] arr2 = new String[3];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0;i < 3;i++) {//比赛三次
			//获取玩家出的拳
			System.out.println("请输入你要出的拳（0-拳头，1-剪刀，2-布）：");
			int num = scanner.nextInt();
			t.settomguessnum(num);
			int tomguess = t.gettomguessnum();
			arr1[i][j+1] = tomguess;

			//获取电脑出的拳
			int comguess = t.computernum();
			arr1[i][j+2] = comguess;

			//将玩家猜的拳与电脑作比较
			String iswin = t.vscomputer();
			arr2[i] = iswin;
			arr1[i][j] = t.count;

			//对每一局的情况进行输出
			System.out.println("===================================");
			System.out.println("局数\t玩家出的拳\t电脑出的拳\t输赢情况\t");
			System.out.println(t.count +"\t" + tomguess + "\t\t" + comguess + "\t\t" + iswin);
			System.out.println("===================================");
			System.out.println("\n\n");
			iswincount = t.wincount(iswin);
		}

		//对游戏最终结果进行输出
		System.out.println("局数\t玩家出的拳\t电脑出的拳\t输赢情况\t");
		for(int a = 0;a < arr1.length;a++) {
			for(int b = 0;b < arr1[a].length;b++) {
				System.out.print(arr1[a][b] + "\t\t\t");
			}
			System.out.print(arr2[a]);
			System.out.println();
		}
		System.out.println("你赢了" + iswincount + "次");
	}
}

class Tom {

	//玩家出拳类型
	int tomguessnum;
	//电脑出拳类型
	int comguessnum;
	//玩家赢得次数
	int wincountnum;
	//比赛次数
	int count = 1;

	public void showinfo() {
		//...

	}

	public int computernum() {
			Random r = new Random();
			comguessnum = r.nextInt(3);//方法：返回0-2的随机数
			return comguessnum;
	}

	public void settomguessnum(int tomguessnum) {
		if(tomguessnum > 2 || tomguessnum < 0) {
			throw new IllegalArgumentException("数字输入有误");
		} 
		this.tomguessnum = tomguessnum;
	}

	public int gettomguessnum() {
		return tomguessnum;
	}

	public String vscomputer() {
		if(tomguessnum == 0  &&  comguessnum == 1) {
			return "你赢了";
		} else if (tomguessnum == 1  &&  comguessnum == 2) {
			return "你赢了";
		} else if(tomguessnum == 2  &&  comguessnum == 0) {
			return "你赢了";
		} else if (tomguessnum == comguessnum) {
			return "平手";
		} else {
			return "你输了";
		}
	}

	public int wincount(String s) {
		count++;
		if(s.equals("你赢了")) {
			wincountnum++;
		}
		return wincountnum;
	}
}
import java.util.Scanner;
public class seqsearch {
	public static void main(String[] args) {
		//定义一个字符串数组
		String[] names = {"一","二","三","五"}；
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String findname = myscanner.next();
		//遍历数组，主义比较，如果有，则提示信息，并退出
		int index = -1;
		for(int i = 0;i < names.length;i++) {
			if(findname.equals(names[i])) {
				System.out.println("找到" + findname);
				System.out.println("下标为=" + i);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("没找到" + findname);
		}
	}
} 
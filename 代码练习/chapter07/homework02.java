public class homework02 {
	public static void main(String[] args) {
		A02 a02 = new A02();
		String[] str = {"jack","tom","marry"};
		int index = a02.find("marry",str);
		if (index >= 0) {
			System.out.println("查找的index=" + index);
		} else if (index ==-1) {
			System.out.println("str无要查找的字符串");
		} else {
			System.out.println("str输入有误");
		}
		
	}
}


class A02 {
	public int find(String findstr,String[] str) {
		if (str !=null && str.length > 0) {
			for (int i = 0;i < str.length;i++) {
			if(findstr.equals(str[i])) {
				return i;
			}
		}
		//如果没有找到，返回-1
		return -1;

		} else {
			return -2;
		}
	}
}
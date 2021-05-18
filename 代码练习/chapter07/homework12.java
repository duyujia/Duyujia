public class homework12 {
	public static void main(String[] args) {
		Test t = new Test();
		
	}
}

class employee {
	String name;
	char gender;
	int age;
	String job;
	double sal;

	//ÒªÇó¿ÉÒÔ¸´ÓÃ¹¹ÔìÆ÷£¬ÏÈÐ´ÊôÐÔÉÙµÄ¹¹ÔìÆ÷
	public employee(String job,double sal) {
		this.job = job;
		this.sal = sal;
	}

	public employee(String name,char gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public employee(String job,double sal,String name,char gender,int age) {
		// this.job = job;
		// this.sal = sal;
		// this.name = name;
		// this.gender = gender;
		// this.age = age;
		this(name,gender,age);//Ê¹ÓÃÇ°ÃæµÄ¹¹ÔìÆ÷
		this.job = job;
		this.sal = sal;


}
}
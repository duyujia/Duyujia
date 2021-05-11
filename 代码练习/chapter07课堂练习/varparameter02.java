public class varparameter02 {
	public static void main(String[] args) {
		Methods t = new Methods();
		System.out.println( t.showscore("milan",90.1,80.0));


	}
}
class Methods {
	public String showscore(String name,double...scores) {
		double totalscore = 0;
		for (int i = 0;i < scores.length;i++) {
			totalscore += scores[i];
		}
		return name + "有" + scores.length + "门课的总分为=" + totalscore;
	}
} 
public class homework09 {
	public static void main(String[] args) {
		Music t = new Music("jack",200);
		t.play();
		System.out.println(t.getinfo());
	}
}

class Music {
	String name;
	int times;
	public Music(String name,int times) {
		this.name = name;
		this.times = times;
	}

	public void play() {
		System.out.println("����" + name + "���ڲ�����..ʱ��Ϊ" + times + "��");
	}

	public String getinfo() {
		return "����" + name + "����ʱ��" + times;
	}
}

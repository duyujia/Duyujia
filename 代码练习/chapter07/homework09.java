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
		System.out.println("音乐" + name + "正在播放中..时长为" + times + "秒");
	}

	public String getinfo() {
		return "音乐" + name + "播放时长" + times;
	}
}

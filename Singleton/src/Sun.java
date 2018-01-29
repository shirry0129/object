
public class Sun {
	private static Sun sun = new Sun();

	private Sun() {
		System.out.println("太陽出来上がり");
	}

	public static Sun getSun() {
		return sun;
	}

	public void getShine() {
		System.out.println("キラキラ");
	}
}

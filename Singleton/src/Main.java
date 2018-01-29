
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("世界の始まり");

		Sun sun = Sun.getSun();
		System.out.println("第1の太陽の光");
		sun.getShine();

		Sun sun2 = Sun.getSun();
		System.out.println("第2の太陽の光");
		sun2.getShine();

		System.out.println("第1の太陽の所在地:" + sun.toString());
		System.out.println("第2の太陽の所在地:" + sun2.toString());

		if(sun == sun2) {
			System.out.println("太陽は唯一の存在である");
		}else {
			System.out.println("Error:太陽が複数存在します");
		}
	}

}

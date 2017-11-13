
public class TonkotsuRamen extends Ramen implements Liquid, Spice {
	TonkotsuRamen(){
		System.out.println("豚骨ラーメンを作るよ");
	}

	@Override
	public void setSpice() {
		System.out.println("香辛料：コショウ");
	}

	@Override
	public void setLiquid() {
		System.out.println("液体：お酢");
	}

	@Override
	public void setTopping() {
		this.topping = "紅しょうが";
		System.out.println("トッピング：紅しょうが");
	}

}

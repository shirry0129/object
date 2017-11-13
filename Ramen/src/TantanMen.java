
public class TantanMen extends Ramen implements Spice, Liquid {
	TantanMen(){
		System.out.println("担々麺を作るよ");
	}

	@Override
	public void setLiquid() {
		System.out.println("液体：ラー油");
	}

	@Override
	public void setSpice() {
		System.out.println("香辛料：唐辛子");
	}

	@Override
	public void setTopping() {
		this.topping = "ひき肉";
        System.out.println("トッピング：ひき肉");
	}
}

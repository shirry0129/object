
public class MisoRamen extends Ramen {
	 MisoRamen(){
		 System.out.println("みそラーメンを作るよ");
	 }

	@Override
	public void setTopping() {
		topping = "ニンニク";
		System.out.println("トッピング：" + topping);
	}

	public void setSoup(Taste taste)
    {
        this.soup = Taste.みそ;
        System.out.println("スープ：" + this.soup);
    }
}

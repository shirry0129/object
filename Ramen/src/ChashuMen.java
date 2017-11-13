
public class ChashuMen extends Ramen {
	private int chashu;

	ChashuMen(){

	}

	ChashuMen(int men,int katasa,Taste taste){
		super(men,katasa,taste);
        System.out.println("指定済みのチャーシューメン作るよ");
	}

	public void setChashu(int chashu){
		this.chashu = chashu;
		System.out.println("チャーシュー：" + chashu);
	}

	@Override
	public void setSoup(Taste taste) {
		this.soup = Taste.しょうゆ;
        System.out.println("スープ：" + this.soup);
	}

	public void checkRamen(){
		super.checkRamen();
        System.out.print("チャーシュー：" + chashu);
        if(soup != Taste.しょうゆ)
        {
            System.out.println("\nしょうゆ味でないチャーシューメンはチャーシューメンではない！");
            System.out.println("しょうゆ味に変えます！");
            setSoup(Taste.しょうゆ);
        }
        System.out.println();
    }

	public void setTopping() {
		topping="なし";
	}
}

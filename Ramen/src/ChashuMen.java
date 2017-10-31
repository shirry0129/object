
public class ChashuMen extends Ramen {
	private int chashu;

	ChashuMen(){

	}

	public void setChashu(int chashu){
		this.chashu = chashu;
		System.out.println("チャーシュー：" + chashu);
	}

	public void checkChashuMen(){
        System.out.print("チャーシュー：" + chashu);
        if(soup != Taste.しょうゆ)
        {
            System.out.println("\nしょうゆ味でないチャーシューメンはチャーシューメンではない！");
            System.out.println("しょうゆ味に変えます！");
            setSoup(Taste.しょうゆ);
        }
    }
}


public class CornbutterMisoRamen extends Ramen {
	CornbutterMisoRamen(){
		System.out.println("コーンバターみそラーメンを作るよ");
	}

	@Override
	public void setTopping() {
		topping = "コーンバター";
		System.out.println("トッピング：" + topping);
	}

	public void setSoup(Taste taste)
    {
        this.soup = Taste.みそ;
        System.out.println("スープ：" + this.soup);
    }
}

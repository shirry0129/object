
public class Tanmen extends Ramen {
	private int yasai;	//1～3

	Tanmen(){
		System.out.println("タンメン作るよ");
	}

	Tanmen(int men,int katasa,Taste taste,int yasai){
		super(men,katasa,taste);
		System.out.println("指定されたタンメン作るよ");
		setYasai(yasai);
	}

	public void setYasai(int yasai)
	{
		this.yasai = yasai;
		System.out.println("野菜：" + yasai);
	}

	@Override
	public void setSoup(Taste taste) {
		this.soup=Taste.しお;
		System.out.println("スープ：" + this.soup);
	}

	public void checkRamen()
    {
		super.checkRamen();
        System.out.print("野菜：" + yasai);
        if(soup != Taste.しお)
        {
            System.out.println("\nしお味でないタンメンはタンメンではない！");
            System.out.println("しお味に変えます！");
            setSoup(Taste.しお);
        }
        System.out.println();
    }

	public void setTopping() {

	}
}


public class Tanmen extends Ramen {
	private int yasai;	//1～3

	Tanmen(){

	}

	public void setYasai(int yasai)
	{
		this.yasai = yasai;
		System.out.println("野菜：" + yasai);
	}

	public void checkTanmen()
    {
        System.out.print("野菜：" + yasai);
        if(soup != Taste.しお)
        {
            System.out.println("\nしお味でないタンメンはタンメンではない！");
            System.out.println("しお味に変えます！");
            setSoup(Taste.しお);
        }
    }
}

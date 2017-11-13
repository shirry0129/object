enum Taste{
	しょうゆ,みそ,しお
}


abstract public class Ramen {
	protected int katasa;//1：固い，2:普通，3:柔い
    protected int ryou;//1-10
    protected Taste soup;
    protected String topping;

    Ramen()
    {
        System.out.println("ラーメンつくるよ");
    }

    Ramen(int men,int katasa,Taste taste){
    	 System.out.println("指定のラーメンつくるよ");
         setMen(men);
         setKatasa(katasa);
         setSoup(taste);
    }

    public void setMen(int ryou)
    {
        this.ryou = ryou;
        System.out.println("量：" + ryou);
    }

    public void setKatasa(int katasa)
    {
        this.katasa = katasa;
        System.out.println("固さ：" + katasa);
    }

    public void setSoup(Taste taste)
    {
        this.soup = taste;
        System.out.println("スープ：" + this.soup);
    }

    public void checkRamen()
    {
        System.out.print("量：" + ryou);
        System.out.print("固さ：" + katasa);
        System.out.print("スープ：" + soup);
        System.out.print("トッピング："+topping);
    }

    abstract public void setTopping();
}

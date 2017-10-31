enum Taste{
	しょうゆ,みそ,しお
}


public class Ramen {
	protected int katasa;//1：固い，2:普通，3:柔い
    protected int ryou;//1-10
    protected Taste soup;

    Ramen()
    {
        System.out.println("ラーメンつくるよ");
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
        System.out.println("スープ：" + soup);
        System.out.print('\n');
    }
}

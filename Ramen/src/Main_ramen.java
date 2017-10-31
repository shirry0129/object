
public class Main_ramen {

	public static void main(String[] args) {
//		//ラーメンくれ
//        System.out.println("===ラーメン===");
//        Ramen ramen1 = new Ramen();
//        ramen1.setMen(5);
//        ramen1.setKatasa(2);
//        ramen1.setSoup(Taste.しょうゆ);
//        ramen1.checkRamen();
//
//        //固めん10盛りのみそラーメンくれ
//        System.out.println("===固めん，10盛り，みそ===");
//        Ramen ramen2 = new Ramen();
//        ramen2.setKatasa(1);
//        ramen2.setMen(10);
//        ramen2.setSoup(Taste.みそ);
//        ramen2.checkRamen();
//
//        System.out.println("===固めん，8盛り，しお===");
//        Ramen ramen3 = new Ramen();
//        ramen3.setKatasa(1);
//        ramen3.setMen(8);
//        ramen3.setSoup(Taste.しお);
//        ramen3.checkRamen();

//        System.out.println("==普通のチャーシュー麺");
//        ChashuMen chashuMen=new ChashuMen();
//        chashuMen.setMen(5);
//        chashuMen.setKatasa(2);
//        chashuMen.setChashu(5);
//        chashuMen.setSoup(Taste.みそ);
//        chashuMen.checkChashuMen();
//        chashuMen.checkRamen();


		System.out.println("===タンメン===");
        Tanmen tanmen = new Tanmen();
        tanmen.setKatasa(1);
        tanmen.setMen(10);
        tanmen.setYasai(2);
        tanmen.setSoup(Taste.みそ);
        tanmen.checkTanmen();
        tanmen.checkRamen();
	}

}

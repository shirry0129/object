
public class Main_ramen {

	public static void main(String[] args) {
		//みそラーメン
		System.out.println("===みそラーメン===");
		MisoRamen misoRamen = new MisoRamen();
		misoRamen.setMen(5);
		misoRamen.setKatasa(2);
		misoRamen.setSoup(Taste.しょうゆ);
		misoRamen.setTopping();
		misoRamen.checkRamen();
		System.out.println('\n');

		System.out.println("===コーンバターみそラーメン===");
		CornbutterMisoRamen cbMisoRamen = new CornbutterMisoRamen();
		cbMisoRamen.setMen(5);
		cbMisoRamen.setKatasa(2);
		cbMisoRamen.setSoup(Taste.しょうゆ);
		cbMisoRamen.setTopping();
		cbMisoRamen.checkRamen();
		System.out.println('\n');

		System.out.println("===普通のチャーシューメン===");
		ChashuMen chashuMenNormal = new ChashuMen(2,5,Taste.みそ);
		chashuMenNormal.setChashu(5);
		chashuMenNormal.setTopping();
		chashuMenNormal.checkRamen();
		System.out.println();

		System.out.println("===普通のタンメン===");
		Tanmen tanmenNormal = new Tanmen(2,5,Taste.みそ,3);
		tanmenNormal.setTopping();
		tanmenNormal.checkRamen();
		System.out.println();

		System.out.println("===みそラーメン（唐辛子つき！）===");
		MisoRamen miso = new MisoRamen();
		miso.setKatasa(5);
		miso.setMen(1);
		miso.setSoup(Taste.みそ);
		miso.setTopping();
		miso.checkRamen();
		miso.setSpice();
		System.out.println();

		//担々麺
		System.out.println("===担々麺===");
		TantanMen tantan = new TantanMen();
		tantan.setKatasa(5);
		tantan.setMen(2);
		tantan.setSoup(Taste.みそ);
		tantan.setTopping();
		tantan.setSpice();
		tantan.setLiquid();
		tantan.checkRamen();
		System.out.println('\n');

		System.out.println("===豚骨ラーメン===");
		TonkotsuRamen tonkotsu=new TonkotsuRamen();
		tonkotsu.setKatasa(5);
		tonkotsu.setMen(2);
		tonkotsu.setSoup(Taste.とんこつ);
		tonkotsu.setTopping();
		tonkotsu.setSpice();
		tonkotsu.setLiquid();
		tonkotsu.checkRamen();
		System.out.println('\n');
	}
}

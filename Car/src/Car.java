
public abstract class Car {
	protected int speed;
	protected int tire;
	protected int door;
	protected int gas;
	protected int nenpi;
	protected static int base_speed=100;
	protected static int base_door=5;
	protected static int base_tire=4;

	//デフォルトコンストラクタ
	Car(){
		System.out.println("車作成");
	}

	//コンストラクタ
	Car(int speed,int tire,int door){
		System.out.println("車作成");
		setSpeed(speed);
		setTire(tire);
		setDoor(door);
	}

	//最高速度の取得
	public int getSpeed() {
		return speed;
	}

	//タイヤの数の取得
	public int getTire() {
		return tire;
	}

	//ドア数の取得
	public int getDoor() {
		return door;
	}

	//燃料数の取得
	public int getGas() {
		return gas;
	}

	//燃費の取得
	public int getNenpi() {
		return nenpi;
	}

	//最高速度の設定
	public void setSpeed(int speed) {
		this.speed = speed;
		if(speed>200) {
			System.out.println("最高速度が速すぎます("+speed+"km/h).150km/hに設定します.");
			this.speed=150;
		}
		if(speed<100) {
			System.out.println("最高速度が遅すぎます("+speed+"km/h).150km/hに設定します.");
			this.speed=150;
		}
		System.out.println("最高速度:"+getSpeed()+"[km/h]");
	}

	//タイヤの数の設定
	public void setTire(int tire) {
		this.tire = tire;
		if(tire<4) {
			System.out.println("タイヤの数が少なすぎます.4輪に設定します.");
			this.tire=4;
		}
		if(tire>6) {
			System.out.println("タイヤの数が多すぎます.4輪に設定します.");
			this.tire=4;
		}
		System.out.println("タイヤ:"+getTire()+"輪");
	}

	//ドア数の設定
	public void setDoor(int door) {
		this.door = door;
		if(door<2) {
			System.out.println("ドアの数が少なすぎます.5ドアに設定します.");
			this.door=5;
		}
		if(door>5) {
			System.out.println("ドアの数が多すぎます.5ドアに設定します.");
			this.door=4;
		}
		System.out.println("ドア数:"+getDoor()+"ドア");
	}

	//燃料数の設定(abstract)
	public abstract void setGas();

	//燃費の設定(abstract)
	public abstract void setNenpi();

	//運転
	public void drive() {
		if(getGas()!=0) {
			System.out.print("ドドド");
			if(getGas() > getNenpi()) {
				gas -= nenpi;
			}else {
				gas = 0;
			}
			System.out.println("残燃料:"+getGas());
		}else {
			System.out.println("ガス欠です");
		}
	}
}
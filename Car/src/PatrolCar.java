
public class PatrolCar extends Car implements Siren {
	PatrolCar(){
		System.out.println("パトカー作成");
	}

	@Override
	public void callSiren() {
		System.out.println("ウーウー");
	}

	@Override
	public void setGas() {
		gas = 71;
	}

	@Override
	public void setNenpi() {
		nenpi = 10;
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
		if(speed>250) {
			System.out.println("最高速度が速すぎます.200km/hに設定します.");
			this.speed=200;
		}
		if(speed<150) {
			System.out.println("最高速度が遅すぎます.200km/hに設定します.");
			this.speed=200;
		}
		System.out.println("最高速度:"+this.speed+"[km/h]");
	}
}

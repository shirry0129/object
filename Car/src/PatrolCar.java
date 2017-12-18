
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
		System.out.println("積載燃料:"+getGas());
	}

	@Override
	public void setNenpi() {
		nenpi = 10;
		System.out.println("燃費:"+getNenpi());
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
		if(getSpeed()>250) {
			System.out.println("最高速度が速すぎます("+getSpeed()+"km/h).200km/hに設定します.");
			this.speed=200;
		}
		if(getSpeed()<150) {
			System.out.println("最高速度が遅すぎます("+getSpeed()+"km/h).200km/hに設定します.");
			this.speed=200;
		}
		System.out.println("最高速度:"+getSpeed()+"[km/h]");
	}
}

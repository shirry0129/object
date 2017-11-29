
public class Truck extends Car{
	private int nimotsu;

	public int getNimotsu() {
		return nimotsu;
	}

	public void setNimotsu(int nimotsu) {
		this.nimotsu = nimotsu;
		if(nimotsu>20) {
			System.out.println("最大積載量が多すぎます.1tに設定します.");
			this.nimotsu=1;
		}
		System.out.println("最大積載量:"+this.nimotsu+"[t]");
	}

	public Truck() {
		System.out.println("トラック作成");
	}

	@Override
	public void setGas() {
		gas = 70;
		System.out.println("積載燃料:"+gas);
	}

	@Override
	public void setNenpi() {
		nenpi = 13;
		System.out.println("燃費:"+nenpi);
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
		if(speed>150) {
			System.out.println("最高速度が速すぎます.120km/hに設定します.");
			this.speed=120;
		}
		if(speed<80) {
			System.out.println("最高速度が遅すぎます.120km/hに設定します.");
			this.speed=120;
		}
		System.out.println("最高速度:"+this.speed+"[km/h]");
	}
}

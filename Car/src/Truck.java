
public class Truck extends Car{
	private int nimotsu;

	public int getNimotsu() {
		return nimotsu;
	}

	public void setNimotsu(int nimotsu) {
		this.nimotsu = nimotsu;
		if(getNimotsu()>20) {
			System.out.println("最大積載量が多すぎます("+getNimotsu()+"t).1tに設定します.");
			this.nimotsu=1;
		}
		System.out.println("最大積載量:"+getNimotsu()+"[t]");
	}

	public Truck() {
		System.out.println("トラック作成");
	}

	@Override
	public void setGas() {
		gas = 70;
		System.out.println("積載燃料:"+getGas());
	}

	@Override
	public void setNenpi() {
		nenpi = 13;
		System.out.println("燃費:"+getNenpi());
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
		if(getSpeed()>150) {
			System.out.println("最高速度が速すぎます("+getSpeed()+"km/h).120km/hに設定します.");
			this.speed=120;
		}
		if(getSpeed()<80) {
			System.out.println("最高速度が遅すぎます("+getSpeed()+"km/h).120km/hに設定します.");
			this.speed=120;
		}
		System.out.println("最高速度:"+getSpeed()+"[km/h]");
	}
}

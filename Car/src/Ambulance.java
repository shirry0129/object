
public class Ambulance extends Car implements Siren {
	Ambulance(){
		System.out.println("救急車作成");
	}

	@Override
	public void callSiren() {
		System.out.println("ピーポー");
	}

	@Override
	public void setGas() {
		gas = 70;
		System.out.println("積載燃料:"+getGas());
	}

	@Override
	public void setNenpi() {
		nenpi = 10;
		System.out.println("燃費:"+getNenpi());
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("-----消防車を作ります-----");
		SirenCar fireEngine = new FireEngine(new FireEngineSiren(), new GasolineMovement());
		fireEngine.forward();
		fireEngine.turn(true);
		fireEngine.horn();
		fireEngine.work();

		System.out.println("-----救急車を作ります-----");
		SirenCar ambulance = new Ambulance(new AmbulanceSiren(), new GasolineMovement());
		ambulance.forward();
		ambulance.turn(false);
		ambulance.horn();
		ambulance.work();
	}

}

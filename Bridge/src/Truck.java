public class Truck extends Car {

	public Truck(Movement move) {
		super(move);
	}

	public void back() {
		System.out.print("ピーッピーッ");
		super.back();
	}

}


public class SirenCar {
	private Siren siren;
	private Movement move;

	SirenCar(Siren siren, Movement move) {
		this.siren = siren;
		this.move = move;
	}

	public void forward() {
		move.forward();
	}

	public void back() {
		move.back();
	}

	public void turn(Boolean side) {
		move.turn(side);
	}

	public void horn() {
		siren.horn();
	}

	public void work() {
		siren.work();
	}
}

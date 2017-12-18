
public class Car_Main {
	public static void main(String[] args) {
		System.out.println("===トラック===");
		Truck hino2ton = new Truck();
		hino2ton.setGas();
		hino2ton.setDoor(2);
		hino2ton.setTire(6);
		hino2ton.setNenpi();
		hino2ton.setSpeed(100);
		hino2ton.setNimotsu(50);
		for(int i=0;i<10;i++) {
			hino2ton.drive();
		}
		System.out.println();

		System.out.println("===救急車===");
		Ambulance kyukyu = new Ambulance();
		kyukyu.setGas();
		kyukyu.setDoor(3);
		kyukyu.setTire(4);
		kyukyu.setNenpi();
		kyukyu.setSpeed(500);
		for(int i=0;i<10;i++) {
			kyukyu.callSiren();
			kyukyu.drive();
		}
		System.out.println();

		System.out.println("===パトカー===");
		PatrolCar patrol = new PatrolCar();
		patrol.setGas();
		patrol.setDoor(4);
		patrol.setTire(4);
		patrol.setNenpi();
		patrol.setSpeed(200);
		for(int i=0;i<10;i++) {
			patrol.callSiren();
			patrol.drive();
		}
	}
}

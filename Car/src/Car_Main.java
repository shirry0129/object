
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
        hino2ton.drive();
        hino2ton.drive();
        hino2ton.drive();
        hino2ton.drive();
        System.out.println();
        
        System.out.println("===救急車===");
        Ambulance kyukyu = new Ambulance();
        kyukyu.setDoor(3);
        kyukyu.setSpeed(500);
        kyukyu.setTire(4);
        kyukyu.setGas();
        kyukyu.setNenpi();
        kyukyu.callSiren();
        System.out.println();
        
        System.out.println("===パトカー===");
        PatrolCar patrol = new PatrolCar();
        patrol.setDoor(4);
        patrol.setTire(4);
        patrol.setSpeed(200);
        patrol.setGas();
        patrol.setNenpi();
        patrol.callSiren();
        patrol.drive();
        patrol.callSiren();
        patrol.drive();
        patrol.callSiren();
        patrol.drive();
        patrol.callSiren();
        patrol.drive();
	}
}


public class Main {
	public static void main(String[] args){
		Queue tower=new Queue();
		Queue tower10=new Queue(10);

		System.out.println("");

		System.out.println("標準サイズのキュー");
		tower.enqueue(10);tower.showData();
		tower.enqueue(20);tower.showData();
		tower.enqueue(30);tower.showData();
		tower.enqueue(40);tower.showData();
		tower.enqueue(50);tower.showData();
		tower.enqueue(60);tower.showData();
		tower.enqueue(-1);tower.showData();
		//tower.data[3]=100;
		System.out.println("");

		tower.showData(3);System.out.println("");
		tower.showData(3, 5);
		System.out.println(tower.dequeue());tower.showData();
		System.out.println(tower.dequeue());tower.showData();
		System.out.println(tower.dequeue());tower.showData();
		System.out.println(tower.dequeue());tower.showData();
		System.out.println(tower.dequeue());tower.showData();
		System.out.println(tower.dequeue());tower.showData();
		System.out.println("");

		System.out.println("サイズ10のキュー");
		tower10.enqueue(10);tower10.showData();
		tower10.enqueue(20);tower10.showData();
		tower10.enqueue(30);tower10.showData();
		tower10.enqueue(40);tower10.showData();
		tower10.enqueue(50);tower10.showData();
		tower10.enqueue(60);tower10.showData();
		tower10.enqueue(70);tower10.showData();
		tower10.enqueue(80);tower10.showData();
		tower10.enqueue(90);tower10.showData();
		tower10.enqueue(100);tower10.showData();
		tower10.enqueue(110);tower10.showData();
		tower10.enqueue(-1);tower10.showData();
		//tower10.data[3]=100;
		System.out.println("");

		tower10.showData(3);System.out.println("");
		tower10.showData(3, 5);
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println(tower10.dequeue());tower10.showData();
		System.out.println("");
	}
}

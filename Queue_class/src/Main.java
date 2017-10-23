
public class Main {
	public static void main(String[] args){
		Queue tower=new Queue();
		tower.enqueue(10);tower.printStack();
		tower.enqueue(20);tower.printStack();
		tower.enqueue(30);tower.printStack();
		tower.enqueue(40);tower.printStack();
		tower.enqueue(50);tower.printStack();
		tower.enqueue(60);tower.printStack();
		System.out.println(tower.dequeue());tower.printStack();
		System.out.println(tower.dequeue());tower.printStack();
		System.out.println(tower.dequeue());tower.printStack();
		System.out.println(tower.dequeue());tower.printStack();
		System.out.println(tower.dequeue());tower.printStack();
		System.out.println(tower.dequeue());tower.printStack();
	}
}

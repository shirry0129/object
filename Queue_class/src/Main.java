
public class Main {
	public static void main(String[] args){
		Queue tower=new Queue();
		enqueue(tower,10);printStack(tower);
		enqueue(tower,20);printStack(tower);
		enqueue(tower,30);printStack(tower);
		enqueue(tower,40);printStack(tower);
		enqueue(tower,50);printStack(tower);
		enqueue(tower,60);printStack(tower);
		System.out.println(dequeue(tower));printStack(tower);
		System.out.println(dequeue(tower));printStack(tower);
		System.out.println(dequeue(tower));printStack(tower);
		System.out.println(dequeue(tower));printStack(tower);
		System.out.println(dequeue(tower));printStack(tower);
		System.out.println(dequeue(tower));printStack(tower);
	}
	//データ追加関数
	static void enqueue(Queue tower,int number)
	{
		if(tower.data.length > tower.volume)
		{
			tower.data[tower.volume] = number;
			tower.volume++;
			System.out.println(number + " inserted");
		}
		else
		{
			System.out.println("over flow!");
		}
	}

	//データ取得関数
	static int dequeue(Queue tower)
	{
		int returnValue = 0;
		if(tower.volume > 0)
		{
			returnValue =tower.data[0];
			for(int i=0;i<tower.volume-1;i++) {
				tower.data[i]=tower.data[i+1];
			}
			tower.data[tower.volume-1]=0;
			tower.volume--;
		}
		else
		{
			System.out.println("under flow!");
			returnValue = -1;
		}
		return returnValue;
	}

	//状態表示関数
	static void printStack(Queue tower)
	{
		System.out.print("|");
		for(int i=0; i < tower.data.length; i++)
		{
			System.out.print(tower.data[i]);
			System.out.print("|");
		}
		System.out.println("");
	}
}

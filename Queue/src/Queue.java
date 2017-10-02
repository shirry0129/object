
public class Queue {
	static int defaultSize = 5;
	static int queue[] = new int[defaultSize];
	static int volume = 0;
	public static void main(String[] args)
	{
		enqueue(10);printStack();
		enqueue(20);printStack();
		enqueue(30);printStack();
		enqueue(40);printStack();
		enqueue(50);printStack();
		enqueue(60);printStack();
		System.out.println(dequeue());printStack();
		System.out.println(dequeue());printStack();
		System.out.println(dequeue());printStack();
		System.out.println(dequeue());printStack();
		System.out.println(dequeue());printStack();
		System.out.println(dequeue());printStack();
	}
	//データ追加関数
	static void enqueue(int number)
	{
		if(queue.length > volume)
		{
			queue[volume] = number;
			volume++;
			System.out.println(number + " inserted");
		}
		else
		{
			System.out.println("over flow!");
		}
	}

	//データ取得関数
	static int dequeue()
	{
		int returnValue = 0;
		if(volume > 0)
		{
			returnValue =queue[0];
			for(int i=0;i<volume-1;i++) {
				queue[i]=queue[i+1];
			}
			queue[volume-1]=0;
			volume--;
		}
		else
		{
			System.out.println("under flow!");
			returnValue = -1;
		}
		return returnValue;
	}

	//状態表示関数
	static void printStack()
	{
		System.out.print("|");
		for(int i=0; i < queue.length; i++)
		{
			System.out.print(queue[i]);
			System.out.print("|");
		}
		System.out.println("");
	}
}

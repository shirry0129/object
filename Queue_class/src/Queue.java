
public class Queue {
	int volume;
	int data[]=new int[5];

	//データ追加関数
	void enqueue(int number)
	{
		if(data.length > volume)
		{
			data[volume] = number;
			volume++;
			System.out.println(number + " inserted");
		}
		else
		{
			System.out.println("over flow!");
		}
	}

	//データ取得関数
	int dequeue()
	{
		int returnValue = 0;
		if(volume > 0)
		{
			returnValue = data[0];
			for(int i=0;i<volume-1;i++) {
				data[i]=data[i+1];
			}
			data[volume-1]=0;
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
	void printStack()
	{
		System.out.print("|");
		for(int i=0; i < data.length; i++)
		{
			System.out.print(data[i]);
			System.out.print("|");
		}
		System.out.println("");
	}
}

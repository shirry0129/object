
public class Queue {
	private int volume;
	private int data[];
	static int defaultSize=5;
	static int queueCount=0;

	//デフォルトコンストラクタ
	public Queue(){
		this(defaultSize);
	}

	public Queue(int queueSize){
		data=new int[queueSize];
		System.out.println(data.length+"個分のキュー生成");
		queueCount++;
	}

	//データ追加関数
	public boolean enqueue(int number)
	{
		if(number>0) {
			if(data.length > volume)
			{
				data[volume] = number;
				volume++;
				System.out.println(number + " inserted");
				return true;
			}
			else
			{
				System.out.println("over flow!");
				return false;
			}
		}else {
			System.out.println("input value invalid");
			return false;
		}
	}

	//データ取得関数
	public int dequeue()
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
	public void printStack()
	{
		System.out.print("|");
		for(int i=0; i < data.length; i++)
		{
			System.out.print(data[i]);
			System.out.print("|");
		}
		System.out.println("");
	}

	public static int queueVolume() {
		return queueCount;
	}
}

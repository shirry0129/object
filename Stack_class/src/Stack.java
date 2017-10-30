
public class Stack {
	private int volume;
	private int data[];
	static int defaultSize=5;
	static int stackCount=0;

	//デフォルトコンストラクタ
	public Stack(){
		this(defaultSize);
	}

	public Stack(int stackSize){
		data=new int[stackSize];
		System.out.println(data.length+"個分のスタック生成");
		stackCount++;
	}

	//データ追加関数
	public boolean push(int number)
	{
		if(number>0) {
			if(volume < data.length)
			{
				data[volume] = number;
				volume++;
				return true;
			}
			else
			{
				System.out.println("stack overflow");
				return false;
			}
		}else {
			System.out.println("input value invalid");
			return false;
		}
	}

	//データ取得関数
	public int pop()
	{
		int value;
		if(volume > 0)
		{
			value = data[volume -1];
			data[volume -1] = 0;
			volume--;
		}
		else
		{
			value = -1;
		}
		return value;
	}

	//状態表示関数(全体)
	public void printStack()
	{
		System.out.print("|");
		for(int i=0; i < data.length; i++)
		{
			printStack(i);
			System.out.print("|");
		}
		System.out.println("");
	}

	//状態表示関数(単体)
	private void printStack(int i) {
		System.out.print(data[i]);
	}

	public static int stackVolume() {
		return stackCount;
	}
}
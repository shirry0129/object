
public class Stack {
	int volume;
	int data[];
	static int defaultSize=5;

	//デフォルトコンストラクタ
	Stack(){
		data=new int[defaultSize];
		System.out.println(data.length+"個分のスタック生成");
	}

	Stack(int stackSize){
		data=new int[stackSize];
		System.out.println(data.length+"個分のスタック生成");
	}

	//データ追加関数
	boolean push(int number)
	{
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
	}

	//データ取得関数
	int pop()
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

	//状態表示関数(単体)
	void printStack(int i) {
		System.out.print('|');
		System.out.println(data[i]+"|");
	}
}
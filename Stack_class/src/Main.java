
public class Main {
	public static void main(String args[]) {
		Stack tower = new Stack();
		push(tower,10);printStack(tower);
		push(tower,20);printStack(tower);
		push(tower,30);printStack(tower);
		push(tower,40);printStack(tower);
		push(tower,50);printStack(tower);
		push(tower,60);printStack(tower);
		System.out.println(pop(tower));printStack(tower);
		System.out.println(pop(tower));printStack(tower);
		System.out.println(pop(tower));printStack(tower);
		System.out.println(pop(tower));printStack(tower);
		System.out.println(pop(tower));printStack(tower);
		System.out.println(pop(tower));printStack(tower);
	}
	//データ追加関数
	static boolean push(Stack stack,int number)
	{
		if(stack.volume < stack.data.length)
		{
			stack.data[stack.volume] = number;
			stack.volume++;
			return true;
		}
		else
		{
			System.out.println("stack overflow");
			return false;
		}
	}
	//データ取得関数
	static int pop(Stack stack)
	{
		int value;
		if(stack.volume > 0)
		{
			value = stack.data[stack.volume -1];
			stack.data[stack.volume -1] = 0;
			stack.volume--;
		}
		else
		{
			value = -1;
		}
		return value;
	}
	//状態表示関数
	static void printStack(Stack stack)
	{
		System.out.print("|");
		for(int i=0; i < stack.data.length; i++)
		{
			System.out.print(stack.data[i]);
			System.out.print("|");
		}
		System.out.println("");
	}
}

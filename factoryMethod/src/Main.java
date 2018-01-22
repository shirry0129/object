import factory.FridgeFactory;
import factory.TVfactory;
import template.KadenFactory;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		KadenFactory tvFactory = new TVfactory();
		tvFactory.working();
		KadenFactory fridgeFactory = new FridgeFactory();
		fridgeFactory.working();
	}

}

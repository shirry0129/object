package factory;

import template.Kaden;
import template.KadenFactory;

public class FridgeFactory extends KadenFactory {

	@Override
	protected Kaden making() {
		// TODO 自動生成されたメソッド・スタブ
		return new Fridge();
	}

	@Override
	protected void provide(Kaden kaden) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(kaden.introduction() + "作成しました.");
	}

}

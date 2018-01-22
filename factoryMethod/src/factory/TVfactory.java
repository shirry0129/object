package factory;

import template.Kaden;
import template.KadenFactory;

public class TVfactory extends KadenFactory {

	@Override
	protected Kaden making() {
		// TODO 自動生成されたメソッド・スタブ
		return new TV();
	}

	@Override
	protected void provide(Kaden kaden) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(kaden.introduction() + "作成しました.");
	}

}

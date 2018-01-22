package factory;

import template.Kaden;

public class Fridge extends Kaden {

	public Fridge() {
		setKadenname("Fridge");
	}

	@Override
	public String introduction() {
		// TODO 自動生成されたメソッド・スタブ
		return getKadenname() + "一台";
	}

}

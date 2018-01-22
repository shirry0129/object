package factory;

import template.Kaden;

public class TV extends Kaden {

	public TV() {
		setKadenname("TV");
	}

	@Override
	public String introduction() {
		// TODO 自動生成されたメソッド・スタブ
		return getKadenname() + "一台";
	}

}

package template;

public abstract class Kaden {
	private String kadenname;

	public String getKadenname() {
		return kadenname;
	}

	public void setKadenname(String order) {
		kadenname = order;
	}

	public abstract String introduction();
}

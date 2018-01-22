package template;

public abstract class KadenFactory {
	protected abstract  Kaden making();
	protected abstract void provide(Kaden kaden);

	public void working() {
		Kaden kaden = making();
		provide(kaden);
	}
}

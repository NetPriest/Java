package factorymethod;

public class Bikes extends ToyProduct {
	@Override
	public void prepare() {
		System.out.println(" Preparing Bikes! ");
	}
}

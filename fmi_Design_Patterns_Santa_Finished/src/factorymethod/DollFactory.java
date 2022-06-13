package factorymethod;

public class DollFactory extends ToyFactory {

	@Override
	public ToyProduct createProduct(String productName) {
		if(productName == "DOLL") {
			return new Dolls();
		}
		System.out.println("Unknown toy product");
		return null;
	}

}

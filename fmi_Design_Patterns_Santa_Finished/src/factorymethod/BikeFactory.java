package factorymethod;

public class BikeFactory extends ToyFactory {

	@Override
	public ToyProduct createProduct(String productName) {
		if(productName == "BIKE") {
			return new Bikes();
		}
		System.out.println("Unknown toy product");
		return null;
	}

}

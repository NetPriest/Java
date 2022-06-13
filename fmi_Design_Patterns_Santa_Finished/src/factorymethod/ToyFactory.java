package factorymethod;

public abstract class ToyFactory {

	public abstract ToyProduct createProduct(String productName);
	
	public ToyProduct produceProduct(String productName) {
		ToyProduct product = createProduct(productName);
		product.prepare();
		return product;
	}
}

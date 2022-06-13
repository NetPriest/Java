package factorymethod;

public abstract class ToyProduct {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void prepare();

}

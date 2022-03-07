package Sample;

public class Product {
	private String name;
	private double price;
	private int stock;

	public Product() {
	}

	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}

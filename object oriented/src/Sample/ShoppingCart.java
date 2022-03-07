package Sample;

public class ShoppingCart {
	private int total;
	private int products;
	private Product p;
	int[] Product = new int[products];

	public ShoppingCart() {
	}

	public ShoppingCart(int total, int products, int[] product) {
		this.total = total;
		this.products = products;
		Product = product;
	}
	
	public void addToCart(Product p, int qty) {
		
	}
	public void checkout() {
		
	}
}
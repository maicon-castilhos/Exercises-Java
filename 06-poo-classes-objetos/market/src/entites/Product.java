package entites;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double valueInStock() {
		return price * quantity;
	}

	public void addItemsStock(int quantity) {
		this.quantity += quantity;
	}

	public void removeStock(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", R$ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, total value R$ "
				+ String.format("%.2f", valueInStock());

	}

}
package Entities;

public class Product {

	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double applyDiscount(double percent){
		return price -= price * percent;
	}
	public double totalValue() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return "ID: " 
				+ id 
				+ " | " 
				+ name 
				+ " | " 
				+ String.format("R$ %.2f", price) 
				+ " | quantity = " 
				+ quantity 
				+ " | Total: "
				+ String.format("R$ %.2f%n" , totalValue());
	}
	
}

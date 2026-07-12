package entities;

public class Client {
	private int id;
	private String name;
	private String email;
	private int points;
	
	public Client(int id, String name, String email, int points) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.points = points;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public void addPoints(double purchaseValue) {
		points += (int) Math.floor(purchaseValue / 10.0);
	}

	@Override
	public String toString() {
		return "ID: " 
				+ id 
				+ " | " 
				+ name 
				+ " | "
				+ email 
				+ " | Points: " 
				+ points;
	}
	
}

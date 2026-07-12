package entities;

public class employees {
	private String name;
	private double salary;
	private int id;

	public employees(String name, double salary, int id) {

		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	public void IncreaseSalary(double percentSalary) {
		salary += (salary * percentSalary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return 	String.format("ID: %d ", id) 
		        +  name 
		        + ", salary: " 
		        + String.format("R$ %.2f" , salary); 
	}
	
	
}

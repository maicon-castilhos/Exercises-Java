package Entities;

public class increase {
	public String name;
	public double salary, tax, percentage, liquid;

	//salário liquido
	public double netSalary () {
		return salary - tax;
	}
	//porcentagem do salario
	public double increaseSalary(Double percentage) {
		return salary += salary * percentage / 100 - tax;
	}	
}
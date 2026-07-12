package employees_increase_salary;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.employees;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();
		ArrayList<employees> employees = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee " + (i + 1) + "# ");
			System.out.print("ID: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			employees.add(new employees(name, salary, id));
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSearch = sc.nextInt();
		
		System.out.print("Enter the percent: ");
		double percentIncrease = sc.nextDouble();
		
		employees employeesSearch = employees.stream().filter(u -> u.getId() == idSearch)
				.findFirst().orElse(null);
		if (employeesSearch != null) {
		    employeesSearch.IncreaseSalary(percentIncrease / 100); // aplica o aumento
		} else {
		    System.out.println("Employee not found!");
		}
		for (employees e : employees) {
		    System.out.println(e);
		} 
		sc.close();
	} 
}

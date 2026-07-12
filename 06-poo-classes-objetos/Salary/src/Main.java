import java.util.Locale;
import java.util.Scanner;

import Entities.increase;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		increase Increase = new increase();
		System.out.println("I need data for employee salary: ");
		System.out.print("Name: ");
		Increase.name = sc.nextLine();
		System.out.println();
		
		System.out.print("Gross salary: ");
		Increase.salary = sc.nextDouble();
		System.out.println();
		
		System.out.print("Tax about this salary: ");
		Increase.tax = sc.nextDouble();
		
		System.out.printf("%s will receive R$ %.2f%n" , Increase.name, Increase.netSalary());
		System.out.println("Wich percentage increase in salary: ");
		Increase.percentage = sc.nextDouble();
		
		System.out.printf("Updated net salary: R$ %.2f" , 
				Increase.increaseSalary(Increase.percentage));
		
		sc.close();
	}

}

package market;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Product product = new Product();
		System.out.println("Product data:");
		System.out.print("Product name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		System.out.println();
		
		System.out.println("Enter the number of added products in stock: ");
		int quantity = sc.nextInt();
		product.addItemsStock(quantity);

		System.out.print("Update stock: " + product);
		System.out.println();
		
		System.out.print("Enter the number of remove products in sotck: ");
		quantity = sc.nextInt();
		product.removeStock(quantity);
		System.out.println();
		System.out.print("Update stock: " + product);

		sc.close();

	}

}

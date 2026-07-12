import java.util.Locale;
import java.util.Scanner;

import Product.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();

		System.out.println("Please provide the product details.");
		System.out.print("Name: ");
		product.name = sc.nextLine();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();

		System.out.printf("We have %s, total of %d units in stock, with a total value of R$ %.2f%n", product.name,
				product.quantity, product.totalValueInStock());
		System.out.println("Enter the quantity to add to inventory: ");
		product.addProducts(sc.nextInt());
		System.out.printf(
				"We've updated our inventory and we have %s, total of %d units in stock, with a total value of R$ %.2f%n",
				product.name, product.quantity, product.totalValueInStock());
		System.out.print("Enter the quantity to remove to inventory: ");
		product.removeProducts(sc.nextInt());
		System.out.printf(
				"We've updated our inventory and we have %s, total of %d units in stock, with a total value of R$ %.2f%n",
				product.name, product.quantity, product.totalValueInStock());

	}

}

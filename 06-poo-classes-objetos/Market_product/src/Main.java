import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Enter number of products: ");
		int p = sc.nextInt();

		ArrayList<Product> product = new ArrayList<>();
		for (int n = 0; n < p; n++) {
			System.out.println("Product " + (n + 1) + "#");
			System.out.print("ID: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextDouble();

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			product.add(new Product(id, name, price, quantity));
		}

		System.out.print("Enter product ID to apply discount: ");
		int idSearch = sc.nextInt();
		System.out.print("Enter the percent: ");
		double percentIncrease = sc.nextDouble();
		Product productSearch = product.stream().filter(u -> u.getId() == idSearch).findFirst().orElse(null);

		if (productSearch != null) {
			productSearch.applyDiscount(percentIncrease / 100);
		} else {
			System.out.println("Product not found!");
		}

		for (Product p2 : product) {
			System.out.print(p2);
		}
		sc.close();
	}

}

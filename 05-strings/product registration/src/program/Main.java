package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		List<Product> products = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported? (c/u/i): ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			Product product = null;
			
			switch (type) {
			case 'c':
				product = new Product(name, price);
				break;
			case 'u':
			    System.out.print("Manufacture date (DD/MM/YYYY): ");
			    LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), 
			        DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			    product = new UsedProduct(name, price, manufactureDate);
			    break;
			case 'i':
				 System.out.print("Customs fee: ");
                 double customsFee = sc.nextDouble();
                 product = new ImportedProduct(name, price, customsFee);
				break;
			default:
                System.out.println("Invalid type! Skipping product.");
                continue; 
			}
			products.add(product);
		}
		System.out.println("\nPRICE TAGS:");
        for (Product prod : products) {
            System.out.println(prod.priceTag());
        }

		sc.close();
	}

}

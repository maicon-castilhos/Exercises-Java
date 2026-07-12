import java.util.Locale;
import java.util.Scanner;

import entities.Book;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Enter Book Title: ");
		String title = sc.nextLine();
		System.out.print("Enter Book Author: ");
		String author = sc.nextLine();
		System.out.print("Enter total pages: ");
		int totalPages = sc.nextInt();
		System.out.print("Enter days to borrow: ");
		int days = sc.nextInt();

		Book book = new Book(title, author, totalPages);

		System.out.print("Book data: ");
		System.out.print(book.toString());
		System.out.println();

		System.out.printf("Total borrow value for %d days: R$ %.2f\n", days, book.borrowBook(days));
		System.out.print("Enter days late for return: ");
		sc.nextLine();
		int daysLate = sc.nextInt();
		if (daysLate > 0) {
			System.out.printf("Fine for %d days late: R$ %.2f", daysLate, book.returnBook(daysLate));
		} else
			System.out.print("Book received on time.");
		sc.close();
	}

}

package entities;

public class Book {

	private String title;
	private String author;
	private int totalPages;

	private static final double TAX = 2.50;
	private static final double FINE = 5.00;
	
	public Book(String title, String author, int totalPages) {
		this.title = title;
		this.author = author;
		this.totalPages = totalPages;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public double borrowBook(int days) {
		return  days * TAX; 
	}
	public double returnBook(int daysLate) {
		
			return daysLate * FINE;
	}
	public String toString(){
		return title
				+ " - "
				+ author
				+ " | "
				+ totalPages
				+ " pages ";
	}

}

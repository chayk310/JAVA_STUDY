package icehs.science.workshop03.book;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private int price;
	private String issueDate;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String isbn, String title, String author, int price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book(String isbn, String title, String author, int price, String issueDate) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.issueDate = issueDate;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPrice() {
		return price;
	}
	
	public void printBookInfo() {
		System.out.println("[����] : " + this.title + " [����] : " + this.author );
	}
	
	public void printDate(String date) {
		// " [����] : " + this.price + " [������] : " + this.issueDate
	}
}

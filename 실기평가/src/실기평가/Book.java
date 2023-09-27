package 실기평가;


public class Book {
	private String bookCode;
	private String bookTitle;
	private String author;
	
	public Book() {
	}
	
	public Book(String bookCode, String bookTitle, String author) {
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
	}
	
	public void printInfo() {
		System.out.println(bookCode + " "+bookTitle +" "+author);
	}
}

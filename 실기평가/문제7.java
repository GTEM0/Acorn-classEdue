package 곽단야실기평가;

public class 문제7 {
	private String bookCode;
	private String bookTitle;
	private String author;
	
	public 문제7() {
	}
	
	public 문제7(String bookCode, String bookTitle, String author) {
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
	}
	
	public void printInfo() {
		System.out.println(bookCode + " "+bookTitle +" "+author);
	}
}

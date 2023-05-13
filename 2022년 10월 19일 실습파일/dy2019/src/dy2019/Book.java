package dy2019;

public class Book {
	String title;
	String author;
	public Book() {}
	
	public Book(String title) { // 생성자
		this.title = title; this.author = "작자미상";
		}
	public Book(String title, String author) { // 생성자
		this.title = title; this.author = author;
		}
	public void printBook() {
		System.out.println(" 제목은 " + this.title+" 저자는 " +this.author);
	}

}

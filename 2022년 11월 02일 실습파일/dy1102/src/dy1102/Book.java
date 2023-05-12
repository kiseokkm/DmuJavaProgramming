package dy1102;    // 예제 4-5 this()로 다른 생성자 호출
//설계도

public class Book {
	//1필드 변수
	String title;
	String author;
	//2번 생성자
	public Book() {}
	
	public Book(String title) {
		this(title,"작자미상");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	//3번 메소드
	void show() {
		System.out.println(title+","+author);
	}
	public int add(int i , int j) {
		return i + j;
	}
	public int add(int i, int j, int k) {
		return i + j+ k;
	}
	public double add(double i,double j) {
		return i+j;
	}
}

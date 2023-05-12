package dy1102;

public class Circle {
 //1번필드
	int radius;
	//2 생성자
	public Circle() {}
	public Circle(int radius) {
		this.radius = radius;
	}
	//3 메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

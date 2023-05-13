package dy2019;

public class Circle {
	int radius;
	String name;
	//1번 생성자
	public Circle() {};
	//2번 생성자
	public Circle(int ra,String na) {
		radius= ra;
		name = na;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

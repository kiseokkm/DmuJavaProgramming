package dy1116;

public class Circle extends shape {
	private int radius;
	
	public Circle() {}
	public Circle(String name,int radius) {
		super(name);
		this.radius=radius;
	}
@Override
public void draw() {
	System.out.println("원을 그립니다.");
}
	@Override
	public void printArea() {
		double area = 3.14 * radius * radius;
		System.out.println("원의면적="+area);
	}
	@Override
	public void printGill() {
		// TODO Auto-generated method stub
		double gill = 3.14 * radius * 2;
		System.out.println("원이 길이="+gill);
	}
	
}

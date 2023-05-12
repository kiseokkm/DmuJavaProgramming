package dy1116;

class shape{
	static int count;
	
	private String name;
	
	public shape() {}
	public shape(String name) {
		this.name=name;
		count++;
	}
	public void draw() {
		System.out.println("도형(shape)을 그려요.");
	}
	public void printArea() {
		System.out.println("도형 면적 구하기");
	}
	public void printGill() {
		System.out.println("도형 둘레 길이 구하기");
	}
}
class rect extends shape{
	private int width;
	private int height;
	
	public rect() {}
	public rect(String name,int width,int height) {
		super(name);
		this.width=width;
		this.height=height;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형(rect)그리기");
	}
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		int area = width * height;
		System.out.println("사각형의 면적="+area);
	}
	@Override
	public void printGill() {
		// TODO Auto-generated method stub
		int gill = (width+height)*2 ;
		System.out.println("사각형의 길이 ="+gill);
	}
}
public class MethodEx {

	public static void main(String[] args) {
		shape sh1 = new shape("도형");
		sh1.draw();
		sh1.printArea();
		sh1.printGill();
		System.out.println("만들어진 도형 수="+shape.count);
		
		
		
		rect rect1 = new rect("tv",65,40);
		rect1.draw();
		rect1.printArea();
		rect1.printGill();
		System.out.println("만들어진 도형 수 ="+shape.count);
		
		
		
		
		Circle cir1 = new Circle("불고기피자",10);
		cir1.draw();
		cir1.printArea();
		cir1.printGill();
		System.out.println("도형수="+shape.count);

	}

}

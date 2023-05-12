package exec;

abstract public class Shape {
	static int count;
	
	private String name;
	
	public Shape() {
		count ++;
	}
	public Shape(String name) {
		this.name=name;
		count++;
	}
	abstract public void draw();
	abstract public void printArea();
	abstract public void printGill();
}
class rect extends Shape{
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
	
	
	
	
	
	class Circle extends Shape{
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
}

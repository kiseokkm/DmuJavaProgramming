package exec;

import dy1116.Circle;

public class MethodEx {

	public static void main(String[] args) {
		
		rect rect1 = new rect("tv",65,40);
		rect1.draw();
		rect1.printArea();
		rect1.printGill();
		System.out.println("만들어진 도형 수 ="+Shape.count);
		
		rect rect2 = new rect("자바책",10,15);
		rect2.draw();
		rect2.printArea();
		rect2.printGill();
		System.out.println("만들어진 도형 수 ="+Shape.count);
		
		Circle cir1 = new Circle("불고기피자",10);
		cir1.draw();
		cir1.printArea();
		cir1.printGill();
		System.out.println("도형수="+Shape.count);
		
		Circle cir2 = new Circle("축구공",2);
		cir2.draw();
		cir2.printArea();
		cir2.printGill();
		System.out.println("도형수="+Shape.count);

	}

}

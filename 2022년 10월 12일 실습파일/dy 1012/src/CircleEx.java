
public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(); //객체, 변수
		pizza.name = "자바피자";
		pizza.radius = 10;
		double area =pizza.getArea();
		System.out.println(pizza.name+"의 면적은"+area);
		
		Circle pizza2 = new Circle();
		pizza2.name = "불고기피자";
		pizza2.radius = 6;
		area = pizza2.getArea();
		System.out.println(pizza2.name+"의 면적은 "+ area);
		
		Circle pizza3 = new Circle();
		pizza3.name = "치즈피자";
		pizza3.radius = 7;
		area = pizza3.getArea();
		System.out.println(pizza3.name+"의 면적은 "+ area);
		
	
	}

}

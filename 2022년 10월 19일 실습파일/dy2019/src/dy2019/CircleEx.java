package dy2019;

public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle();
		pizza.radius = 8;
		pizza.name = "불고기피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의면적="+area);
		Circle bulpizza = new Circle(8, "불고기피자");
		System.out.println(bulpizza.name+"면적="+area);
		Circle gong 	= new Circle(4, "축구공");
		area = gong.getArea();
		System.out.println(gong.name+"의면적="+area);

	}

}

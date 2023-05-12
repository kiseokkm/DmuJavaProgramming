
import java.util.Scanner;

public class RecEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Rectangle rect = new Rectangle();
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.println("사각형의 면적은"+rect.getArea());
		sc.close();

	}

}

package dy1102;

public class CircleEx {

	public static void main(String[] args) {
		// 배열 만들기
		@SuppressWarnings("unused")
		int Arr[] = new int[100];
	Circle cArr[] = new Circle[100];
	for ( int i=0; i<cArr.length;i++) {
		cArr[i] = new Circle(i);
	}
	for ( int i=0; i<cArr.length ; i++) {
		System.out.print((int)(cArr[i].getArea()) + " ");
	}
	}

}

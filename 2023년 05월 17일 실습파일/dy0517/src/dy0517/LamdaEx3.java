package dy0517;

interface MyFunction {
	void print();
}

public class LamdaEx3 {

	public static void main(String[] args) {
		MyFunction f = () -> { //람다식작성
			System.out.println("Hello");
		};
		
		f.print(); // 람다호출
		
		f=()-> System.out.println("안녕");
		
		f.print(); //람다식 호출

	}

}

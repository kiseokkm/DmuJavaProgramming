package dy0517;

@FunctionalInterface
interface SumInterface {
	int plus(int x ,int y); //public abstract 자동으로 만들어 짐.
}
interface CalcInterface {
	int calc(int x,int y);
}

public class LamdaEx1 {
	static int add (int x , int y) {
		return x+y;
	}
	static int sub (int x , int y) {
		return x-y;
	}
	static int mul (int x , int y) {
		return x*y;
	}

	public static void main(String[] args) {

		
		System.out.println("더하기"+ add(20,10));
		System.out.println("빼기 "+ sub(20,10));
		System.out.println("곱하기 "+ mul(20,10));
		//interface variable(변수) = 람다식(Lamda exp)
		SumInterface sum = (x , y) ->  x + y ;
		System.out.println("람다식 더하기"+sum.plus(20, 10));
		
		//CalcInterface로 람다식 더하기 빼기 곱하기 나누기 나머지
		CalcInterface add = (x, y) ->  x + y; 
		System.out.println(add.calc(1, 2)); 
		
		CalcInterface minus = (x, y) -> x - y;
		System.out.println(minus.calc(1, 2));
		
		CalcInterface mul = (x, y) ->   x * y; 
		System.out.println(mul.calc(1, 2));
		
		CalcInterface divide = (x, y) ->  x / y; 
		System.out.println(divide.calc(1, 2));
		
		CalcInterface remainder = (x, y) ->  x % y;
		System.out.println(remainder.calc(1, 2));
		
		
	}



}

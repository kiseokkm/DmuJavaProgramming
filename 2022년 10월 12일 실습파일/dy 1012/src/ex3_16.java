//ArrayIndexOutOfBoundsException( 배열의 범위를 벗어난 접근 시 발생 ) 외우기
public class ex3_16 {
	public static void main (String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
		for (int i=0; i<intArray.length; i++) {
		intArray[i+1] = i+1 + intArray[i];
		System.out.println("intArray["+i+"]"+"="+intArray[i]);
		}
	}
		catch (Exception e) {
		System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		e.printStackTrace();
		}
	}
}

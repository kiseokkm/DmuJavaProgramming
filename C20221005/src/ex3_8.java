import java.util.Scanner;
//배열 원소의 평균 구하기
public class ex3_8 {
	public static void main(String[] args) {
		int intArray[] = new int[5]; 
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");
		for(int i=0; i<intArray.length; i++)
		intArray[i] = scanner.nextInt(); 
		
		for(int i=0; i<intArray.length; i++)
		sum += intArray[i];
		
		System.out.print("평균은 " + (double)sum/intArray.length);
		scanner.close();
	}
}


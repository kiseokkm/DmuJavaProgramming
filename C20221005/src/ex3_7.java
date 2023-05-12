import java.util.Scanner;
//3-7 배열에 입력받은 수 중 제일 큰 수 찾기
public class ex3_7 {
	
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);

int intArray[] = new int[5]; 

int max=0; 
System.out.println("양수 5개를 입력하세요.");
for(int i=0; i< intArray.length; i++) {
	intArray[i] = scanner.nextInt(); //배열에 저장하기
	if(intArray[i] >max) 
		max = intArray[i]; 
	}
	System.out.print("가장 큰 수는 " + max + "입니다.");

	scanner.close();
	}
}
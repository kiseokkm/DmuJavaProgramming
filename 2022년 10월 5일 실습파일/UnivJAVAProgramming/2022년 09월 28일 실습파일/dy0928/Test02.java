package dy0928;

import java.util.Scanner;
//정수의 갯수를 입력받고 갯수만큼 정수를 입력한다음 갯수의 합계와 평균갯수를 출력하세요
public class Test02 {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("정수의 갯수를 입력하시오");
	int n = scan.nextInt();
	int input ,sum = 0;
	for(int i=0; i<n; i++) {
		System.out.print("입력:");
		input = scan.nextInt();
		sum += input;
	}
	double avg = sum /n;
	System.out.println("합계는"+sum);
	System.out.println("평균은"+avg);
	System.out.println("개수:"+n);
	}
}

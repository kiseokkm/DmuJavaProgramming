package dy0928;
//-1이 입력될 때까지 입력된 수의 평균 구하기 (3-2예제)
import java.util.Scanner;

public class Ex_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1입력");
		int n = scan.nextInt(); 
		while(n != -1) { 
			sum += n;
			count++;
			n = scan.nextInt(); 
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		}
		else {
			System.out.println("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은"+(double)sum/count+"입니다.");
		}
		scan.close();
		}
	}
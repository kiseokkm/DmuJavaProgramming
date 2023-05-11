package dy0928;

import java.util.Scanner;

//continue 문을 이용하여 양수 합 구하기
public class ex3_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;
		for(int i=0; i<5; i++) {
		int n = scan.nextInt(); 
		if(n<=0)
		continue;
		else
		sum += n; 
		}
		System.out.println("양수의 합은 " + sum);
		scan.close();
		}
		}

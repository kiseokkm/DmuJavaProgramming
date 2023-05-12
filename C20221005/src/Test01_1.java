
import java.util.Scanner;

public class Test01_1 {
		//국어 영어 수학 미술 체육 점수를 입력하고 합계와 평균구하기       no 배열
	public static void main(String[] args) {
		int kor, math, eng,art,ath;
		
		float ave;

		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 영어 수학 미술 체육 점수 입력하세요 :");
		
		kor = scan.nextInt(); 
		eng = scan.nextInt(); 
		math = scan.nextInt();
		art  = scan.nextInt();
		ath =scan.nextInt();
		int total=kor+eng+math+art+ath;
		System.out.println("합계 "+total+"입니다");

		 ave = total/5;
		 System.out.println("평균은 "+ave+"입니다");
	}
}
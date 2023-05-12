package 동양0914;

import java.util.Scanner;

public class test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("국어,영어,수학 점수를 빈칸으로 분리하여 입력하시오");
		int kor, math, eng;

		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수 영어점수 수학점수 를 빈칸으로 입력 :");
		
		kor = scan.nextInt(); 
		eng = scan.nextInt(); 
		math = scan.nextInt(); 
		
		int total=kor+eng+math;
		double sum=kor+eng+math;
		double avg=total/3.0;
		
		System.out.println("합계 "+total);
		System.out.printf("평균:%.2f%n",avg);
	}

}

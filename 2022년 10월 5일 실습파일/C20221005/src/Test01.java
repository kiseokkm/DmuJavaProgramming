import java.util.Scanner;

public class Test01 {
			//국어 영어 수학 미술 체육 점수를 입력하고 배열에 저장한다음 합계와 평균을 구하시오  //배열
	public static void main(String[] args) {
	 int[] num = new int[5];		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

	 for(int i=0;i<num.length;i++) {
		System.out.print(i+1 +"번째(국어,영어,수학,미술,체육)점수를 입력하세요>>");
		num[i]=sc.nextInt();
		}
		System.out.print("국어,영어,수학,미술,체육 점수를 나열"+":");

	 for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+" ");
		}
		System.out.println();


	 int sum=0;
	 
	 for(int i=0;i<num.length;i++) {
		sum+=num[i];
		}
		System.out.println("총합: "+sum);
		

	 double avg= (double)sum/num.length;
		System.out.println("평균: "+ avg);	
			
	}

}

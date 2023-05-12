import java.util.Scanner;

public class Test02 {
//5명 학생의 국어 영어 수학 미술 체육 점수를 입력하세요 2차원배열
	public static void main(String[] args) {
	String subject[] = {"국어","영어","수학","미술","체육"};
	int score[][] = new int[5][5];
	int sum[] = new int[5];
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	for (int i= 0; i<score.length;i++) {
		for(int j = 0; j<score[i].length;j++) {
			System.out.println(i+1+"번 학생의"+subject[j]+"점수 입력>>");
			score[i][j]=scanner.nextInt();
			sum[i]+=score[i][j];
		}
	}
	for (int i =0; i<score.length;i++) {
		System.out.print(i+1+"번 학생의 점수");
		for(int j =0; j<score[i].length;j++) {
			System.out.print("");
			System.out.print(subject[j]+":"+score[i][j]);
			
		}
		System.out.println();
		System.out.println(i+1+"번 학생의 점수 총합:"+sum[i]);
		System.out.println(i+1+"번 학생의 점수 평균:"+(double)sum[i]/subject.length);
		System.out.println();
	}
}
}
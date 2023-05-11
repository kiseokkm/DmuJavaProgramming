package dy220921;
//다중 if-else로 학점 매기기
import java.util.Scanner;

public class Ex2_12{
public static void main(String[] args) {
char grade;
Scanner scanner = new Scanner(System.in);
System.out.print("점수를 입력하세요(0~100): ");
int score = scanner.nextInt(); 
	if(score >= 90) 
		grade = 'A';
	else if(score >= 80) 
		grade = 'B';
	else if(score >= 70) 
		grade = 'C';
	else if(score >= 60) 
		grade = 'D';
	else 
		grade = 'F';
System.out.println("if학점은 "+ grade + "입니다.");

scanner.close();
switch (score/10) {
case 10: // score = 100
case 9: // score는 90~99
grade = 'A';
break;
case 8: // score는 80~89
grade = 'B';
break;
case 7: // score는 70~79
grade = 'C';
break;
case 6: // score는 60~69
grade = 'D';
break;
default: // score는 59 이하
grade = 'F';
}
System.out.println("swithch학점은 "+ grade + "입니다.");
}
}

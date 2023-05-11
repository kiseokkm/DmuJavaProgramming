package dy0928;

import java.util.Scanner;
//break 문을 이용하여 while 문 벗어나기
public class ex3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("exit이나  그만을 입력하면 종료합니다.");
	while(true) {
		System.out.print(">>");
		String text = scan.nextLine();
		if(text.equals("exit") || (text.equals("그만"))) {
		break; 
		}
		System.out.println(text);
	}
		System.out.println("종료합니다...");
		scan.close();
	}

}

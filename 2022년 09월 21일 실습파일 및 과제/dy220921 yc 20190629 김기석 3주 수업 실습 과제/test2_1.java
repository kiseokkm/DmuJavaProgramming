package dy220921;
//다중 if else문 , 스위치문으로 몇월인지 입력받아 그에맞게 계절 출력
import java.util.Scanner;

public class test2_1{
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
        System.out.print("월을 입력하세요 : ");
        int month = scanner.nextInt();
        if (month == 12 || month <=2)/*12~2겨울*/ {
            System.out.println(month + "월은 winter입니다. ");
        } else if     (month <= 5 && month > 2)/*3~5봄*/ {
            System.out.println(month + "월은 spring입니다. ");
        }
        else if (month <= 8 && month > 5)/*6~8여름*/{
            System.out.println(month + "월은 summer입니다. ");
        }
        else if (month <= 11 && month > 8)/*9~11가을*/ {
            System.out.println(month + "월은 fall입니다. ");
        }
        else 
            System.out.println("그 월은 없습니다.");
        scanner.close();
	   
        
	switch (month) {
    case 1:
        System.out.println("1월은 winter입니다. ");//1월겨울
        break;
    case 2:
        System.out.println("2월은 winter입니다. ");//2월겨울
        break;
    case 3:
        System.out.println("3월은 spring입니다. ");//3월봄
        break;
    case 4:
        System.out.println("4월은 spring입니다. ");//4월봄
        break;
    case 5:
        System.out.println("5월은 spring입니다. ");//5월봄
        break;
    case 6:
        System.out.println("6월은 summer입니다. ");//6월여름
        break;
    case 7:
        System.out.println("7월은 summer입니다. ");//7월여름
        break;
    case 8:
        System.out.println("8월은 summer입니다. ");//8월여름
        break;
    case 9:
        System.out.println("9월은 fall입니다. ");//9월가을
        break;
    case 10:
        System.out.println("10월은 fall입니다. "); //10월가을
        break;
    case 11:
        System.out.println("11월은 fall입니다. "); //11월가을
        break;
    case 12:
        System.out.println("12월은 winter입니다. "); //12월 겨울
        break;
    default:
        break;
    }
		

}
}

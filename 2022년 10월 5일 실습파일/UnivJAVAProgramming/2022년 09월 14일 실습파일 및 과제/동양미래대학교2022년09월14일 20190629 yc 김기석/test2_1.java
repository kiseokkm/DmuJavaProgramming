package 동양0914;

//20190629  김기석 20220914 반지름입력받아 원의면적구하기

import java.util.Scanner;	
public class test2_1 {
	
public static void main(String []args){	
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
double radius;	
System.out.print("원의 반지름?");	
radius = sc.nextDouble();		
System.out.print("원의 면적 : " + ( 3.14 * radius * radius));	
}	


}

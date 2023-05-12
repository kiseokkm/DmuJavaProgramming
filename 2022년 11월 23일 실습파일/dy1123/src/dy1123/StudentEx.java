package dy1123;

import java.util.Scanner;
import java.lang.*;

public class StudentEx {
	
	public static void main(String[]args) {
		Person p1 = new Person("홍방동","서울","010-1111-1111");
		Person p2 = new Person("홍방동","서울","010-1111-1111");
		p1.setAddr(" 경기도");
		p1.setPhone(" 010-2222-2222");
		p1.setName(" 홍방동");
		System.out.println(p1.getName()+p1.getAddr()+p1.getPhone());
		Student s1 = new Student("홍방동","서울","010-1111-1111", 0, null);
		Student s2 = new Student("홍방동","서울","010-1111-1111", 0, null);
		s1.setAddr(" 경기도");
		s1.setPhone(" 010-2222-2222");
		s1.setName(" 홍방동");
		s1.setStuId(  20190629 );
		s1.setJeongong(" 음악");
		System.out.println(s1.getName()+s1.getAddr()+s1.getPhone()+s1.getstuId()+s1.getjeongong());
		System.out.println(p1);
		System.out.println(s1);
		System.out.println(s1.toString());
		
		
		
		if (p1.equals(p2)){
			System.out.println("홍방동이 맞습니다.");
		}else {
			System.out.println("홍방동이 아닙니다");
		}
		if (p1.getName().equals("홍방동")) {
			System.out.println("홍방동이맞습니다.");
		}else {
			System.out.println("홍방동이 아닙니다");
		}
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("이름 주소 전화번호를 입력>>");
		String name =sc.next();*/
		
		
			
	}

}

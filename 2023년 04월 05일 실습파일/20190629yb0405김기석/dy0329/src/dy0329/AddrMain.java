package dy0329;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addlist = new ArrayList<>();
	public static void main(String[] args) {
		while(true) {
			System.out.println("-------------------- ");
			System.out.println("1. 주소록 입력  ");
			System.out.println("2. 주소록 검색  ");
			System.out.println("3. 주소록 조회  ");
			System.out.println("4. 주소록 수정   ");
			System.out.println("5. 주소록 삭제   ");
			System.out.println("0. 종료   ");
			System.out.println("------------------ ");
			System.out.println("메뉴를 입력하세요:  ");
			int num = sc.nextInt();
			if(num ==1) {
				addrInput();				
			}
			else if(num ==2) {
				addrSearch();
			}
			else if(num ==3) {
				addrjohoi1();
			}
			else if(num ==4) {
				addrUpdate();
			}
			else if(num ==5) {
				addrDelete();
			}
			else if(num ==0) {break;}
			else {System.out.println("잘못된입력입니다. 다시입력하세요.");
				
			}
			
		}

	}
	
	private static void addrjohoi() {
		// TODO Auto-generated method stub
		
	}

	static private void addrSearch() {
		System.out.println("검색할 이름을 입력하시오..");
		String name = sc.next();
		/* //방법 1
		for(int i = 0; i<addlist.size(); i++) {
			if(addlist.get(i).getName().equals(name)) {
				System.out.println(addlist.get(i));
			}
		} */
		//방법 2
		for(Addr item:addlist) {
			if (item.getName().equals(name)){
				System.out.println(item);
			}
		}
	}//검색 ( 메인 함수 밖)
	
	
	
	
	static private void addrjohoi1(){ //조회
		for(Addr addr : addlist) {
			System.out.println(addr);
		}
	} //전체조회끝
	
	
	
	
	
	public static void addrUpdate() { //수정
		System.out.print("수정할 이름을 입력하시오.");
		String name = sc.next();
		System.out.print("수정할 전화번호를 입력하시오");
		String tel = sc.next();
		System.out.println("수정할 회사를 입력하시오");
		String com = sc.next();
		for (Addr addr:addlist) {
			if (addr.getName().equals(name)) {
				addr.setTel(tel);
				addr.setCom(com);
				System.out.println(addr+"수정되었습니다.");
			}
		}
	}
	
	
	public static void addrDelete() {
		System.out.println("삭제할 이름을 입력하시오");
		String name = sc.next();
		for(int i =0; i<addlist.size();i++) {
			if(addlist.get(i).getName().equals(name)) {
				addlist.remove(i);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static void addrInput() {// 입력
			System.out.println("이름을 입력하세요.:");
			String name = sc.next();
			System.out.println("전화번호를 입력하세요.:");
			String tel = sc.next();
			System.out.println("회사이름을 입력하세요.:");
			String com = sc.next();
			LocalDateTime dateTime = LocalDateTime.now();
			Addr add1 = new Addr(name,tel,com,dateTime);
			addlist.add(add1);
			System.out.println(add1);
		
	}

}

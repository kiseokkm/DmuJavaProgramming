package dy1207;

import java.util.ArrayList;

public class SmartPhoneEx {

	public static void main(String[] args) {
		// 스마트폰 객체 만들기  삼성전자=100 애플 =200 안드로이드 = 1 ios=2
// 갤럭시s20, 삼성전자, 300000, 안드로이드 , 256
// 아이폰14 , 애플 , 1600000,ios,128
// 갤럭시s20, 삼성전자, 300000, 안드로이드 , 256
// 샤오미레드미,샤오미(300), 300000, 안드로이드 ,128
// 아이폰14 , 애플 , 1600000,ios,128
// 갤럭시s20, 삼성전자, 300000, 안드로이드 , 256
// 아이폰14 , 애플 , 1600000,ios,128
		
		//시험예상문제)삼성전자제품만 출력 or 애플제품만출력 or 가격이 100만원이상인제품의 제품명과 가격을 출력하시오 
		//ArrayList<SmartPhone>에 객체를 넣습니다. 
		//만들어진 객체 수를 출력하시오.
		//ctrl+space 같이 눌러서 쓰면 힌트 보여서 더 좋음
		//.add(값) 외우기
		//scanner 이용해서 사용자로부터 ("갤럭시s20",'100,300000',1,256)등 입력받게함 집에서 연습하기
		ArrayList<SmartPhone> smList = new ArrayList<>();
		SmartPhone s1 = new SmartPhone("갤럭시s20", 100,300000,1,256);
		smList.add(s1);
		SmartPhone s2 = new SmartPhone("아이폰14", 200,1600000,2,128);
		smList.add(s2);
		SmartPhone s3 = new SmartPhone("샤오미레드미", 300,1000000,1,128);
		smList.add(s3);
		SmartPhone s4 = new SmartPhone("갤럭시s21", 100,500000,1,256);
		smList.add(s4);
		System.out.println("20190629 김기석 =====");
		System.out.println("만들어진 스마트폰수="+Phone.count);
		System.out.println("===== 삼성전자 제품명 가격 메모리 사이즈 =====");
       //삼성전자제품만출력하시오
		for (int i = 0; i < smList.size(); i++) {
			SmartPhone smart = smList.get(i);
			if (smart.getMaker() == Define.SAMSUNG)
				System.out.println(smart.getName()+ " |" + smart.getPrice()+ " |" +smart.getMemsize());
		}
		//애플 제품명만 출력하시오.
		System.out.println("==== 애플 제품명 가격 메모리 사이즈");
		for (int i = 0; i < smList.size(); i++) {
			SmartPhone smart = smList.get(i);
			if(smart.getMaker()== Define.APPLE)
				System.out.println(smart.getName()+ " |" + smart.getPrice()+ " |" +smart.getMemsize());
			
		}
		//가격이 100만원 이상인 제품의 제품명과 가격을 출려갛시오.
		System.out.println("==== 가격이 100만원 이상인 제품의 제품명과 가격을 출력하시오");
		for (int i = 0; i < smList.size(); i++) {
			SmartPhone smart = smList.get(i);
			if(smart.getPrice()>= 1000000)
				System.out.println(smart.getName()+"|"+smart.getPrice());
			
		}
		
		//시험은 스캐너 이용해서 넣는거 나옴 만드는게
		
		
		
		
		
		
		
	}

}

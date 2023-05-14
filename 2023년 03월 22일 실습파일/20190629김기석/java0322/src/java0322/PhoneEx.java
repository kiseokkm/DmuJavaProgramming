package java0322;

import java.util.ArrayList;

public class PhoneEx {

	private static int i;

	public static void main(String[] args) {
		Phone p1= new Phone("갤럭시S23","삼성전자",1000000);
		Phone p2= new Phone("갤럭시S20,","삼성전자",200000);
		Phone p3= new Phone("아이폰14","애플",1500000);
		Phone p4= new Phone("갤럭시A33","삼성전자",300000);
		Phone p5= new Phone("아이폰13","애플",900000);
		
		ArrayList<Phone> phList = new ArrayList<>();
		phList.add(p1);
		phList.add(p2);
		phList.add(p3);
		phList.add(p4);
		phList.add(p5);
		
		System.out.println("---제조사가 삼성전자----");
		for(int i=0; i<phList.size();i++) {
			if(phList.get(i).getCompany().equals("삼성전자"))
				System.out.println(phList.get(i).getpName()+phList.get(i).getCompany()+phList.get(i).getPrice());
		}
		System.out.println("---제조사가 애플----");
		for(int i=0; i<phList.size();i++) {
			if(phList.get(i).getCompany().equals("애플"))
				System.out.println(phList.get(i).getpName()+phList.get(i).getCompany()+phList.get(i).getPrice());
		}
		System.out.println("---가격이 백만원 미만 출력----");
		for(int i=0;i<phList.size();i++) {
			if(phList.get(i).getPrice()<999999)
				System.out.println(phList.get(i).getpName()+phList.get(i).getCompany()+phList.get(i).getPrice());
		}

	}

}

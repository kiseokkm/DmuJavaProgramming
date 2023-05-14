package java0322;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		//1 클래스
		//2 객체
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(100);
		aList.add(200);
		aList.add(300);
		aList.add(1,150);
		// 방법1
		for(int i=0; i<aList.size(); i++) {
			System.out.println(aList.get(i));
		}
		//방법 2 foreach
		for(Integer item :aList) {
			System.out.println(item);
			
		}

	}

}

package java0322;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		System.out.println("------원래순서-------");
		for(String movie:myList) {
			System.out.println(movie);
		}
		//정렬 
		System.out.println("-----------정렬후 오름차순-----------");
		Collections.sort(myList);
		for(String movie:myList) {
			System.out.println(movie);
		}
		System.out.println("-----------정렬후 반대 내림차순-----------");
		Collections.reverse(myList);
		for(String movie:myList) {
			System.out.println(movie);
		}
		int index = Collections.binarySearch(myList,"아바타")+1;
		System.out.println("아바타는"+index+"번째 요소입니다.");

	}

}

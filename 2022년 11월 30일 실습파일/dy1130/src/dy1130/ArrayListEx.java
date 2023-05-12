package dy1130;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<4; i++) {
			System.out.print("이름을 입력하세요:");
			String s = sc.next();
			aList.add(s);
		}
		for ( int i = 0 ; i<aList.size(); i++) {
			String name = aList.get(i);
			System.out.print(name +"\t");
		}
		int longestIndex = 0;
		for (int i=0; i< aList.size();i++) {
			if(aList.get(longestIndex).length()<aList.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n 가장 긴 이름은:"+aList.get(longestIndex));
	}

}

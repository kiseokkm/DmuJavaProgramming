package dy1130;
 //대문자는 소문자로 소문자는 대문자 캐릭터 upper , toLowerCase 등
public class StringEx {

	public static void main(String[] args) {
		String a = new String("DongYangMiraeUniv");
		String b = new String("Computer");
		System.out.println("a의길이:"+a.length());
		System.out.println(a.charAt(2));
		//b출력 
		for(int i =0; i<b.length(); i++) {
			System.out.println(b.charAt(i));
		}
		//b를 거꾸로 출력하기  b.length = 8 
		// for문 i=b.길이 -1 부터 ~ i>=0 까지 ; i -- 
		for(int i =b.length()-1; i>=0; i--) {
			System.out.println(b.charAt(i));
		}
		//a를 읽어 대문자는 소문자로 소문자는 대문자로 바꿔서 출력
		for(int i=0; i<a.length(); i++) {
			char ch = a.charAt(i);
			if(Character.isUpperCase(ch))
				System.out.print(Character.toLowerCase(ch));
			if(Character.isLowerCase(ch))
				System.out.print(Character.toUpperCase(ch));
			
		}

	}
}

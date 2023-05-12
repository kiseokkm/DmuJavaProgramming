package dy1130;
//isAlphabetic , isdigit 등 용어 나올 수 있음 시험에  true /false 등 
//오늘 한 용어들 잘 보기 셤에 나올듯 .
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4' , c2='F';
		System.out.println("c1:"+Character.isDigit(c1));
		System.out.println("c1:"+Character.isDigit(c2));
		if (Character.isDigit(c1))
			System.out.println(c1+"은 숫자");
		System.out.println("c1"+Character.isAlphabetic(c1));
		System.out.println("c2"+Character.isAlphabetic(c2));
		if (Character.isAlphabetic(c2))
			System.out.println(c2+"는 영문자");
		System.out.println(Integer.parseInt("1234"));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.parseDouble("3.14"));
	}

}
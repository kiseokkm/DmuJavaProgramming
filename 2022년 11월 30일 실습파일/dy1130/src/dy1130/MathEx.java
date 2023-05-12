package dy1130;

public class MathEx {
	public static void main(String[] args) {
		
		System.out.println(Math.max(100,200));
		System.out.println(Math.PI);
		System.out.println(Math.random()); // 0.0~1.0 사이의 값 0은포함
		
		//1~45 난수를 로또로 5개
		for(int i =0; i<5; i++) {
			System.out.print((int)(Math.random()*45+1) +"\t"   );
		}
	}

}

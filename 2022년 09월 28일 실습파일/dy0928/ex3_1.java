package dy0928;
//1~10 for문이용하여 더하기
public class ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1; i<=10; i ++) {
			sum+=i;
			System.out.print(i);
		
		if(i<=9)
			System.out.print("+");
		else {
			System.out.print("=");
			System.out.print(sum);
			
		}
			
		}
	}

}

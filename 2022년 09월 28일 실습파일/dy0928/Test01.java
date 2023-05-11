package dy0928;
//1~1000까지 홀수의합과 짝수의 합을 구하시오
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0;
		int odd=0;
		
		for(int i=1; i<=1000; i ++) {
			if(i%2 == 0) {
				even += i;
			}
			else {
		   		odd += i;
			}
		}
		System.out.println("홀수의 합 : "+ odd);
		System.out.println("짝수의 합 : "+ even);		
		}
			
	}

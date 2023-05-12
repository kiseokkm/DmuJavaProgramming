public class ex3_9 {
	enum Week { 월, 화, 수, 목, 금, 토, 일 }
	//FOR-EACH문 활용
	public static void main(String[] args) {
		int [] n = { 1,2,3,4,5 };
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" } ;
		double ki[] = {160.2 , 162.8 , 171, 178.4, 179.9, 182.5};
		double hap =0.0;
		for(double gaein : ki) {
			hap += gaein;
			System.out.print(gaein);
		}
		System.out.println("평균키="+hap/ki.length);
		
		
		
		int sum = 0;
		
		for (int item : n) {
			System.out.print(item + " ");
			sum += item;
		}
		System.out.println("합은" + sum);
		for (String str : names) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
}
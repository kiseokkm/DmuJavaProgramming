package dy2019;

public class BookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("어린왕자","생텍쥐베리");
		Book lovestory = new Book("춘향전");
		Book homes = new Book();
		homes.title="셜록홈즈";
		homes.author="아서코난도일";
		homes.printBook();
		littlePrince.printBook();
		lovestory.printBook();
		
		
		
		/*
		System.out.println(littlePrince.title+""+littlePrince.author);
		System.out.println(lovestroy.title+""+lovestroy.author);
		System.out.println(homes.title+""+homes.author); */

	}

}


public class DogEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog conan = new Dog();
		conan.name = "코난";
		conan.breed = "진돗개";
		conan.age = 4;
		conan.color = "white";
		System.out.println("강아지이름 :" + conan.name+
				 "강아지 종:"+conan.breed+"강아지나이:"+conan.age+""
						+ "강아지색깔:"+conan.color);
		System.out.println("강아지가 짖을때는"); conan.braking();
		System.out.println("강아지가 배고플때는"); conan.hungry();
		System.out.println("강아지가 졸릴때는"); conan.sleeping();
		
		Dog conan1 = new Dog();
		conan1.name = "뽀삐";
		conan1.breed = "푸들";
		conan1.age = 6;
		conan1.color = "black";
		System.out.println("강아지이름 :" + conan1.name+
				"강아지 종:"+conan1.breed+"강아지나이:"+conan1.age+""
						+ "강아지색깔:"+conan1.color);
		System.out.println("강아지가 짖을때는"); conan1.braking();
		System.out.println("강아지가 배고플때는"); conan1.hungry();
		System.out.println("강아지가 졸릴때는"); conan1.sleeping();
		
	}

}

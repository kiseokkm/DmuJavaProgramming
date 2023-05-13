package dy2019;

public class Dog {
	String name;
	String breed;
	int age;
	String color;
	String braking;
	String hungry;
	String sleeping;
	
	
	public Dog(String name ,String breed, int age, String color) {
		this.name = name; this.breed = breed;
		this.age = age; this.color = color;
		}
	public Dog(String braking,String hungry,String sleeping) {
		this.braking=braking; this.hungry=hungry; this.sleeping=sleeping;
	}
	public void printDog() {
		System.out.println("이름은: " + this.name+" 종은: " +this.breed+
				 " 나이는:"+this.age +" 색깔은:"+this.color);
	}
	public void talkDog() {
			System.out.println(" 짖을때는: " + this.braking+" 배고플때는: "
	    +this.hungry+" 졸릴때는:"+this.sleeping);
	}
		
}
package dy2019;

public class Student {

	String name;
	String stuld;
	int age;
	String phone;
	
	public Student(String name, String stuld, int age, String phone) {
		this.name = name; this.stuld = stuld; this.age = age;
		this.phone = phone;
		}
	public void printStudent() {
		System.out.println("이름은 " + this.name+" 학번은 " +this.stuld+
				 " 나이는"+this.age +" 연락처는"+this.phone);
	}
}

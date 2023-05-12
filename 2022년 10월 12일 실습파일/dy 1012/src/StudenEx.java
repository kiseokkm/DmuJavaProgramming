
public class StudenEx {


	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "김기석";
		stu.stuld = "20190629";
		stu.age = 23;
		stu.phone = "01091492803";
		
		System.out.println("이름 : " + stu.name);
		System.out.println("학번 : " + stu.stuld);
		System.out.println("나이 : " + stu.age);
		System.out.println("폰번호 : " + stu.phone);
		
		Student stu1 = new Student();
		stu1.name = "박문호";
		stu1.stuld = "20170512";
		stu1.age = 31;
		stu1.phone = "01012345467";
		
		System.out.println("이름 : " + stu1.name);
		System.out.println("학번 : " + stu1.stuld);
		System.out.println("나이 : " + stu1.age);
		System.out.println("폰번호 : " + stu1.phone);
		
		Student stu2 = new Student();
		stu2.name = "유재석";
		stu2.stuld = "20001010";
		stu2.age = 48;
		stu2.phone = "01091123141";
		
		System.out.println("이름 : " + stu2.name);
		System.out.println("학번 : " + stu2.stuld);
		System.out.println("나이 : " + stu2.age);
		System.out.println("폰번호 : " + stu2.phone);

}
}

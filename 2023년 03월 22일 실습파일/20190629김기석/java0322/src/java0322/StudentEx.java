package java0322;

import java.util.ArrayList;

public class StudentEx{

	public static void main(String[] args) {
		Student 나=new Student("김기석",20190629,"컴소과","010-9149-2803");
		Student stu2 =new Student("스튜",20200614,"디자인과","010-9002-2804");
		Student stu3 =new Student("튜스",20210513,"컴소과","010-1204-2135");
		Student stu4 =new Student("오지나",20180514,"디자인과","010-5456-2103");
		
		
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(나);
		stList.add(stu2);
		stList.add(stu3);
		stList.add(stu4);
		System.out.println("-----컴소과 학생 명단-----");
		for(int i=0; i< stList.size();i++) {
			if(stList.get(i).getDept().equals("컴소과"))
			System.out.println(stList.get(i).getName()+ stList.get(i).getStuId()+stList.get(i).getTel());
		}
		System.out.println("-----디자인과 학생 명단-----");
		for(Student student:stList) {
			if(student.getDept().equals("디자인과"))
			System.out.println(student.getName()+ student.getStuId()+student.getTel());
		}
	}
}

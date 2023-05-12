package dy1130;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름 학번(정수) 주소 성적(정수)을 입력하시오:");
			String input1=sc.next();
			String input2 = sc.next();
			int input3 = sc.nextInt();
			int input4 = sc.nextInt();
			Student st = new Student(input1, input2 ,input3,input4);
			stuList.add(st);
		}
		//주소가 서울인 학생의 이름을 출력하시오.
		for(int i =0; i<stuList.size(); i++) {
			System.out.println(stuList.get(i));
			Student st = stuList.get(i);
			System.out.println(stuList.get(i).getAddr()+"또는"+st.getAddr());
			if (st.getAddr().equals("서울")){
			
			System.out.println("서울이 주소인 학생:"+st.getName()+"\t");
			}}
		//성적이 85점 이상인 학생의 이름과 학번을 출력하시오.
		for(int i =0; i<stuList.size(); i++) {
			System.out.println(stuList.get(i));
			Student st = stuList.get(i);
			if (st.getGrade()>=85) {
				System.out.println("성적이 85점 이상인 학생: "+st.getName()+st.getStuId());
			}
		}				
	}
}

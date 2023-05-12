package dy20190629;

public class studentEx {
public static void main(String[]args) {
			student st1=new student();
			st1.stuid = "20190629";
			st1.jeongong = "컴소";
			st1.name = "김기석";
			st1.addr = " 인천";
			st1.phone ="010-9149-2803";
			st1.showstudent();
			
			student st2=new student("석기김","서울","010-2803-9149","20214237","경영");
			st2.showstudent();
}
}

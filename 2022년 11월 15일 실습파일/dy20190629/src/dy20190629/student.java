package dy20190629;
//class = name , addr , phone 필드 가지고 person상속받은 student
//student는 stuid jeongong and studentex 작성

public class student extends person {
			String stuid;
			String jeongong;
			
			public student(String name, String addr,String phone,String stuid ,String jeongong) {
				super(name,addr,phone);
				this.stuid=stuid;
				this.jeongong=jeongong;
			}
			public student() {}
			
			public void showstudent() {
				showperson();
				System.out.println(" 학번은"+stuid+" 전공:"+jeongong);
			}
}

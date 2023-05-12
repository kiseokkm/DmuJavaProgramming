package dy1123;

public class Person {
		private String name;
		private String addr;
		private String phone;
		
		public Person() {};
		public Person(String name, String addr, String phone) {
			this.name=name;
			this.addr=addr;
			this.phone=phone;
		}
		//3메소드 , getter & setter
		public String getName() {
			return name;
		}
		public String getAddr() {
			return addr;
		}
		public String getPhone() {
			return phone;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setAddr(String addr) {
			this.addr=addr;
		}
		public void setPhone(String phone) {
			this.phone=phone;
		}
		@Override
		public String toString() {
			return "이름:"+name+"주소"+addr+"번호:"+ phone;
			}
}
class Student extends Person {
	//1 필드
	private int stuId;
	private String jeongong;
	public Student() {};
	public Student(String name, String addr, String phone, int stuId , String jeongong) {
		// TODO Auto-generated constructor stub
		this.stuId=stuId;
		this.jeongong=jeongong;
	}
	//2 생성자
	//3 메소드 getter & setter
	public int getstuId() {
		return stuId;
	}
	public String getjeongong() {
		return jeongong;
	}
	public void setStuId(int stuId) {
		this.stuId=stuId;
	}
	public void setJeongong(String jeongong) { this.jeongong=jeongong;
	}
	/*@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if (name == p.name && addr && == p.addr && phone == p.phone) {
			return true;
		}else {
			return false;
		}
	}*/
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"학번:"+stuId+"전공"+jeongong;
	}
	
	
	
	void printStudent() {
		System.out.println("학생정보=");
	}
}

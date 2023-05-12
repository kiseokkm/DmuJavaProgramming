package dy1130;

public class Student {
	//1필드
	private String name;
	private String addr;
	private int stuId;
	private int grade;
	//2생성자
	public Student() {};
	public Student(String name, String addr, int stuId, int grade) {
		super();
		this.name = name;
		this.addr = addr;
		this.stuId = stuId;
		this.grade = grade;
	}
	//3 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", stuId=" + stuId + ", grade=" + grade + "]";
	}


}

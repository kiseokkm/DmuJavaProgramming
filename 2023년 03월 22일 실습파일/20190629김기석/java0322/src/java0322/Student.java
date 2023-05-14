package java0322;
//설계도
public class Student {
	private String name;
	private int stuId;
	private String dept;
	private String tel;
	//생성자
	public Student(String name, int stuId, String dept, String tel) {
		super();
		this.name = name;
		this.stuId = stuId;
		this.dept = dept;
		this.tel = tel;
	}
	Student(){}
	//메소드 getter ,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}	
}

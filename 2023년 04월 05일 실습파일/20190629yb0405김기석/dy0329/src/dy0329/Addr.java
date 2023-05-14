package dy0329;

import java.time.LocalDateTime;

//설계도 , 실행하지않음 . 
public class Addr {
	//1필드
	//2생성자
	//3메소드() getter , setter
	private String name;
	private String tel;
	private String com;
	LocalDateTime createDate;
	
	public Addr() {}
	public Addr(String name, String tel, String com, LocalDateTime createDate) {
		super();
		this.name = name;
		this.tel = tel;
		this.com = com;
		this.createDate = createDate;
	}

	
	@Override
	public String toString() {
		return "[주소록: 이름:" +this.name +"전화번호"+tel+"회사"+com+"입력일"+createDate + "]";
	}
	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	
}

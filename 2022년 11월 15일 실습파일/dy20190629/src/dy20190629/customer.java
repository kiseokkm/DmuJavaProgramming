package dy20190629;
//int cusno , int mile    printcust 고객번호 이름 마일리지 주소 전화번호 출력 customerex 만들기

public class customer extends person {
	int cusNo,mile;
	
	public customer() {}
	public customer(String name, String addr, String phone, int cusNo, int mile) {
				super(name,addr,phone);
				this.cusNo=cusNo;
				this.mile = mile;
	}
	public void showcustomer() {
		showperson();
		System.out.println(" 고객번호:"+cusNo+" 마일리지점수:"+mile);
	}

}

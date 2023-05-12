package dy20190629;

public class customerEx {
public static void main(String[] args) {
		customer t1 = new customer();
		t1.name="김기석";
		t1.phone="010-9149-2803";
		t1.addr="인천";
		t1.cusNo=1234;
		t1.mile=150;
		t1.showcustomer();
		
		customer t3=new customer("이승헌","울산","010-1234-4211",123,421);
		t3.showcustomer();
		
		customer t4=new customer("이헌승","강원도","010-1223-1234",110,111);
		t4.showcustomer();
		
}

}

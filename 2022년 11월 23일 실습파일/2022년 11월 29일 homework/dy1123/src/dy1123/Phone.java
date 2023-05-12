package dy1123;
//열심히 해봤는데 실행은 안됐네요 .. 더 보완해보겠습니다

public class Phone {
		private String phonenumber;
		private String jejosa;
		private String price;
		
		public Phone() {};
		public Phone(String phonenumber, String jejosa, String price) {
			this.phonenumber=phonenumber;
			this.jejosa=jejosa;
			this.price=price;
		}
		//3메소드 , getter & setter
		public String getphonenumber() {
			return phonenumber;
		}
		public String getjejosa() {
			return jejosa;
		}
		public String getprice() {
			return price;
		}
		public void setphonenumber(String phonenumber) {
			this.phonenumber=phonenumber;
		}
		public void setjejosa(String jejosa) {
			this.jejosa=jejosa;
		}
		public void setprice(String price) {
			this.price=price;
		}
		@Override
		public String toString() {
			return "폰번호:"+phonenumber+"제조사"+jejosa+"가격:"+ price;
			}
}
class SmartPhone extends Phone {
	//1 필드
	private String type;
	private String memory ;
	private String Bluetooth ;
	public SmartPhone() {};
	public SmartPhone(String phonenumber, String jejosa, String price, String type , String memory , String
			Bluetooth) {
		// TODO Auto-generated constructor stub
		this.type=type;
		this.memory=memory;
		this.Bluetooth=Bluetooth;
	}
	//2 생성자
	//3 메소드 getter & setter
	public String gettype() {
		return type;
	}
	public String getmemory() {
		return memory;
	}
	public String getBluetooth() {
		return Bluetooth;
	}
	public void settype(String type) {
		this.type=type;
	}
	public void setmemory(String memory) { this.memory=memory;
	}
	public void setBluetooth(String Bluetooth) { this.Bluetooth=Bluetooth;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"운영체제타입:"+type+"내부 메모리 크기"+memory+"블르투스 지원 여부"+Bluetooth;
	}
	
	
	void printSmartPhone() {
		System.out.println("정보=");
	}
}

interface PhoneInterface extends SmartPhone{
	void sendCall();
	void receiveCall();
	void sendSMS();
	void receiveSMS();
	void mp3play();
	void mp3stop();
}

class Sm1artPhone extends Phone implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("따르릉따르릉~~");
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요.");
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자갑니다.");
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자왔어요");
		
	}
	public void mp3play() {
		// TODO Auto-generated method stub
		System.out.println("음악 연주합니다");
		
	}

	@Override
	public void mp3stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 연주 그만합니다");
		
	}

	public void schedule() {
		// TODO Auto-generated method stub
		System.out.println("일정관리합니다");
		
	}


}
public class Sm1artPhone1 {
	public static void main(String[] args) {
		Sm1artPhone phone = new Sm1artPhone();
		phone.sendCall();
		phone.receiveCall();
		phone.sendSMS();
		phone.receiveSMS();
		phone.mp3play();
		phone.mp3stop();
		phone.schedule();
	}
}


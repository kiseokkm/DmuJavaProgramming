package dy1116;

public interface PhoneInterface{
	
	int TIMEOUT = 10000;
	void sendcall() ;
	void receiveCall();
}

class SSphone implements PhoneInterface {
	@Override
	public void sendcall() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 띠리리리링");
		
	}
	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰 전화왔습니다.");
	}
	
}
class IPhone implements PhoneInterface{
	@Override
	public void sendcall() {
		// TODO Auto-generated method stub
		System.out.println("아이폰 띠리리리링");
	}@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("아이폰 전화왔습니다.");
	}
}
package dy1123;

public class TV {
	private String jejosa;
	private String price;
	private String big;
	public TV() {};
	public TV(String jejosa, String price, String big) {
		this.jejosa=jejosa;
		this.price=price;
		this.price=price;
	}
	//3메소드 , getter & setter
	public String getjejosa() {
		return jejosa;
	}
	public String getprice() {
		return price;
	}
	public String getbig() {
		return price;
	}
	public void setjejosa(String jejosa) {
		this.jejosa=jejosa;
	}
	public void setprice(String price) {
		this.price=price;
	}
	public void setbig(String big) {
		this.big=big;
	}
	@Override
	public String toString() {
		return "폰번호:"+jejosa+"제조사"+price+"가격:"+ big;
		}
}


class SmartTV extends TV{
	private String type;
	private String InterNet ;
	private String Bluetooth ;
	public SmartTV() {};
	public SmartTV(String jejosa, String price, String big, String type , String InterNet , String
			Bluetooth) {
		// TODO Auto-generated constructor stub
		this.type=type;
		this.InterNet=InterNet;
		this.Bluetooth=Bluetooth;
	}
	//2 생성자
	//3 메소드 getter & setter
	public String gettype() {
		return type;
	}
	public String getmemory() {
		return InterNet;
	}
	public String getBluetooth() {
		return Bluetooth;
	}
	public void settype(String type) {
		this.type=type;
	}
	public void setmemory(String memory) { this.InterNet=InterNet;
	}
	public void setBluetooth(String Bluetooth) { this.Bluetooth=Bluetooth;
	}
	
}
interface TVInterface extends SmartTV{
	void youtubePlay();
	void youtubeStop();
	void internetPlay();
	void internetStop();
}

class Sm1artTV extends TV implements TVInterface{

	@Override
	public void youtubePlay() {
		// TODO Auto-generated method stub
		System.out.println("유튜브플레이~~");
		
	}

	@Override
	public void youtubeStop() {
		// TODO Auto-generated method stub
		System.out.println("유튜브 스탑.");
		
	}

	@Override
	public void internetPlay() {
		// TODO Auto-generated method stub
		System.out.println("인터넷 플레이");
		
	}

	@Override
	public void internetStop() {
		// TODO Auto-generated method stub
		System.out.println("인터넷 스탑");
		
	}
	
	public void schedule() {
		// TODO Auto-generated method stub
		System.out.println("일정관리합니다");
		
	}


}
public class Sm1artPhone2 {
	public static void main(String[] args) {
		Sm1artTV TV = new Sm1artTV();
		TV.youtubePlay();
		TV.youtubeStop();
		TV.internetPlay();
		TV.internetStop();
		TV.schedule();

	}
}
package dy1207;

public class Phone {
	static int count;
	private String name;
	private int maker;
	private int price;
// 시험문제 @@생성자 , setter ,getter 추가하세요 (시험문제) 자동으로 만들어지는거 있음 오른쪽마우스 버튼 source>아래에서 3번쨰 
	//getter setter , toString까지 해줘야됨 오른쪽 소스에서
	public Phone() {
		count ++;
	};
	public Phone(String name, int maker, int price) {
		super();
		this.name = name;
		this.maker = maker;
		this.price = price;
		count++;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Phone.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaker() {
		return maker;
	}
	public void setMaker(int maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}
	
	
}

interface PhoneInterface {
	//public abstract 중요!
	public abstract void sendCall();
	void receiveCall();
}

class SmartPhone extends Phone implements PhoneInterface{
	private int ostype;
	private int memsize;
	// 생성자 setter getter 추가 시험문제
	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SmartPhone(String name, int maker, int price,int ostype ,int memsize) {
		super(name, maker, price);
		this.ostype = ostype;
		this.memsize = memsize;
		
	}	
	@Override
	public void sendCall() {
		System.out.println(getName()+"전화 따르르릉");
		
	}
	
	@Override
	public void receiveCall() {
		System.out.println(getName()+"전화 왔어요");
	}

	public int getOstype() {
		return ostype;
	}

	public void setOstype(int ostype) {
		this.ostype = ostype;
	}

	public int getMemsize() {
		return memsize;
	}

	public void setMemsize(int memsize) {
		this.memsize = memsize;
	}
	
	
}

//시험문제2 기본 class에서 활용 총 2문제 . 







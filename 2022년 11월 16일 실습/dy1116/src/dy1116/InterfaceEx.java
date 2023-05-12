package dy1116;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SSphone s1 = new SSphone();
		s1.sendcall();
		s1.receiveCall();
		
		IPhone i1 = new IPhone();
		i1.sendcall();
		i1.receiveCall();
	}
}

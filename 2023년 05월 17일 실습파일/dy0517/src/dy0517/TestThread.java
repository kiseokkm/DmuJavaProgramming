package dy0517;

public class TestThread extends Thread {
	int n=0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {return;}
		}
	}	
	public static void main(String[] args) {
		TestThread th = new TestThread();
		th.start();
}
}
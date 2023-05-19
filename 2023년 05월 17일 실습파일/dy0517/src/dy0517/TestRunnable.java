package dy0517;

 class TimerRunnable extends Thread {
	int n=0;
	@Override
	public void run() {
		while(true) { //무한루프실행
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {return;}
		}
	}
 }
	public class TestRunnable{
	public void main(String[] args) {
		Thread th = new Thread(new TimerRunnable());
		th.start();
	}
}
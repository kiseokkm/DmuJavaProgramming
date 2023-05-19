package dy0517;

public class LambdaRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread(new Runnable() {
			int n = 0;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println(n);
					n++;
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
						return;
					}
				}
			}
			});
		
	}
}
			


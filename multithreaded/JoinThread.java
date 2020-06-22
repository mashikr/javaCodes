package multithreaded;

public class JoinThread {
	private static int count=0;
	
	public static synchronized void incont() {
		count++;
	}
	
	public static void main(String args[]) {
		Thread t1 = new Thread (new Runnable() {

			public void run() {
				for(int i=0; i<10000; i++) {
					incont();
				}
			}
			
		});
		
		Thread t2 = new Thread (new Runnable() {

			public void run() {
				for(int i=0; i<10000; i++) {
					incont();
				}
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("value : "+ count);
	}
}

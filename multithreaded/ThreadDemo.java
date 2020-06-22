package multithreaded;

class Implement_Runnable implements Runnable {
	Thread t;
	Implement_Runnable(){
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " +t);
		t.start();
	} 
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Child Thread: " +i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Child interupted");
		}
		System.out.println("Exiting child thread");
	}
}

public class ThreadDemo {
	public static void main(String args[]) {
		new Implement_Runnable();
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Main Thread: " +i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting");
	}
}

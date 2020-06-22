package multithreaded;

class Newthread implements Runnable{
	String name;
	Thread t;
	
	Newthread(String threadname){
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		t.start();
	}

	public void run() {
		try{
			for(int i=0; i<5; i++) {
				System.out.println(name + ": " + i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting");
	}
}

public class MultipleThread {
	public static void main(String args[]) {
		new Newthread("One");
		new Newthread("Two");
		new Newthread("Three");
		
		try {
			for(int i=0; i<5; i++) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}
}

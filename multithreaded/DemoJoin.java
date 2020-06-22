package multithreaded;

class Newthread1 implements Runnable{
	String name;
	Thread t;
	
	Newthread1(String threadname){
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
			}
			catch(InterruptedException e) {
				System.out.println(name + " interruption");
			}
			System.out.println(name + " exiting");
	}
	
}
public class DemoJoin {
	public static void main(String args[]) {
		Newthread1 ob1 = new Newthread1("One");
		Newthread1 ob2 = new Newthread1("Two");
		Newthread1 ob3 = new Newthread1("Three");
		System.out.println("Thread One is alive: " + ob1.t.isAlive());
		System.out.println("Thread One is alive: " + ob2.t.isAlive());
		System.out.println("Thread One is alive: " + ob3.t.isAlive());
		try {
			System.out.println("wait for thread to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e1) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Thread One is alive: " + ob1.t.isAlive());
		System.out.println("Thread One is alive: " + ob2.t.isAlive());
		System.out.println("Thread One is alive: " + ob3.t.isAlive());
		
		System.out.println("Main thread exiting");
	}
}

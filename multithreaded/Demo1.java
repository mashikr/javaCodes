package multithreaded;

class MyClass extends Thread {
	public void run() {
		
		try {
			for(int i=0; i<10; i++) {
				System.out.println(Thread.currentThread() +"Value " + i);
				Thread.sleep(1000);
			}	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class Demo1 {
	public static void main(String args[]) {
		MyClass myclass = new MyClass();
		myclass.start();
		MyClass myclass1 = new MyClass();
		myclass1.start();
	}
}

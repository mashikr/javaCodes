package exception;

public class ThrowDemo {
	static void demoproc() {
		try {
			throw new NullPointerException ("demodfg");
		}catch(NullPointerException e) {
			System.out.println("Caught inside demoproc.");
			throw e;
		}
	}
	
	public static void main(String args[]) {
		try {
			demoproc();
		}catch(NullPointerException e) {
			System.out.println("Recaught: "+e);
		}
	}
}

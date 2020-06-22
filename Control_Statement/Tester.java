package Control_Statement;

public class Tester {
	public static void main(String args[]) {
		String s1 = "CSTE";
		String s2 = new String("CSTE");
		
		if(s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("UnEqual");
		
		if(s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("UnEqual");

	}
}

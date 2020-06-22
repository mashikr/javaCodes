
public class Variable3 {
	String myInstance = "Ashik";
	public static void main(String args[])
	{
		Variable3 ob1 = new Variable3();
		Variable3 ob2 = new Variable3();
		Variable3 ob3 = new Variable3();
		
		System.out.println(ob1.myInstance);
		System.out.println(ob2.myInstance);
		System.out.println(ob3.myInstance);
		
		ob2.myInstance="Sujon";
		System.out.println(ob1.myInstance);
		System.out.println(ob2.myInstance);
		System.out.println(ob3.myInstance);
	}
}

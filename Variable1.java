
public class Variable1 {
	static int count = 0;
	public void increment()
	{
		count++;
	}
	
	public static void main(String args[])
	{
		Variable1 ob1 = new Variable1();
		Variable1 ob2 = new Variable1();
		ob1.increment();
		ob2.increment();
		
		//System.out.println("ob1: count is ="+ob1.count);
		//System.out.println("ob2: count is ="+ob2.count);
	}
}

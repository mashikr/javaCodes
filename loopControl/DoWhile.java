package loopControl;

public class DoWhile {
	public static void main(String args[]) //throws InterruptedException
	{
		int i = 10;
		do
		{
			System.out.println(i);
			//Thread.sleep(1000);
			i--;
		}
		while(i>0);
	}
}

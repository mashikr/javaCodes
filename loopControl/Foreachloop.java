package loopControl;

public class Foreachloop {
	public static void main(String args[])
	{
		int marks[] = {120, 130, 140, 150, 95, 100};
		int highest_marks = maximum(marks);
		System.out.println("This highest score is : " +highest_marks);
	}
	
	public static int maximum(int[] numbers) {
		int max = numbers[0];
		for(int num:numbers)
		{
			if(num>max)
			{
				max = num;
			}
		}
		return max;
	}
}
package array;

public class ArrayRowLength {
	public static void main(String args[])
	{
		int a[][] = { {1,2,3}, {4,5,6,7}, {7} };
		System.out.println("Length of row1: "+a[0].length);
		System.out.println("Length of row2: "+a[1].length);
		System.out.println("Length of row3: "+a[2].length);
		
		for(int arr[]:a)
		{
			for(int i:arr)
			{
				System.out.println(i);
			}
		}
	}
}

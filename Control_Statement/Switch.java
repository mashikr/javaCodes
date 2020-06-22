package Control_Statement;

import java.util.Scanner;

public class Switch {
	private static Scanner input;

	public static void main(String args[])
	{
		int age;
		input = new Scanner(System.in);
		System.out.print("Please Enter age: ");
		age = input.nextInt();
		switch (age)
		{
		case 18:
			System.out.println("Age 18");
			break;
		case 19:
			System.out.println("Age 19");
			break;
		case 20:
			System.out.println("Age 20");
			break;
		default:
			System.out.println("Not matched");
			break;
		}
	}
}

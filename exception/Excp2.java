package exception;

import java.util.Scanner;

public class Excp2 {
	private static Scanner input;

	public static void main(String args[]) {
		while(true) {
			try {
				input = new Scanner(System.in);
				System.out.print("Enter num1: ");
				int num1 = input.nextInt();
				System.out.print("Enter num2: ");
				int num2 = input.nextInt();
				int result = num1/num2;
				System.out.println("Result: " +num1+" / "+num2+" = "+result);
			}catch(Exception e) {
				System.out.println("Exception: " +e);
				System.out.println("Please Enter a integer. Try again.");
			}
		}
	}
	
}

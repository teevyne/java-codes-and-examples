package exampleOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchBlocksOrder {
	
	public static int quotient (int numerator, int denomenator) throws ArithmeticException {
		return numerator / denomenator;
	}
	
	public static void main (String[] args) 
	{
		Scanner input = new Scanner (System.in);
		boolean continueLoop = true;
		
		do {
			try
			{
				System.out.println("Please enter a numerator:");
				int numerator = input.nextInt();
				System.out.println("Now enter a denominator");
				int denominator = input.nextInt();
				
				int result = quotient(numerator, denominator);
				System.out.printf("Result: %d / %d = %d", numerator, denominator, result);
				continueLoop = false;
			}
			catch (InputMismatchException inputMismatchException) //putting subclass exceptions before the superclass is fine
			{
				System.err.printf("%nException: %s%n", inputMismatchException);
				input.nextLine(); // discard input so user can try again
				System.out.printf("You must enter integers. Please try again.%n%n");
			}
			catch (ArithmeticException arithmeticException)
			{
				System.err.printf("%nException: %s%n", arithmeticException);
				input.nextLine();
				System.out.printf("Zero is an invalid denominator. Please enter a valid number%n");
			}
			catch (Exception exception)
			{
				System.err.printf("%nException: %s%n", exception);
				input.nextLine(); // discard input so user can try again
				System.out.printf("You must enter integers. Please try again.%n%n");
			}
			//If I uncommented-out lines 37 - 48, I get error lines would throw an error
			//because a superclass exception cannot come before s subclass exception
//			catch (InputMismatchException inputMismatchException)
//			{
//				System.err.printf("%nException: %s%n", inputMismatchException);
//				input.nextLine(); // discard input so user can try again
//				System.out.printf("You must enter integers. Please try again.%n%n");
//			}
//			catch (ArithmeticException arithmeticException)
//			{
//				System.err.printf("%nException: %s%n", arithmeticException);
//				input.nextLine();
//				System.out.printf("Zero is an invalid denominator. Please enter a valid number%n");
//			}
		} while (continueLoop);
		
		input.close();
	}
}

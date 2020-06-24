package exampleOne;

//11.20 (Rethrowing Exceptions) Write a program that illustrates rethrowing an exception. Define
//methods someMethod and someMethod2. Method someMethod2 should initially throw an exception.
//Method someMethod should call someMethod2, catch the exception and rethrow it. Call someMethod
//from method main, and catch the rethrown exception. Print the stack trace of this exception.

public class RethrowingExceptions 
{
	public static void main (String[] args) 
	{
		try 
		{
			sameMethod();
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
		
	public static void sameMethod() throws Exception 
	{
		try 
		{
			sameMethod2();
		}
		catch (Exception ex) 
		{
			System.out.println("Exception caught!");
			throw new Exception("This is the new exception thrown by sameMethod");
		}
		
	}

	public static void sameMethod2() throws Exception 
	{
		try 
		{
			throw new Exception("This is the sameMethod2 exception");
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
}
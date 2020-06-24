package exampleOne;

public class ExceptionATest 
{
	public static void main (String[] args) 
	{
		try
	    {
			throw new ExceptionA("This is an Exception thrown by ExceptionA");
	    }
	    catch(ExceptionA ex)
	    {
		    ex.printStackTrace();
		    ex.getMessage();
	    }
		
		try
	    {
			throw new ExceptionB("This is an Exception thrown by ExceptionB");
	    }
	    catch(ExceptionA ex)
	    {
		    ex.printStackTrace();
		    ex.getMessage();
	    }
		
		try
	    {
			throw new ExceptionC("This is an Exception thrown by ExceptionC");
	    }
	    catch(ExceptionA ex)
	    {
		    ex.printStackTrace();
		    ex.getMessage();
	    }
	}
}

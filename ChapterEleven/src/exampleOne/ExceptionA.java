package exampleOne;

public class ExceptionA extends Exception
{
	public ExceptionA(String message)
	{
	    super(message);
	}

	public ExceptionA(Throwable thrown){
		super(thrown);
	}
	
	public ExceptionA(String message, Throwable thrown) {
		super(message, thrown);
	}
	
    public static void getExceptionA() throws ExceptionA
    {
	    throw new ExceptionA("Exception A");
    }
}

class ExceptionB extends ExceptionA {
	public ExceptionB(String message)
	{
	    super(message);
	}

	public ExceptionB(Throwable thrown){
		super(thrown);
	}
	
	public ExceptionB(String message, Throwable thrown) {
		super(message, thrown);
	}
	
    public static void getExceptionB() throws ExceptionA
    {
	    throw new ExceptionA("Exception B");
    }
}

class ExceptionC extends ExceptionB {
	public ExceptionC(String message)
	{
	    super(message);
	}

	public ExceptionC(Throwable thrown){
		super(thrown);
	}
	
	public ExceptionC(String message, Throwable thrown) {
		super(message, thrown);
	}
	
    public static void getExceptionC() throws ExceptionA
    {
	    throw new ExceptionA("Exception C");
    }
}

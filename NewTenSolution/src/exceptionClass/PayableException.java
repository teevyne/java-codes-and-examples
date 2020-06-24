package exceptionClass;

public class PayableException extends Exception {
	
	public PayableException() {}
	
	public PayableException(String message) {
		super(message);
	}
	
	public PayableException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public PayableException(Throwable cause) {
		super(cause);
	}
}

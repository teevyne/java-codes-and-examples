//In your program, create try blocks that throw exceptions of types ExceptionA, ExceptionB, 
//NullPointerException and IOException. ///All exceptions should be caught with catch blocks specifying type Exception.
public class ExceptionExample {
	public static void main(String[] args) {

	class ExceptionA extends Exception {
		//Create constructors for the created exception
		
		public ExceptionA() {
			
		}
		
		public ExceptionA(String message) {
			super(message);
		}
		
		public ExceptionA(Throwable thrown) {
			super(thrown);
		}
		
		public ExceptionA(String message, Throwable thrown) {
			super(message, thrown);
		}
	}
	
	class ExceptionB extends ExceptionA {
		public ExceptionB(String message) {
			super(message);
		}
		
		public ExceptionB (Throwable thrown){
			super(thrown);
		}
	
		public ExceptionB (String message, Throwable thrown){
			super(message, thrown);
		}
	}
}}
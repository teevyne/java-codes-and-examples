package exampleOne;

//11.21 (Catching Exceptions Using Outer Scopes) Write a program showing that a method with its
//own try block does not have to catch every possible error generated within the try. Some exceptions
//can slip through to, and be handled in, other scopes.

public class OuterScope {
	public static void main (String[] args) throws Exception {
		try {
			throw new Exception();
		}finally {
			
		}
	}

public static void firstMethod() throws Exception {
	try {
		System.out.println("Method for first method");
	}
	catch (Exception ex) {
		throw new Exception(ex);
	}
}

public static void secondMethod() throws Exception {
	try {
		System.out.println("Method for second method");
	}
	catch (Exception ex) {
		throw new Exception(ex);
	}
}

class ExceptionA extends Exception {
	
}

class ExceptionB extends Exception {
	
}

}
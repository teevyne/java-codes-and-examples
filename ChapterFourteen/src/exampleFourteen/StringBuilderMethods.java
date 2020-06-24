package exampleFourteen;

public class StringBuilderMethods {
	public static void main(String[] args) {
		//create StringBuilder object, buffer
		StringBuilder buffer = new StringBuilder("Hello, how are you?");
		
		System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n", buffer.toString(), buffer.length(), buffer.capacity());
		
		buffer.ensureCapacity(75);
		System.out.printf("New capacity = %d%n%n", buffer.capacity());
		
		buffer.setLength(10);
		System.out.printf("New length = %d%nbuffer = %s%n", buffer.length(), buffer.toString());
		
		buffer.setLength(4);
		System.out.printf("New length now set to = %d%nbuffer = %s%n", buffer.length(), buffer.toString());
	}
}

package exampleFourteen;

public class StringBuilderAppend
{
	public static void main(String[] args)
	{
		Object objectRef = "hello";
		String string = "goodbye";
		char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000000L;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		StringBuilder lastBuffer = new StringBuilder("last buffer");
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(objectRef)
		.append("\n")
		.append(string)
		.append("\n")
		.append(charArray)
		.append("\n")
		.append(charArray, 0, 3)
		.append("\n")
		.append(booleanValue)
		.append("\n")
		.append(characterValue)
		.append("\n")
		.append(integerValue)
		.append("\n")
		.append(longValue)
		.append("\n")
		.append(floatValue)
		.append("\n")
		.append(doubleValue)
		.append("\n")
		.append(lastBuffer);
		
		System.out.printf("buffer contains%n%s%n", buffer.toString());
		
		String string1 = "hello";
		String string2 = "BC";
		int value = 22;
		
		String s = new StringBuilder().append("hello").append("BC").append(22).toString();
		System.out.println(s);
		s = new StringBuilder().append(s).append("!").toString();
		System.out.println(s);
	}
}

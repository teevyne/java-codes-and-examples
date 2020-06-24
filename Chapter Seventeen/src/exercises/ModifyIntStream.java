package exercises;

import java.util.stream.IntStream;

public class ModifyIntStream {

	public static void main(String[] args) {
		
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
		
		System.out.print("Main values: ");
		IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
		
		System.out.println();
		
		System.out.println("Sum via mapping and reduction: ");
		System.out.println(IntStream.of(values).map(value -> value * value).reduce(0, (x, y) -> x + y));	
	}
}

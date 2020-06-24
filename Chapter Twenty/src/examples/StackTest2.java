package examples;

import java.util.NoSuchElementException;

// Fig. 20.10: StackTest2.java
// Passing generic Stack objects to generic methods.
public class StackTest2
{
	public static void main(String[] args)
	{
		Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// Create a Stack<Double> and a Stack<Integer>
		Stack<Double> doubleStack = new Stack<>(5);
		Stack<Integer> integerStack = new Stack<>();
		
		// push elements of doubleElements onto doubleStack
		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack); // pop from doubleStack
		
		// push elements of integerElements onto integerStack
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack); // pop from integerStack
	}
	
	public static <T> void testPush(String name , Stack<T> stack, T[] elements) {
		System.out.printf("%nPushing elements into %s%n", name);
		
		//Pushing the elements through a loop
		for (T element : elements)
		{
			System.out.printf("%s ", element);
			stack.push(element);
		}
	}
	
	public static <T> void testPop(String name, Stack<T> stack)
	{
		//pop elements from the stack
		try
		{
			System.out.printf("%nPopping elements from the %s%n", name);
			T popValue;
			
			//remove all the elements from the stack
			while(true) {
				popValue = stack.pop();
				System.out.printf("%s ", popValue);
			}
		}
		catch (NoSuchElementException e) {
			System.out.println();
			e.printStackTrace();
		}
	}
}

package examples;

import java.util.ArrayList;
import java.util.NoSuchElementException;
public class Stack<T> 
{
	private final ArrayList<T> elements; //ArrayList stores array elments
	
	public Stack()
	{
		this(10);
	}
	
	public Stack (int capacity) 
	{
		int initCapacity = capacity > 0 ? capacity : 10; // validate
		elements = new ArrayList<T>(initCapacity); // create ArrayList
	}
	
	public void push(T pushValue) {
		elements.add(pushValue); // place pushValue on Stack
	}
	
	// return the top element if not empty; else throw EmptyStackException
	public T pop()
	{
		if (elements.isEmpty()) // if stack is empty
			throw new NoSuchElementException("Stack is empty, cannot pop");
	
		// remove and return top element of Stack
		return elements.remove(elements.size() - 1);
	}
}

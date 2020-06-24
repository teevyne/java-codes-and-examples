package examples;

import java.util.ArrayList;

public class TotalNumbers 
{
	public static void main (String[] args) 
	{
		// create, initialize and output ArrayList of Numbers containing
		// both Integers and Doubles, then display total of the elements
		Number[] numbers = { 1, 2.4, 3, 4.1 };
		ArrayList<Number> numberList = new ArrayList<Number>();
		
		for (Number element : numbers)
			numberList.add(element);
		
		System.out.printf("numberList contains %s%n", numberList);
		System.out.printf("Sum of elements in numberList is %s%n", sum(numberList));
	}
	
	public static double sum(ArrayList<Number> list) 
	{
		double total = 0;
		for (Number element : list) 
		{
			total += element.doubleValue();
		}
		return total;
	}
}

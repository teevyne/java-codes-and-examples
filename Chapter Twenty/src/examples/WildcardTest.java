package examples;

import java.util.ArrayList;

public class WildcardTest
{
	public static void main(String[] args)
	{
		// create, initialize and output ArrayList of Integers, then
		// display total of the elements
		Integer[] integers = {1, 2, 3, 4, 5};
		ArrayList<Integer> integerList = new ArrayList<>();
		
		for (Integer element : integers)
			integerList.add(element);
		
		System.out.printf("%nintegerList contains %s%n", integerList);
		System.out.printf("Total of the integerList %.0f%n%n", sum(integerList));
		
		Double[] doubles = { 1.1, 2.2, 3.3 };
		ArrayList<Double> doubleList = new ArrayList<>();
		
		// insert elements in doubleList
		for (Double element : doubles)
			doubleList.add(element);
		
		System.out.printf("doubleList contains: %s%n", doubleList);
		System.out.printf("Total of the elements in doubleList: %.1f%n%n", sum(doubleList));
		
		// create, initialize and output ArrayList of Numbers containing
		// both Integers and Doubles, then display total of the elements
		Number[] numbers = {1, 2.4, 3, 4.1}; // Integers and Doubles
		ArrayList<Number> numberList = new ArrayList<>();
		
		// insert elements in numberList
		for (Number element : numbers)
			numberList.add(element);
		
		System.out.printf("numberList contains: %s%n", numberList);
		System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
	} // end main

	public static <T extends Number> double sum(ArrayList<T> list)
	//public static double sum(ArrayList<? extends Number> list) first attempt
	{
		double total = 0; // initialize total
		
		// calculate sum
		//for (Number element : list) first attempt
		for (T element : list)
			total += element.doubleValue();
		
		return total;
	}
} // end class WildcardTest
	
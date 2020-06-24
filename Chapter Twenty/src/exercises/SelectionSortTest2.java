//package exercises;
//
//import java.security.SecureRandom;
//import java.util.Arrays;
//
//public class SelectionSortTest2 {
//	SelectionSort selectionObject = new SelectionSort();
//	
//	public static void main(String[] args)
//	{
//		SecureRandom generator = new SecureRandom();
//
//		int[] data = new int[10]; // create array
//
//		for (int i = 0; i < data.length; i++) // populate array
//			data[i] = 10 + generator.nextInt(90);
//
//		System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data)); // display array
//		selectionObject.selectionSort(data); // sort array
//
//		System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data)); // display array
//	}
//} // end class SelectionSortTest
//
//

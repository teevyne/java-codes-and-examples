package exercises;

import java.security.SecureRandom;
//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
public class SelectionSort 
{
	public static  <T extends Comparable<? super T>> void selectionSort(T[] data){
			// loop over data.length - 1 elements
			for (int i = 0; i < data.length - 1; i++)
			{
				int smallest = i; // first index of remaining array

				// loop to find index of smallest element
				for (int j = 1; j < data.length; j++)
					if (data[j].compareTo(data[smallest]) < 0)
						smallest = j;

				swap(data, i, smallest); // swap smallest element into position
				printPass(data, i + 1, smallest); // output pass of algorithm
			}
		}
	
	// helper method to swap values in two elements
		private static <T> void swap(T[] data, int first, int second)
		{
			T temporary = data[first]; // store first in temporary
			data[first] = data[second]; // replace first with second
			data[second] = temporary; // put temporary in second
		}

		// print a pass of the algorithm
		private static <T> void printPass(T[] data, int pass, int index)
		{
			System.out.printf("after pass %2d: ", pass);

			// output elements till selected item
			for (int i = 0; i < index; i++)
				System.out.printf("%d ", data[i]);

			System.out.printf("%d* ", data[index]); // indicate swap

			// finish outputting array
			for (int i = index + 1; i < data.length; i++)
				System.out.printf("%d ", data[i]);

			System.out.printf("%n "); // for alignment

			// indicate amount of array that’s sorted
			for (int j = 0; j < pass; j++)
				System.out.print("-- ");
			System.out.println();
		}
		
	public static void main(String[] args)
	{
		SelectionSort selectionObject = new SelectionSort();
		SecureRandom generator = new SecureRandom();

		int[] data = new int[10]; // create array

		for (int i = 0; i < data.length; i++) // populate array
			data[i] = 10 + generator.nextInt(90);

		System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data)); // display array
		selectionObject.selectionSort(data); // sort array

		System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data)); // display array
	}
} // end class SelectionSortTest

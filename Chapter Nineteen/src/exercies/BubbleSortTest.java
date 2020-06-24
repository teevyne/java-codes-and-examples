package exercies;

import java.security.SecureRandom;
import java.util.Arrays;

public class BubbleSortTest 
{
	private static void bubbleSort(int[] data)
	{
		for (int i = 0; i < data.length; i++) {
			int larger = i;
			for (int index = 1; index < data.length - i; index++) {
				if (data[index] > data[i])
					larger = index;
			}
			
			swap(data, i, larger);
			printPass(data, i + 1, larger);
		}
	}
	
	private static void swap(int[] data, int first, int second) {
		int temp = data[second];
		data[second] = data[first];
		data[first] = temp;
	}
	
	private static void printPass(int[] data, int pass, int index) 
	{		
		System.out.printf("%n...after pass %2d = ", pass);
		
		for (int i = 0; i < index; i++) {
			System.out.printf("%d ", data[i]);
		}
		
		System.out.printf("%d ", data[index]);
		
		for (int i = index + 1; i < data.length; i++) {
			System.out.printf("%d ", data[i]);
		}
		
		System.out.printf("%n ");
		
		for (int j = 0; j <= pass; j++)
			System.out.print("-- ");
		System.out.println();		
	}
	
	public static void main(String[] args) {
		SecureRandom generator = new SecureRandom();
		
		int[] data = new int[10];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = 5 + generator.nextInt(50);
		}
		
		System.out.printf("Unsorted Array: %n%s", Arrays.toString(data));
		bubbleSort(data);
		System.out.printf("Bubble Sorted Array: %n%s", Arrays.toString(data));
	}
}


public class NestedForCanSumArray 
{
	public static void main(String[] args) 
	{
	
		int[][] myArray =  {{ 1, 2, 3, 4, 5, 6 },
							{ 7, 8, 9, 10, 11, 12 },
							{ 13, 14, 15, 16, 17, 18 },
							{ 19, 20, 21, 22, 23, 45 }
							};
	
		System.out.println(sumArray(myArray));
		System.out.println(largestValue(myArray));
		System.out.println(smallestValue(myArray));
		System.out.println(sumRows(myArray));
		System.out.println(myArray[0][5]);
		
		int colTotal = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			//System.out.println(myArray[i][1]);
			colTotal += myArray[i][0];
		}
		System.out.println("\n" + colTotal);
		
		int rowTotal = 0;
		for (int i = 0; i < myArray.length + 2; i++) {
			//System.out.println(myArray[i][1]);
			rowTotal += myArray[0][i];
		}
		System.out.println("\n" + rowTotal);
	}
	
	public static int sumArray (int[][] anArray)
	{
		int arrayTotal = 0;
	
		for (int[] element : anArray) {
			for (int anElement : element) {
				arrayTotal += anElement;
			}
		}
		return arrayTotal;
	}
	
	public static int largestValue(int[][] anArray)
	{
		int highest = 0;
		for (int[] element : anArray) {
			for (int anElement :  element) {
				if (anElement > highest) {
					highest = anElement;
				}
			}
		}
		return highest;
	}
	
	public static int smallestValue(int[][] anArray)
	{
		int smallest = anArray[0][0];
		for (int[] element : anArray) {
			for (int anElement :  element) {
				if (anElement < smallest) {
					smallest = anElement;
				}
			}
		}
		return smallest;
	}
	
	public static int sumRows(int[][] anArray)
	{
		int rowSum = 0;
		for (int[] aValue : anArray) {
			for(int anotherValue : aValue) {
				rowSum += anotherValue;
			}
		}
		return rowSum;
	}
}


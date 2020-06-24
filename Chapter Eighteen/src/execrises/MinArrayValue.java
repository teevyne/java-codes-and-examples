package execrises;
public class MinArrayValue {

	public static int findMinimum(int[] array, int n) {
		if (n == 1)
			return array[0];
		else
			return Math.min(array[n - 1], findMinimum(array, (n - 1)));
	}
	
//	public static int findMaximum(int[] array, int n) {
//		if (n == 1)
//			return array[0];
//		else
//			return Math.max(array[n - 1], findMinimum(array, (n - 1)));
//	}
	
	public static void main(String[] args) {
		int[] newArray = { 2, 6, 3, 10, 7, 6, 9 };
		int num = newArray.length;
		
		System.out.println(findMinimum(newArray, num));
		//System.out.println(findMaximum(newArray, num));
	}
}

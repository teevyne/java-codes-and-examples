import java.util.Arrays;

public class CopyArray 
{
	public static void main (String[] args) 
	{
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int[] b = new int[30];
		
		for (int i = 0; i < a.length; i++) 
		{
			b[i] = a[i];
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println();
		System.out.print("[");
//		for (int value : b) {
//			System.out.printf("%d, ", value);
//		}
		
		for (int i = 0; i < b.length - 1; i++) {
			System.out.printf("%d, ", b[i]);
		}
		System.out.print(b[b.length - 1]);
		System.out.print("]");
	}
}

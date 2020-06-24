package codewar;

public class GideonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array =  new int[21];
		
		for (int i = 1; i < array.length; i++) 
		{
			if (i % 2 == 0) 
			{
					array[i] = 2;
			}
			if (i % 11 == 0)
			{
				System.out.println();
			}
			System.out.printf("%d ", array[i]);
			
		}
	}
}

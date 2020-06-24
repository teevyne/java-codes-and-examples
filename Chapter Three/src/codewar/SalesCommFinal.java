package codewar;

public class SalesCommFinal 
{
	public static void main(String[] args) 
	{
		double[] workerWage = { 0, 5000, 2000, 1500, 3200, 1000, 900, 4000, 9500, 500, 6000 };
		int[] frequency = new int[11];
		int mainWage = 0;
		
		for (int wage = 0; wage < workerWage.length; wage++)
		{
			mainWage = (int) (workerWage[wage] * 0.09);
			//System.out.println((mainWage + 200));
			++frequency[(mainWage + 200) / 100];
		}
		
		System.out.printf( "%s:%20s:\n", "Index", " Value"); // column heading
		
		for (int j = 2; j < frequency.length; j++)
		{
			if (j == 10)
			{
				System.out.printf("%3d and above: %8d", 1000, frequency[j]);
			}
			else
			{
				System.out.printf("%d-%d: %15d", ((j) * 100), (((j) * 100) + 99), frequency[j]);
			}
			
//			for (int c = 0; c < frequency[j]; c++)
//			{
//				System.out.print(frequency[j]);
//			}
			System.out.println();
		}
	}

}

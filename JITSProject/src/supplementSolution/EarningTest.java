package supplementSolution;

public class EarningTest
{
	public static void main (String[] args)
	{
		Earning eOne = new Earning ("January", 224.21);
		Earning eTwo = new Earning ("Febraury", 249.32);
		Earning eThree = new Earning ("March", 258.11);

		System.out.printf("%s%n%s%n%s%n", eOne, eTwo, eThree);
	}
}
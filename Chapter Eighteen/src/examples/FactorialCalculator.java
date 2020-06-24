package examples;

public class FactorialCalculator 
{	
	// Recursive methoddeclaration (assumes that the parameter >= 0)
	public static long factorial(long number) {
		//int counter = 0;
		if(number <= 1) 
			return 1;
		else {
			System.out.println("factorial(" + number + ")");
			System.out.println(" ");
			return number * factorial(number - 1);
		}
	}

	public static void main(String[] args) {
		//Do for the first ten numbers
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%d! = %d%n", i, factorial(i));
		}
		
//		Question seven print
//		for (int i = 0; i <= 4; i++) {
//			int b = 4;
//			System.out.printf("%d and %d give %d%n", i, b, mystery(i, b));
//		}
		
		//Question eight print
		System.out.println(sum(5));
		
		//Question nine print
		System.out.println(power(5, 3));
	}

//	Question seven solution
//	public static int mystery(int a, int b)
//	{
//		if (b == 1)
//			return a;
//		else
//			return a + mystery(a, b - 1);
//	}
	
	
	//Question eight solution
	public static int sum(int n) {
		if (n == 1)
			return 1;
		else
			return n + sum(n - 1);
	}
	
	
	//question nine solution
	public static int power(int base, int exponent) {
		if (exponent == 1)
			return base;
		else
			return base * power(base, (exponent - 1));
	}
}

package exercise7_10;

public class SalesCommission {
	private int[] grossSales = { 2050, 5000, 2000, 1500, 3200, 3000, 900, 4000, 9500, 500, 6000};
	
	int[] frequency = new int[9];
	private final int weeklyWage = 200;
	private final double standardCommission = 0.09;

	public int getGrossSales(int i) {
			return grossSales[i];
		
	}
	
	public int getSalary(int i) {
		int salary = (int) ((grossSales[i] * standardCommission) + weeklyWage);
		return salary;
	} 
	
	public static void main(String[] args) {
		
	}
}

//Constructor methods
//Initialiser methods
//Instance menthods

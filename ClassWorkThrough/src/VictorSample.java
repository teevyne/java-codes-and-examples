import java.util.Scanner;
import java.util.Arrays;
public class VictorSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] employeeDetail = new String[10][8];
		
		for (int i = 0; i < employeeDetail.length; i++)
		{
			for (int j = 0; j < employeeDetail[i].length; j++) {
				System.out.println("Enter details of employee: ");
				employeeDetail[i][j] = sc.nextLine();
			}
			
		}
		
		//For loop to print out the eventual matrix
				for (int i = 0; i < employeeDetail.length; i++) {
					for (int j = 0; j < employeeDetail[i].length; j++) {
						System.out.print(employeeDetail[i][j] + "   ");
					}
					System.out.println(" ");
				}
	}
}

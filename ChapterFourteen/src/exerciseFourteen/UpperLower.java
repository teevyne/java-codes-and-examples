package exerciseFourteen;

import java.util.Scanner;
public class UpperLower {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a text: ");
		String response = sc.nextLine();
		
		System.out.println(response.toUpperCase());
		System.out.println(response.toLowerCase());
		
		sc.close();
	}
}

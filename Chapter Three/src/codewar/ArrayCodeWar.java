package codewar;

import java.util.Scanner;

public class ArrayCodeWar
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		
		int[][] gameWon = new int[m][n];
		//int i = 1, j = 1;
		//int r = 0;
		
		for (int i = 0; i < gameWon.length; i++) {
			for (int j = 0; j < gameWon[i].length; j++) {
				System.out.print("Enter a number: ");
				gameWon[i][j] = sc.nextInt();
				
			}
		}
		
		//System.out.println(gameWon[i][j]);
		
		sc.close();
	}
}
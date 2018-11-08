package chapter6;

import java.util.Scanner;
/**
 * Print matrix
 * <p>Creates a matrix of 1's and 0's from a input number </p>
 * @author Kacie Rae
 * <p> Date : 11-8-18 </p>
 *
 */

public class Exercise6point17 {
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = input.nextInt();
		
		// code for calling a method to print matrix.
		printMatrix(n);
	input.close();	
	}// end of main method
	
	public static void printMatrix(int n) {
		for (int r = 1; r <= n; r++) { //loop for rows 
			for (int c = 1; c <= n; c++) { // loop for columns
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
		
	
	}

}

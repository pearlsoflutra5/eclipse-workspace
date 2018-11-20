package chapter6;

import java.util.Scanner;
/**
 * Print matrix
 * <p>Creates a matrix of 1's and 0's from a input number </p>
 * @author Kacie Rae
 * <p> Date: 11-9-18 </p>
 *
 */
public class Exercise6point17 {
	/**
	 * This is the main method which makes use of printMatrix
	 * @param args unused
	 * @return void
	 */
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = input.nextInt();
		
		// code for calling a method to print matrix.
		printMatrix(n);
	input.close();	
	}// end of main method
	
	/**
	 * This method is used to print a matrix. 
	 * @param n int which determines number of rows and columns
	 */
	public static void printMatrix(int n) {
		for (int r = 1; r <= n; r++) { //loop for rows 
			for (int c = 1; c <= n; c++) { // loop for columns
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
		
	}
	
}

package chapter6;

import java.util.Scanner;
/**
 * Print matrix
 * <p>Creates a matrix of 1's and 0's from a input number </p>
 * @author Kacie Rae
 * <p> Date: 11-9-18 </p>
 *
 */
public class Exercise6point37 {
	/**
	 * This is the main method which makes use of format
	 * @param args unused
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int number = input.nextInt();
		System.out.print("Enter a width: ");
		int width = input.nextInt();
		
		System.out.print("The formatted number is: " + format(number, width));
		input.close();
	}
	/**
	 * This is the method that shows the number which makes use of length
	 * @param number int that determines the number you are formatting
	 * @param width int  that determines how long to make the new number
	 * @return int that adds 0's to the end of a number to the number that was given
	 */
	public static String format(int number, int width){
		String result = number + "";
		
		for (int i = 0; i < width - length(number); i++){
			result = "0" + result;
		}
		return result;
		// return a number possibly with additional 0's
	}
	
	/**
	 * This  is the method that determines the length of the original number 
	 * @param number int that determines what number we are scanning 
	 * @return int that shows the size of the original number
	 */
	public static int length(int number) {
		int size = 0;
		while (number > 0){
			size += 1;
			number = number / 10;
		}
		return size; 
		//return number of digits
	}
}

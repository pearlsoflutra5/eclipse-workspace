package chapter6;

import java.util.Scanner;
/**
 * Test for Palindrome
 * <p>Checks to see if integer is a palindrome </p>
 * @author Kacie Rae
 * <p> Date: 11-7-18 </p>
 *
 */
public class Exercise6point3 {
	
	/**
	 * This is the main method with makes use of reverse and isPalindrome
	 * @param args unused
	 * @return void 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a whole number: ");
		int number = input.nextInt();
		
		if (isPalindrome(number) == true){
			System.out.println(number + " is a palindrome");
		}
		else{
			System.out.println(number + " is not a palindrome");
		}
		input.close();	
	}
	/**
	 * This method is used to check whether an int is a palindrome
	 * @param number int which is being tested for palindrome
	 * @return Boolean that shows whether a number is palindrome
	 */

	public static boolean isPalindrome(int number){
		int reverse = reverse(number);
		
		if (number == reverse) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * This method is used to reverse an int
	 * @param number int which is being reversed
	 * @return integer 
	 */
	public static int reverse(int number) { 
		int result = 0;
		int remainder;
		
		while (number > 0) {
			remainder = number % 10; 
			number = number / 10;
			result = result * 10 + remainder;
		}
		
		return result;
	}
}


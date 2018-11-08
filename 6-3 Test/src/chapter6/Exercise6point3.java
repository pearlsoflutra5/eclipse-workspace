package chapter6;

import java.util.Scanner;

public class Exercise6point3 {
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

	public static boolean isPalindrome(int number){
		int reverse = reverse(number);
		
		if (number == reverse) {
			return true;
		}
		else {
			return false;
		}
	}

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


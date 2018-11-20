

package chapter6;

import java.util.Scanner;
/**
 * Millisecond Converter
 * <p>Converts milliseconds  </p>
 * @author Kacie Rae
 * <p> Date: 11-10-18 </p>
 *
 */
public class Exercise6point25 {
	/**
	 * This is the main method which makes use of convertMillis
	 * @param args unused
	 * @return void
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter a time in milliseconds: ");
		long totalMillis = input.nextLong();
		
		System.out.print ("the converted time from milliseconds is " + convertMillis(totalMillis));
	
		input.close();
	}
	
	/**
	 * This method is used to convert milliseconds
	 * @param millis long which determines how many milliseconds there are
	 * @return long which returns hours: minutes: seconds
	 */
	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;
		int seconds = (int)(totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		int minutes = (int)(totalMinutes % 60);
		long hours = totalMinutes / 60;

		return hours + ":" + minutes + ":" + seconds; 
	}

}




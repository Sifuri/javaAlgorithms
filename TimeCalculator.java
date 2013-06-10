import javax.swing.JOptionPane;

/**@author Lemuel M. Uhuru
 * @Date   June 9, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 187 Problem 6: TimeCalculator
 * 
 * @Description Write a program that asks the user to enter
 * a number of seconds. Design a decision structure to return
 * the number of minutes, hours, and days, contingent upon the 
 * amount of seconds entered. Minutes if the number of seconds 
 * is >= to 60, hours if >= 3600, or days if
 * >= 86,400 seconds.
 */

public class TimeCalculator {
	
	public static void main(String[] args) {
		// Declare value to hold user input
		String input;
		
		// Declare int variable to store amount in seconds
		int seconds;
		
		// Prompt user to enter a number of seconds
		input = JOptionPane.showInputDialog(null, "Enter a number of seconds");
		
		// Convert user input into data-type int
		seconds = Integer.parseInt(input);
		
		// Design decision structure to convert number of 
		// seconds to minutes, hours, or days
	
		if (seconds < 86400){
			if (seconds >= 3600){
				
			}
			else if(seconds >= 60){
				
			}
		}
		else{
			
		}

	}

}

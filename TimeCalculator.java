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
		// Declare number constants to hold time values in seconds
		int MINUTE = 60;
		int HOUR = 3600;
		int DAY = 86400;
		
		// Declare value to hold user input
		String input;
		
		// Declare int variable to store amount in seconds
		int seconds;
		
		// Prompt user to enter a number of seconds and
		// store its value in the variable 'input'
		input = JOptionPane.showInputDialog(null, "Enter a number of seconds");
		
		// Convert user input into data-type int
		seconds = Integer.parseInt(input);
		
		// Design decision structure to display number of 
		// minutes, hours, or days based on the number of 
		// seconds chosen by the user.
	
		if (seconds < 86400){
			if (seconds >= 3600){
				JOptionPane.showMessageDialog(null, (seconds/3600) + " hours " + ((seconds%3600)/60) + 
													" minutes and " + ((seconds%3600)%60) + " seconds.");
			}
			else if(seconds >= 60){
				JOptionPane.showMessageDialog(null, seconds + " seconds is equal to " + 
								seconds/60 + " minutes and " + seconds%60 + " seconds.");
			}
		}
		else{
			JOptionPane.showMessageDialog(null, (seconds/86400) + " days " + (seconds%86400)/3600 + " hours " +
											((seconds%86400)%3600)/60 + " minutes " +  ((seconds%86400)%3600)%60 + 
											" seconds.");
		}

	}

}

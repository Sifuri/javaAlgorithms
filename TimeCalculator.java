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
		int MIN = 60;
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
	
		if (seconds < DAY){
			if (seconds >= HOUR){
				JOptionPane.showMessageDialog(null, (seconds/HOUR) + " hours " + ((seconds%HOUR)/MIN) + 
													" minutes and " + ((seconds%HOUR)%MIN) + " seconds.");
			}
			else if(seconds >= MIN){
				JOptionPane.showMessageDialog(null, seconds + " seconds is equal to " + 
								seconds/MIN + " minutes and " + seconds%MIN + " seconds.");
			}
		}
		else{
			JOptionPane.showMessageDialog(null, (seconds/DAY) + " days " + (seconds%DAY)/HOUR + " hours " +
											((seconds%DAY)%HOUR)/MIN + " minutes " +  ((seconds%DAY)%HOUR)%MIN + 
											" seconds.");
		}

	}

}

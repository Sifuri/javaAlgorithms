import javax.swing.JOptionPane;


/**@author Lemuel M. Uhuru
 * @Date   June 5, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 187 Problem 2: Magic Dates
 * 
 * Program that asks the user to enter a month (in numeric form), 
 * a day, and a two digit year. The program should then determine 
 * whether the month times the day is equal to the year. If so, 
 * it should display a message saying the date is magic. Otherwise, 
 * it should display  a message saying the date is not magic.
 */


public class MagicDates {

	public static void main(String[] args) {
		// Declare 3 variables to hold user input for month, day, and year.
		String input1, input2, input3;
		
		// Prompt user for input
		input1 = JOptionPane.showInputDialog(null, "Enter a month in numeric form");
		input2 = JOptionPane.showInputDialog(null, "Enter a day in numeric form");
		input3 = JOptionPane.showInputDialog(null, "Enter a 2 digit year");
		
		// Convert user input from String to Integer
		// and store in variables m, d, and y.
		int m = Integer.parseInt(input1);
		int d = Integer.parseInt(input2);
		int y = Integer.parseInt(input3);
		
		// Design decision structure to validate whether or not
		// the product of the month and day equals the year.
		if (m * d == y){
			JOptionPane.showMessageDialog(null, "The date is magic!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The date is not magic!");
		}

	}

}

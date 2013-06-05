import javax.swing.JOptionPane;


/**@author Lemuel M. Uhuru
 * @Date   June 4, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 187 Problem 1 
 * 
 * Program that prompts the user to enter a number within the range
 * of 1 through 10. Program should display the Roman numeral version 
 * of that number. If the number is outside the range of 1 through 10, 
 * the program should display an error message.
 */

public class RomanNumerals {

	public static void main(String[] args) {
		// Create a variable to hold user input
		String input;
		// Prompt user for numerical input from 1-10
		input = JOptionPane.showInputDialog(null, "Enter a number 1 - 10 ");
		// Convert input to an integer
		int n = Integer.parseInt(input);
		// Use decision structure to validate user input
		if(n < 1 ||  n > 10){
			JOptionPane.showMessageDialog(null, "Invalid input!");
		}
	}

}

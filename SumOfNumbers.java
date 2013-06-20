import javax.swing.JOptionPane;

/**@author Lemuel M. Uhuru
 * @Date   June 20, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 266 Challenge: Sum of Numbers
 * 
 * @Description Write a program that asks the user for a positive nonzero
 * integer value. The program should use a loop to get the sum of all the
 * integers from 1 up to the number entered. For example if the user enters
 * 50, the loop will find the sum of 1,2,3,4,..... 50.
 */

public class SumOfNumbers {

	public static void main(String[] args) {
		// Declare variable to hold user input
		
		// Prompt user for positive nonzero integer value and store in variable.
		String input1 = JOptionPane.showInputDialog("Enter a positive nonzero integer");
		
		// Convert input1 to an integer data-type
		int num = Integer.parseInt(input1);
		
		// Construct while loop to obtain the sum of integers from 1 up to the users input.
		

	}

}

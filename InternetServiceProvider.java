import javax.swing.JOptionPane;

/**@author Lemuel M. Uhuru
 * @Date   June 16, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 191 Problem 13: Internet Service Provider 
 * 
 * @Description Write a program that calculates a customer's monthly bill.
 * It should ask the user to the letter of the package the customer has purchased
 * (A,B,or C) and the number of hours that were used. It should then display
 * the total charges.
 */

public class InternetServiceProvider {

	public static void main(String[] args) {
		// Declare variables for package prices
		double priceA =  9.95;
		double priceB = 13.95;
		double priceC = 19.95;
		
		// Declare variable to hold user package
		char userPackage;
		
		// Declare variable to hold hours used
		int hours;
		
		// Prompt user for package type
		String input = JOptionPane.showInputDialog("Enter your package letter (A/B/C)").toUpperCase();
		
		// Prompt user for the amount of hours used
		String input2 = JOptionPane.showInputDialog("Enter the amount of hours used");
		
		// Convert input2 to data-type int
		hours = Integer.parseInt(input2);
		
		// Convert input1 to data-type char using the charAt string method
		// which returns the first element within a given string.
		userPackage = input.charAt(0);
	
		// Calculate total charges for package A and B
		double totalChargesA = ((hours-10) * 2) + priceA;
		double totalChargesB = ((hours-20) * 1) + priceB;
		
		// Design switch statement with nested if-else structures
		// to display the appropriate total charges.
		
		switch (userPackage){
		case 'A':
			if(hours > 10)
				JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Charges: $" + totalChargesA);
			else
				JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Charges: $" + priceA);
			break;
		case 'B':
			if(hours > 20)
				JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Charges: $" + totalChargesB);
			else
				JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Charges: $" + priceB);
			break;
		case 'C':
				JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Charges: $" + priceC);
		}
	}
}

import javax.swing.JOptionPane;

/**@author Lemuel M. Uhuru
 * @Date   June 17, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 191 Challenge 14: Internet Service Provider, Part 2
 * 
 * @Description Modify the program you wrote for Programming Challenge 13
 * so it also calculates and displays the amount of money Package A customers
 * would save if they purchased Package B or C, and the amount of money
 * Package B customers would save if they purchased Package C. If there would
 * be no savings, no message should be printed.
 */

public class InternetServiceProvider2 {

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
		
		// Declare variables for potential savings
		double packageAToB = (totalChargesA - priceB);
		double packageAToC = (totalChargesA - priceC);
		double packageBToC = (totalChargesB - priceC);
		
		// Design switch statement with nested if-else structures
		// to display the appropriate total charges.
		
		switch (userPackage){
		case 'A':
			if(hours > 10)
				if(totalChargesA > priceC)
					JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Hours: " + hours + "\nTotal Charges: $" + totalChargesA + "\nPackage C (Savings) " + "$"+packageAToC);	
				else if(totalChargesA > priceB)
					JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Hours: " + hours + "\nTotal Charges: $" + totalChargesA + "\nPackage B (Savings) " + "$"+packageAToB);
				else
					JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Hours: " + hours + "\nTotal Charges: $" + totalChargesA);	
			else
				JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Hours: " + hours + "\nTotal Charges: $" + priceA);
			break;
		
		case 'B':
			if(hours > 20)
				if(totalChargesB > priceC)
					JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Hours: " + hours + "\nTotal Charges: $" + totalChargesB + "\nPackage C (Savings) " + "$"+packageBToC);
				else
					JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Hours: " + hours + "\nTotal Charges: $" + totalChargesB);
			else
				JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Hours: " + hours + "\nTotal Charges: $" + priceB);
			break;
		
		case 'C':
				JOptionPane.showMessageDialog(null, "Package: " + userPackage + "\nTotal Hours: " + hours + "\nTotal Charges: $" + priceC);
		}
	}
}

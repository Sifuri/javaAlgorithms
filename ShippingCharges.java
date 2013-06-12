import javax.swing.JOptionPane;


/**@author Lemuel M. Uhuru
 * @Date   June 12, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 189 Problem 9: Shipping Charges
 * 
 * @Description Write a program that asks the user to 
 * enter the weight of a package and then displays the 
 * shipping charges.
 */
public class ShippingCharges {

	public static void main(String[] args) {
		// Declare String variable for user input.
		String input;
		
		// Declare Int variable to store weight of package.
		double weight;
		
		// Prompt user for weight of package.
		input = JOptionPane.showInputDialog("Enter weight of package in pounds");
		
		// Convert String input to data-type double
		weight = Double.parseDouble(input);
		
		// Design decision structure to determine shipping charges
		// corresponding to the weight of the package.
		
		if (weight <= 10){
			if (weight > 6){
				JOptionPane.showMessageDialog(null, " Weight (Pounds): " + weight + 
											"\n Shipping Charges: $3.70");
			}
			else if (weight > 2){
				JOptionPane.showMessageDialog(null, " Weight (Pounds): " + weight + 
											"\n Shipping Charges: $2.20");
			}
			else{
				JOptionPane.showMessageDialog(null, " Weight (Pounds): " + weight + 
						"\n Shipping Charges: $1.10");
			}
		}
		else{
			JOptionPane.showMessageDialog(null, " Weight (Pounds): " + weight + 
					"\n Shipping Charges: 3.80");
		}
		
	}

}

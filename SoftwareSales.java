import javax.swing.JOptionPane;

/**@author Lemuel M. Uhuru
 * @Date   June 5, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 189 Problem 8: Software Sales
 * 
 * @Description Write a program that ask the user to enter the number
 * of packages purchased. The program should then display the amount of 
 * the discount (if any) and the total amount of the purchase after the
 * discount.
 */

public class SoftwareSales {

	public static void main(String[] args) {
		// Declare PRICE constant to hold the retail price of the package
		int PRICE = 99;
		// Declare qty variable to store the quantity of package desired by the user
		int qty;
		// Declare variable for user input
		String input;
		
		// Prompt user for pacakge quantity and store in the variable input
		input = JOptionPane.showInputDialog("Enter the quantity of packages");
		
		// Convert input into data-type int
		qty = Integer.parseInt(input);
		
		// Design decision structure to determine user discount prices
		
		if(qty < 100){
			if (qty >= 50){
				JOptionPane.showMessageDialog(null, " Quantity: " + qty + "\n Discount: " + " 40% Off" + 
											" \n Discount Price: " + ((qty*PRICE)-(qty*PRICE*.40)));	
			}
			else if (qty >= 20){
				JOptionPane.showMessageDialog(null, " Quantity: " + qty + "\n Discount: " + " 30% Off" + 
						" \n Discount Price: " + ((qty*PRICE)-(qty*PRICE*.30)));
			}
			else{
				JOptionPane.showMessageDialog(null, " Quantity: " + qty + "\n Discount: " + " 20% Off" + 
						" \n Discount Price: " + ((qty*PRICE)-(qty*PRICE*.20)));
			}
		}
		else{
			JOptionPane.showMessageDialog(null, " Quantity: " + qty + "\n Discount: " + " 50% Off" + 
					" \n Discount Price: " + ((qty*PRICE)-(qty*PRICE*.50)));
		}
			
		
	}

}

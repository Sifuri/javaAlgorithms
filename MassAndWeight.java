import javax.swing.JOptionPane;

/**@author Lemuel M. Uhuru
 * @Date   June 8, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 189 Problem 5: Mass and Weight
 * 
 * @Description Write a program that asks the user to enter
 * an objects mass, and then calculate it's weight using the 
 * following formula: Weight = Mass X 9.8.
 */

public class MassAndWeight {

	public static void main(String[] args) {
 	    //Declare variable to hold user input
	    String input;
	   
	    //Declare variable to hold the weight value in Newtons.
		double weight;
		
        //Prompt user for the objects mass
		input = JOptionPane.showInputDialog(null, "Enter the objects mass");
		
		//Convert user input to data-type double because
		// JOptionPane returns data-type String.
		double mass = Double.parseDouble(input);
        
		//Calculate weight
		weight = mass * 9.8;
		
		//Design decision structure to determine if 
		//weight is 'too heavy' or 'too light'.
		
		if(weight > 1000){
			JOptionPane.showMessageDialog(null, "The object weighs " + weight + " newtons. It is too heavy.");
		}
		else if (weight < 10) {
			JOptionPane.showMessageDialog(null, "The object weighs " + weight + " newtons. It is too light.");
		}
		// Optional branch
		else{
			JOptionPane.showMessageDialog(null, "The object weighs " + weight + " newtons.");
		}
	}
}

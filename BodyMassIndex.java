import javax.swing.JOptionPane;


/**@author Lemuel M. Uhuru
 * @Date   June 6, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 187 Problem 3: Body Mass Index
 * 
 * @Description Write a program that calculates and displays 
 * 	a persons body mass index (BMI). A person BMI is calculated
 *  with the following formula  BMI = Weight X 703 / Height^2
 */


public class BodyMassIndex {

	public static void main(String[] args) {
		// Declare variables to hold user weight and height
		// Using data-type String to store String return value 
		// from JOptionPane
		String input1, input2;
		
		// Declare constant to store BMI
		double BMI;
		
		// Initialize variables to hold user input.
		input1 = JOptionPane.showInputDialog(null, "Enter weight in pounds");
		input2 = JOptionPane.showInputDialog(null, "Enter height in inches");
		
		// Convert user input to double values
		double weight = Double.parseDouble(input1);
		double height = Double.parseDouble(input2);
		
		// Initialize BMI variable
		BMI = weight * (703 / (Math.pow(height, 2)));
		
		// Design control structure to determine if user 
		// weight is optimal, under, or over.
		
		if ( BMI >= 18.5 & BMI <= 25){
			JOptionPane.showMessageDialog(null, "Your BMI indicates Optimal Weight." );
			// Personal Note: 
			// && evaluates the left side of the operation, & evaluates both sides 
			// of the operation, if its true, continues and evaluates the right side.
		}
		else if (BMI < 18.5){
			JOptionPane.showMessageDialog(null, "Your BMI indicates that you're underweight");
		}
		else if (BMI > 25){
			JOptionPane.showMessageDialog(null, "Your BMI indicates that you're overweight.");
		}


	}

}

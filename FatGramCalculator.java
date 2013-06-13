import javax.swing.JOptionPane;

/**@author Lemuel M. Uhuru
 * @Date   June 13, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 190 Problem 10: Fat Gram Calculator
 * 
 * @Description Write a program that ask the user to enter
 * the number of calories and fat grams in a food item. The
 * program should display the percentage of the calories that
 * come from fat. If the calories are less than 30 percent of 
 * the total calories of the food, it should also display a 
 * message indicating the food is low in fat. It should also 
 * display an 'invalid input message' if the total amount of 
 * calories is less than the amount from fat.
 */

public class FatGramCalculator {

	public static void main(String[] args) {
		// Declare variables to hold user input
		String input1,input2;
		
		// Declare variables to store calorie and fat data
		double totalCal,
			   totalFat,
			   fatCal;
		double fatPercent;
		
		// Prompt user for total number of calories in food
		input1 = JOptionPane.showInputDialog("Enter total number of calories");
		input2 = JOptionPane.showInputDialog("Enter the amount of fat in grams");
		
		// Convert number of calories and fat to data-type int
		totalCal = Double.parseDouble(input1);
		totalFat = Double.parseDouble(input2);
		
		// Calculate the number of calories composed of fat
		fatCal = totalFat * 9;
		
		// Calculate percentage of calories derived from fat
		fatPercent = (fatCal/totalCal)*100;
		
		// Design decision structure to validate input
		// and monitor low fat.
		
		if(fatCal > totalCal){
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}
		else if ( fatPercent < 30){
			JOptionPane.showMessageDialog(null, "Total Calories: " + totalCal + "\nTotal Fat: " +
										totalFat + "g" + "\nFat Percentage: " + fatPercent + "%" + "\nSynopsis: Low in Fat");
		}
		else{
			JOptionPane.showMessageDialog(null, "Total Calories: " + totalCal + "\nTotal Fat: " +
					totalFat + "g" + "\nFat Percentage: " + fatPercent + "%");
		}
		
	}

}

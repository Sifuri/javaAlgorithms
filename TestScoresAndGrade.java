import javax.swing.JOptionPane;

/**@author Lemuel M. Uhuru
 * @Date   June 7, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 189 Problem 4: Test Score and Grade
 * 
 * @Description Write a program that calculates the average of
 * three user test scores, then display the average and a letter 
 * grade that corresponds to the average.
 */

public class TestScoresAndGrade {
	
	public static void main(String[] args) {
		// Declare variables to hold user input
		String input1, input2, input3;
		// Declare variables to store converted user input
		double score1, 
			   score2, 
			   score3, 
			   average;
		
		// Prompt user for 3 test scores
		input1 = JOptionPane.showInputDialog(null, "Enter score 1:");
		input2 = JOptionPane.showInputDialog(null, "Enter score 2:");
		input3 =JOptionPane.showInputDialog(null, "Enter score 3:");
		
		// Convert test scores to data type double
		score1 = Double.parseDouble(input1);
		score2 = Double.parseDouble(input2);
		score3 = Double.parseDouble(input3);
		
		// Calculate test score average
		average = (score1 + score2 + score3) / 3;
		
		// Design a decision structure to determine a
		// letter grade that corresponds to the average.
		
		if (average <= 100){
			if(average >= 90){
				JOptionPane.showMessageDialog(null, "Your average is " + average + " or A");
			}
			else if(average >= 80){
				JOptionPane.showMessageDialog(null, "Your average is " + average + " or B");
			}
			else if(average >= 70){
				JOptionPane.showMessageDialog(null, "Your average is " + average + " or C");
			}
			else if(average >= 60){
				JOptionPane.showMessageDialog(null, "Your average is " + average + " or D");
			}
			else if(average < 60) {
				JOptionPane.showMessageDialog(null, "Your average is " + average + " or F");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,  "Your average is out of bounds, check test scores.");
		}
	}

}

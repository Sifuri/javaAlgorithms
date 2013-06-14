import javax.swing.JOptionPane;


/**@author Lemuel M. Uhuru
 * @Date   June 14, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 190 Problem 11: Running the Race
 * 
 * @Description Write a program that asks for the names of three
 * runner and the time, in minutes, it took each of them to finish
 * a race. The program should display the names of the runners in the
 * order that they finished.
 */

public class RunningTheRace {

	public static void main(String[] args) {
		
		// Declare variables to store user input
		String name1,
			   name2,
			   name3,
			   time1,
			   time2,
			   time3;
		
		// Declare time variables to store converted
		// user input
		double  t1,
		        t2,
		        t3;
		
		// Prompt user for the three runners names 
		name1 = JOptionPane.showInputDialog("Enter the first runners name");
		name2 = JOptionPane.showInputDialog("Enter the second runners name");
		name3 = JOptionPane.showInputDialog("Enter the third runners name");
		
		// Prompt the user for the time each runner finished the race.
		time1 = JOptionPane.showInputDialog("Enter the time runner 1 finished the race");
		time2 = JOptionPane.showInputDialog("Enter the time runner 2 finished the race");
		time3 = JOptionPane.showInputDialog("Enter the time runner 3 finished the race");
		
		// Convert time values to data-type double for evaluation
		// in decision structure.
		t1 = Double.parseDouble(time1);
		t2 = Double.parseDouble(time2);
		t3 = Double.parseDouble(time3);
		
		// Use decision structure to determine the order of display
		// for runners with the best time to the least.
		
		if(t1 > t2 && t1 > t3){
			if(t2>t3){
				JOptionPane.showMessageDialog(null, "1st Place: " + name1 + "\n2nd Place: " + name2 + "\n3rd Place: " + name3);
			}
			else{
				JOptionPane.showMessageDialog(null, "1st Place: " + name1 + "\n2nd Place: " + name3 + "\n3rd Place: " + name2);
			}
		}
		else if(t2>t1 && t2>t3){
			if(t1>t3){
				JOptionPane.showMessageDialog(null, "1st Place: " + name2 + "\n2nd Place: " + name1 + "\n3rd Place: " + name3);
			}
			else{
				JOptionPane.showMessageDialog(null, "1st Place: " + name2 + "\n2nd Place: " + name3 + "\n3rd Place: " + name1);
			}
		}
		else if(t3>t2 && t3>t1){
			if(t2>t1){
				JOptionPane.showMessageDialog(null, "1st Place: " + name3 + "\n2nd Place: " + name2 + "\n3rd Place: " + name1);
			}
			else{
				JOptionPane.showMessageDialog(null, "1st Place: " + name3 + "\n2nd Place: " + name1 + "\n3rd Place: " + name2);
			}
		}
	}

}

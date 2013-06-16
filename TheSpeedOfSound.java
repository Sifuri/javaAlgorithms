import javax.swing.JOptionPane;
import java.text.*;

/**@author Lemuel M. Uhuru
 * @Date   June 15, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 190 Problem 12: The Speed of Sound
 * 
 * @Description Write a program that asks the user to enter 
 * "air", "water", or "steel", and the distance that a sound
 * wave will travel in the medium. The program should then display
 * the amount of time it will take. 
 */
public class TheSpeedOfSound {
	
	public static void main(String[] args) {
		
		//Declare constants that approximate the
		//speed of sound in Air, Steel, and Water
				int AIR = 1100;
				int WATER = 4900;
				int STEEL = 16400;
			
		//Declare variable to hold medium type and distance value.
		String medium,
		       distance;
	    
	    //Prompt user for medium
	    medium = JOptionPane.showInputDialog("Enter the medium (water/steel/air) ").toLowerCase();
	    
	    //Prompt user for distance
	   distance = JOptionPane.showInputDialog("Enter distance in feet");
	    
	    //Convert distance to data-type double
	    double D  = Double.parseDouble(distance);
	    
	    // Calculate time for sound to travel through medium
	    double timeA = D/AIR;
	    double timeW = D/WATER;
	    double timeS = D/STEEL;
	    
	    // Decimal formating for Time variables
	    NumberFormat df = DecimalFormat.getInstance();
	    df.setMaximumFractionDigits(2);

	    
	    //Design if-else control structure to display the amount
	    //of time it will take sound to travel through the medium given 
	    //the users input.
	    
	 // *Don't understand why the '==' or equal to operator cannot be used 
	//  as a substitute for the equals method in the following conditions.
	    
	    if(medium.equals("water"))
	    	JOptionPane.showMessageDialog(null, "Medium: " + medium + "\nDistance: " + D + " ft" + "\nTime: " + df.format(timeW) + " seconds");
	    else if(medium.equals("air"))
	    	JOptionPane.showMessageDialog(null, "Medium: " + medium + "\nDistance: " + D + " ft" + "\nTime: " + df.format(timeA) + " seconds");
	    else if(medium.equals("steel"))
	    	JOptionPane.showMessageDialog(null, "Medium: " + medium + "\nDistance: " + D + " ft" + "\nTime: " + df.format(timeS) + " seconds");
	    else
	    	JOptionPane.showMessageDialog(null, "Invalid input");
	}
}

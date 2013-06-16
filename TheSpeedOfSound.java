import javax.swing.JOptionPane;

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
		
		// Declare constants that approximate the
				// speed of sound in Air, Steel, and Water
				int AIR = 1100;
				int WATER = 4900;
				int STEEL = 16400;
			
		// Declare var for user input
		String medium,
		       distance;
		
		
	    
	    // Prompt user for medium
	    medium = JOptionPane.showInputDialog("Enter the medium (water/steel/air) ");
	    
	    // Prompt user for distance
	   distance = JOptionPane.showInputDialog("Enter distance in feet");
	    
	    // Convert distance to data-type double
	    double D = Double.parseDouble(distance);
	    
	 // Declare variable to hold time
	    double wTime =  D/WATER;
	    double aTime = D/AIR;
	    double sTime = D/STEEL;
	    
	    if(medium == "water"){
	    	JOptionPane.showMessageDialog(null, "Medium: " + medium + "\nDistance: " + D + "\nTime: " + wTime);
	    }
	    else if(medium == "air"){
	    	JOptionPane.showMessageDialog(null, "Medium: " + medium + "\nDistance: " + D + "\nTime: " + aTime);
	    }
	    else if(medium == "steel"){
	    	JOptionPane.showMessageDialog(null, "Medium: " + medium + "\nDistance: " + D + "\nTime: " + sTime);
	    }
	    
	}

}

import java.text.*;


/**@author Lemuel M. Uhuru
 * @Date   July 13, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 268 Challenge 11: Celsius to Fahrenheit Table
 * 
 * @Description Write a program that displays a table of the Celsius temperatures
 * 0 through 20 and their Fahrenheit equivalents. Your program should use a loop
 * to display the table.
 */
public class CelsiusToFahrenheitTable {

	public static void main(String[] args) {
			
			// Table Header
			System.out.println("                Temperature (Degrees)");
			System.out.println("----------------------------------------------");
			System.out.println("   Celsius " + "                  Fahrenheit");
			
			// Decimal formatting
			NumberFormat df = DecimalFormat.getInstance();
		    df.setMaximumFractionDigits(2);
		    
			// Counter variable
			int count = 20;
			double fahrenheit;
			
			// For loop to calculate fahrenheit and display table data
			for(int i = 0; i<=count; i++){
				fahrenheit = 9/5.0*i+32;
				System.out.println("      " + i  + "                       " +  df.format(fahrenheit));
			}
	}
}

import java.util.Scanner;
import java.text.*;

/**@author Lemuel M. Uhuru
 * @Date   July 9, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 268 Challenge 9: Population
 * 
 * @Description Write a program that will predict the size of a population
 * of organisms. The program should ask for the starting number of organisms,
 * their average daily population increase (as a percentage), and the number
 * of days they will multiply. Do not accept a number less than 2 for the starting
 * size of the population. Do not accept a negative number for average daily population
 * increase. Do not accept a number less than 1 for the number of days they will multiply.
 */
public class Population {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);							// Create Scanner object
		NumberFormat df = DecimalFormat.getInstance();					// Decimal formatting
	    df.setMaximumFractionDigits(2);
		int days;														// Store the number of days to multiple the population
		double organisms = 0;										    // Store number of organism		
		double increaseRate = 0;									    // Daily population increase percentage
		
		
		System.out.print("Number of days to multiply: ");
		days  = input.nextInt();										// Prompt user for the number of days
		
		while(days < 1){
			System.out.print("Invalid entry. Re-enter a value greater than 0: ");
			days  = input.nextInt();
		}
		
		System.out.print("Number of organisms: ");
		organisms = input.nextDouble();										// Prompt user for the amount of organisms
		
		while( organisms < 2){												// Input validation
			System.out.print("Ivalid entry. Re-enter a value greater than 1: ");
			organisms = input.nextDouble();	
		}
		
		System.out.print("Percentage of increase: ");
		increaseRate = input.nextDouble()/100;								// Prompt user for the rate of increase in percentage
		
		while( increaseRate < 0){											// Input validation
			System.out.print("Ivalid entry. Re-enter a non-negative value: ");
			increaseRate = input.nextDouble();	
		}
		
		System.out.println(""); // Newline
		
		System.out.println("Day" +"       Population" + "       Percent of Increase");	
		System.out.println("_______________________________________________");
		System.out.println("  1           " + df.format(organisms));
		for(int i=2; i<days + 1; i++){
			organisms += (organisms *= increaseRate);
			System.out.println("  " +i + "           " + df.format(organisms) + "                " + (increaseRate*100)+"%");
		}
	}
}

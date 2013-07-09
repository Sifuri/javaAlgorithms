import java.util.Scanner;
import java.io.*;

/**@author Lemuel M. Uhuru
 * @Date   July 9, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 268 Challenge 6: Population
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
		int days;														// Store the number of days to multiple the population
		double organisms = 0;										    // Store number of organism		
		double increaseRate = 0;									    // Daily population increase percentage
		double population = organisms + (organisms * increaseRate);	    // Calculate population after increase
		
		days  = input.nextInt();										// Prompt user for the number of days
		organisms = input.nextDouble();									// Prompt user for the amount of organisms
		increaseRate = input.nextDouble();								// Prompt user for the rate of increase in percentage
		
		System.out.println("Day" +"Population" + "Percent of Increase");
		System.out.println("------------------------------------------");
		
		for(int i=0; i<days; i++){
			
		}
	}
}

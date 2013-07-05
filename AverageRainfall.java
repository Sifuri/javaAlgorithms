import java.util.Scanner;
import java.text.*;

/* @author Lemuel M. Uhuru
 * @Date   July 4, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 268 Challenge 8 Average Rainfall
 * 
 * Write a program that uses nested loops to collect data and calculate the
 * average rainfall over a period of years. First the program should ask for
 * the number of years. The outer loop will iterate once for each year. The 
 * inner loop will iterate 12 times, once for each month. Each iteration of 
 * the inner loop will ask the user for the inches of rainfall for that month.
 * After all iterations, the program should display the number of months, the 
 * total inches of rainfall, and the average rainfall per month for the entire 
 * period. Do not accept a number less than 1 for the number of years.
 * Do not accept negative number for the monthly rainfall.
 */

public class AverageRainfall {

	public static void main(String[] args) {
		
		int years;												// Variable to hold the amount of years
		
		final int MONTHS = 12; 									// Constant to hold the amount of months in a year
		
		int totalMonths = 0;									// Months accumulator variable
		
		double monthlyRain;										// Holds the amount of rain in inches for each month
		
		double totalRainfall = 0;								// Holds the total rainfall
		
		NumberFormat df = DecimalFormat.getInstance();		    // Decimal formating
		df.setMaximumFractionDigits(2);			
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the number of years
		System.out.println("Enter the number of years: ");
		years = input.nextInt();
		
		System.out.println("Enter the rainfall amount for each month ");
		// Construct for-loop for each year
		for(int i=0; i < years; i++){
			for(int j=1; j<MONTHS+1; j++){
				switch(j){
				case 1:
					System.out.print("January: ");
					break;
				case 2:
					System.out.print("February: ");
					break;
				case 3:
					System.out.print("March: ");
					break;
				case 4: 
					System.out.print("April: ");
					break;
				case 5:
					System.out.print("May: ");
					break;
				case 6:
					System.out.print("June: ");
					break;
				case 7:
					System.out.print("July: ");
					break;
				case 8:
					System.out.print("August: ");
					break;
				case 9:
					System.out.print("September: ");
					break;
				case 10:
					System.out.print("October: ");
					break;
				case 11:
					System.out.print("November: ");
					break;
				case 12:
					System.out.print("December: ");
				}
				monthlyRain = input.nextDouble();
				totalRainfall += monthlyRain;
			}
			totalMonths += MONTHS;
		}
		
		double avgRainfall = totalRainfall/totalMonths;		// Holds the average rainfall
		
		// Newline1
		System.out.println("");
		// Display rainfall data
		System.out.println("Total Months: " + totalMonths + "\nTotal Rainfall: " + df.format(totalRainfall) + " inches" +
				"\nAverage Rainfall: " + df.format(avgRainfall) + " inches");
	}
}
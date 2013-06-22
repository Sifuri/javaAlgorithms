import java.util.Scanner;

/**@author Lemuel M. Uhuru
 * @Date   June 22, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 267 Challenge 2: Distance Traveled
 * 
 * @Description Write a program that asks for the speed of a vehicle
 * (in miles per hour) and the number of hours it has traveled. It 
 * should use a loop to display the distance a vehicle has traveled 
 * for each hour of a time period specified by the user. Do not accept
 * a negative number for speed and do not accept any value less than 1
 * for time traveled.
 */

public class DistanceTraveled {
	
	public static void main(String[] args) {
		// Declare values to store user input.
		int speed = 0,
			hours = 0;
		
		// Create scanner object
		Scanner keyboard = new Scanner(System.in);
		
		
		// Prompt user for speed and hour values.
		System.out.print("Enter the speed: ");
		speed = keyboard.nextInt();
		
		// Input validation to ensure speed isn't a negative number
		while(speed < 0){
			System.out.print("Enter the speed: ");
			speed = keyboard.nextInt();
		}
		
		System.out.print("Enter the amount of hours traveled: ");
		hours = keyboard.nextInt();
		
		// Input validation: Hours must be greater than 1
		while(hours < 1){
			System.out.print("Enter the amount of hours traveled (MPH): ");
			hours = keyboard.nextInt();
			}
		
		// Display the table header for rendering report.
		System.out.println("Hours" + "             Distance Traveled");
		System.out.println("------------------------------------");
		
		// Declare counter variable to count loop iterations.
		int hr = 1;
		
		// Construct while-loop to display report data.
		while(hours >= 1){
			System.out.println("  " + hr + "                     " + hr * speed + " MPH");
			hr++;
			hours--;
		}
	}
}

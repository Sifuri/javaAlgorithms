import java.util.Scanner;
import java.text.*;


/**@author Lemuel M. Uhuru
 * @Date   June 24, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 267 Challenge 4: Pennies for Pay
 * 
 * @Description Write a program that calculates the amount a person would
 * earn over a period of time if his or her salary is one penny the first day,
 * two pennies the second day, and continues to double each day. The program should
 * display a table showing the salary for each day, and then show the total pay at the
 * end of the period. The output should be displayed in a dollar amount, not the number
 * of pennies. Do not accept a number less than 1 for the number of days worked.
 */
public class PenniesForPay {

	public static void main(String[] args) {
		// Declare var to store number of days worked
		int numDays;
		
		// User salary
		double salary = 0.01;
	    double totalSalary = 0.01;
		
		// Create scanner object
		Scanner keyboard = new Scanner(System.in);
		
	    // Decimal formating for salary variables
	    NumberFormat df = DecimalFormat.getInstance();
	    df.setMaximumFractionDigits(2);
		
		// Prompt user for input
		System.out.print("Enter the number of days worked: ");
		numDays = keyboard.nextInt();
		
		// Input validation: Input must not be less than 1
	    while (numDays < 1){
	    	System.out.print("Enter the number of days worked: ");
			numDays = keyboard.nextInt();
	    }
		
		// Display table header
		System.out.println("Day  " + "   Salary     " + "Total Salary");
		
		// Display number of days
		int day = 1;
		
		// Construct while loop to display days, daily salary, and total salary.
		while (numDays > 0){
			System.out.println(day + "       $" + salary + "       $" + df.format(totalSalary));
			salary *= 2;
			totalSalary += salary;
			day++;
			numDays--;
		}
	}
}

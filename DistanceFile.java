import java.util.Scanner;
import java.io.*;


/**@author Lemuel M. Uhuru
 * @Date   June 23, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 267 Challenge 3: Distance File
 * 
 * @Description Modify the program you wrote for Programming Challenge 
 * (Distance Traveled) so it writes the report to a file instead of the 
 * screen. Open the file in Notepad or another text editor to confirm the 
 * output.
 */

public class DistanceFile {
	
	public static void main(String[] args) throws IOException
	{
		// Declare values to store user input.
		int speed = 0,
			hours = 0;
		
		// Declare variable to hold file name
		String fileName;
		
		// Create scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt user for speed and hour values.
		System.out.print("Enter the speed: ");
		speed = keyboard.nextInt();
		
		// Input validation to ensure speed isn't a negative number
		while(speed < 0)
		{
			System.out.print("Enter the speed: ");
			speed = keyboard.nextInt();
		}
		
		System.out.print("Enter the amount of hours traveled: ");
		hours = keyboard.nextInt();
		
		// Input validation: Hours must be greater than 1
		while(hours < 1)
		{
			System.out.print("Enter the amount of hours traveled (MPH): ");
			hours = keyboard.nextInt();
		}
				
		// Consume the remaining newline character
		keyboard.nextLine();
		
		// Prompt user for the file name to store data from the report
		System.out.print("Enter the file name: ");
		fileName = keyboard.nextLine();
		
		// Open the file
		PrintWriter openedFile = new PrintWriter(fileName + ".txt");
		
		// Display the table header for rendering report.
		openedFile.println("Hours" + "             Distance Traveled");
		openedFile.println("------------------------------------");
		
		// Declare counter variable to count loop iterations.
		int hr = 1;
		
		// Construct while-loop to display report data.
		while(hours >= 1){
			openedFile.println("  " + hr + "                     " + hr * speed + " MPH");
			hr++;
			hours--;
		}
		openedFile.close();
		System.out.println("Data stored in " + fileName + ".txt");
	}
}

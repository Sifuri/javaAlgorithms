import java.util.Scanner;
import java.io.*;

/**@author Lemuel M. Uhuru
 * @Date   June 26, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 267 Challenge 6: File Letter Counter
 * 
 * @Description Write a program that asks the user to enter the name of a file, 
 * and then asks the user to enter a character. The program should count and display
 * the number of times that the specified character appears in the file. Use Notepad or
 * another text editor to create a simple file that can be used to test the program.
 */

public class FileLetterCounter {

	public static void main(String[] args) throws IOException{
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for file name and store value in fileName
		System.out.println("Enter file name: ");
		String fileName = input.nextLine();
		
		// Prompt user for the specified character and store in variable
		System.out.println("Enter a single character: ");
		String charInput = input.nextLine();
		char character = charInput.charAt(0);
		
		// Create File and Scanner object to open the file.
		File file = new File(fileName + ".txt");
		Scanner fileInput = new Scanner(file);
		
		// Declare var to store lines from the file
		String line = fileInput.nextLine();
		
		// Declare counting variable
		int count = 0;
		
		// Construct for loop to calculate the number of times
		// the specified character appears within the file.
		System.out.println();
	}
}

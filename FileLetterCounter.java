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
		
		// Create Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		// Prompt user for file name 
		System.out.print("Enter file name: ");
		String fileName = input.nextLine();

		// Create File 
		File file = new File(fileName + ".txt");
		
		// Ensure that file exist
		if(!file.exists()){
			System.out.println("The file " + fileName + ".txt does not exist.");
			System.exit(0);
		}
		
		// Create scanner object to open file.
		Scanner fileInput = new Scanner(file);
		
				
		// Prompt user for the specified character and store in variable
		System.out.println("Enter a single character: ");
		String charInput = input.nextLine();
		char character = charInput.charAt(0);
		
		
		// Declare var to store lines from the file
		String line; 
		
		// Declare counting variable
		int count = 0;
		
		// Construct while and for loop to calculate the number of 
		// times the specified character appears within the file.
		
		while(fileInput.hasNext()){
			line = fileInput.nextLine();
			for(int j=0; j<line.length(); j++){
				if(line.charAt(j)==character){
					count += 1;
				}
			}
		}
		
		// Diplay character count
		System.out.println("The character " + character + " appears in the file " + count + " times.");
		
		// Close file
		fileInput.close();
	}
}

import java.util.*;
import java.io.*;


/**@author Lemuel M. Uhuru
 * @Date   August 2, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 269 Challenge 14: Line Numbers
 * 
 * @Description Write a program that asks the user for the name of a file. 
 * The program should display the contents of the file with each line preceded with a
 * line number followed by a colon. The line numbering should start at 1.
 */


public class LineNumbers {

	public static void main(String[] args) throws IOException{
		// Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for file name
		System.out.println("Enter the file name: ");
		String fileName = input.nextLine();
		
		// Open file
		File file = new File(fileName + ".txt");
		
		// Ensure that file exist
		if(!file.exists()){
		 System.out.println("The file " + fileName + ".txt does not exist.");
		 System.exit(0);
		}
		
		// Instantiate Scanner with file
		Scanner inputFile = new Scanner(file);
		
		// Store line
		String line;
		
		// Counter
		int counter = 0;
		
		// Loop over file and precede each line with its corresponding
		// position number and a colon.
		while(inputFile.hasNext()){
			counter += 1;
			line = inputFile.nextLine();
			System.out.println(counter + ": " + line);
		}
	}
}

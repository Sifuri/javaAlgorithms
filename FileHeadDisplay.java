import java.util.*;
import java.io.*;


/**@author Lemuel M. Uhuru
 * @Date   July 18, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 269 Challenge 13: File Head Display
 * 
 * @Description Write a program that asks the user for the name of a file.
 * The program should display only the first five lines of the file's content.
 * If the file contains fewer than five lines, it should display the file's entire 
 * contents.
 */

public class FileHeadDisplay {
	
	public static void main(String[] args) throws IOException
	{ 
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for file name
		System.out.println("Enter a file name: ");
		String fileName = input.nextLine();
		
		// Open file
		File file = new File(fileName + ".txt");
		Scanner inputFile = new Scanner(file);
		
		// Line
		String line;
		
		// Initialize counter
		int counter = 0;
		
		// While loop
		while(counter <= 5){
			line = inputFile.nextLine();
			if(inputFile.hasNext()){
				System.out.println(line);
				counter += 1;
			}
			else{
				System.out.println(line);
				counter += 1;
			}
		}
		// Close file
		inputFile.close();
	}
}

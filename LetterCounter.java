import java.util.Scanner;


/**@author Lemuel M. Uhuru
 * @Date   June 25, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 267 Challenge 5: Letter Counter
 *  
 * @Description Write a program that asks the user to enter a string, and then asks
 * the user to enter a character. The program should count and display the number of 
 * times that the specified character appears in the string.
 */

public class LetterCounter {

	public static void main(String[] args) {
		// Declare variable to store string 
		String text;
		
		// Declare var to store character
		char character;
		
		// Create Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user for String input
		System.out.println("Enter a string: ");
		text = keyboard.nextLine();
		
		// Prompt the user for Char input
		System.out.println("Enter a character: ");
		character = keyboard.nextLine().charAt(0);
		
		// Declare counter variable
		int count = 0;
		
		// Construct for loop to calculate the number of 
		// times that the specified character appears in the string.
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == character){
				count += 1;
			}
		}
		// Diplay the number of times the character appears
		System.out.println("The character appears " + count + " times");
	}
}

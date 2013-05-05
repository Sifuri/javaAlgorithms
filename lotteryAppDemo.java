import java.util.Scanner;

/* @author Lemuel M. Uhuru
 * @Date   May 5, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 493 Problem 9
 * 
 * Program that simulates a lottery. 
 */

public class lotteryAppDemo {
	public static void main(String[] args) {
		//Instantiate scanner object for user input
		Scanner keyboard = new Scanner(System.in);
		
		//Instantiate new array to hold users lottery numbers
		int[] myPicks = new int[5];
		
		
		System.out.println("Let's play the lotto!");
		for(int i = 0; i < myPicks.length; i++){
			System.out.print("Enter lotto number " + (i+1) +  ": ");
			myPicks[i] = keyboard.nextInt();
		}
		
		lotteryApp numbers = new lotteryApp();
		if(numbers.userPicks(myPicks) == 5)
			System.out.println("Jackpot!");
		else
			System.out.println("Sorry, you only got " + numbers.userPicks(myPicks) +
					" numbers correct!");
		

	}

}

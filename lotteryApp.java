import java.util.Random;

/* @author Lemuel M. Uhuru
 * @Date   May 2, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 493 Problem 9
 * 
 * Program that simulates a lottery. 
 */

public class lotteryApp {
	// Create an array of 5 integers named lotteryNumbers
	int[] lotteryNumbers = new int[5];
	
	// Create a constructor that assigns a random number between 0 and 9 to each
	// element within the lotterNumbers array.
	public lotteryApp(){
		Random random = new Random();
		for(int i = 0; i < lotteryNumbers.length; i++){
			lotteryNumbers[i] = random.nextInt(9);
		}
	}
	
	// Create a method that accepts an array of 5 integers that represents
	// a users lottery picks and compares them to the random numbers array to 
	// return the number of digits that match.
	public int userPicks(int[] array){
		int totalMatch = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] == lotteryNumbers[i])
				totalMatch += 1;
		}	
		return totalMatch;
	}
	
	// Create a method that returns a copy of the lotterNumbers array.
	public int[] getLotteryNumbers(){
		return lotteryNumbers;
	}

}

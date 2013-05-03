import java.util.Scanner;

/*
 * @Date   May 2, 2013
 * 
 * Program that creates a class and stores the total 
 * rainfall for each 12 months into an array of doubles 
 * and demonstrates the class in a complete program.
 */

public class rainFall {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
	    final int SIZE = 12;
		double[] monthlyRain = new double[SIZE];
		
		System.out.println("Enter the monthly rain fall amount: ");
		for(int i = 0; i < SIZE; i++){
			System.out.print("Month " + (i+1) + ": ");
			monthlyRain[i] = keyboard.nextDouble();
		}	
		
		System.out.println("The annual sum of rain: " + sumRain(monthlyRain));
		System.out.println("The average sum of rain: " + averageRain(monthlyRain));
	}		
	
	// Create a function that returns the total rainFall for the year.
	
	static double sumRain(double[] array){
		double sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
			}
		return sum;
		}
	
	// Create a function that returns the average monthly rainFall for the year.
	static double averageRain(double[] array){
		double average = 0;
		average = sumRain(array)/array.length;
		return average;
	}
	
	// Create a function that returns the month with the most rain.
	static double mostRain(double[] array){
		double most = 0;
		for (int i = 0; i < array; i++){
			if(array[i] > array[i+1]){
				most = 
			}
		}
	}
	
	// Create a function that returns the month with the least rain.
	
	
				
}

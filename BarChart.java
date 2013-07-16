import java.util.*;


/**@author Lemuel M. Uhuru
 * @Date   July 15, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 269 Challenge 12: Bar Chart
 * 
 * @Description Write a program that asks the user to enter today's
 * sales for five stores. The program should display a bar chart comparing
 * each store's sales. Create each bar in the bar chart by displaying a row
 * of asterisks. Each asterisk should represent $100 of sales. 
 */

public class BarChart {

	
	public static void main(String[] args) {

		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Store store sales
		
		int sales = 0;
		
		System.out.print("Enter today's sales for store 1: ");
		int sales1 = input.nextInt();
		
		System.out.print("Enter today's sales for store 2: ");
		int sales2 = input.nextInt();
		
		System.out.print("Enter today's sales for store 3: ");
		int sales3 = input.nextInt();
		
		System.out.print("Enter today's sales for store 4: ");
		int sales4 = input.nextInt();
		
		System.out.print("Enter today's sales for store 5: ");
		int sales5 = input.nextInt();
		

		// Newline
		System.out.println("");
		
		// Table Header
		System.out.println("SALES BAR CHART");
		for(int k = 1; k <= 5; k++){
			System.out.print("Store " + k + ": ");
			switch(k){
			case 1:
				sales = sales1;
				break;
			case 2:
				sales = sales2;
				break;
			case 3:
				sales = sales3;
				break;
			case 4: 
				sales = sales4;
				break;
			case 5:
				sales = sales5;
			}
			for(int l=1; l<=sales/100; l++){
				System.out.print("*");
				
			}
			// Newline
			System.out.println("");
		}
		
	}
}

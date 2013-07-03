import java.util.Scanner;
import java.text.*;

/**@author Lemuel M. Uhuru
 * @Date   June 27, 2013
 * Book Title: From Control Structures through Objects by Tony Gaddis 
 * Page: 268 Challenge 7: Hotel Occupancy
 * 
 * @Description Write a program that calculates the occupancy rate for each 
 * floor of a hotel. The program should start by asking for the number of floors
 * in the hotel. A loop should then iterate once for each floor. During each iteration,
 * the loop should ask the user for the number of rooms on the floor and the number of 
 * them that are occupied. After all the iterations, the program should display the number
 * of rooms the hotel has, the number of them that are occupied, the number that are vacant,
 * and the occupancy rate for the hotel. Do not accept a value less than one for the number
 * of floors. Do not accept a number less than 10 for the number of rooms on a floor.
 */


public class HotelOccupancy {
	
	public static void main(String[] args) {
	 int floors;
	 double rooms = 0; 
	 int roomsOccupied = 0;
	 double totalRooms = 0;
	 double totalRoomsOccupied = 0;
	 double totalVacancy = 0;
	 double occupancyRate = 0.0;
		
		// Create Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		// Prompt user for floor count
		System.out.print("Enter the number of floors: ");
		floors = input.nextInt();
		
		// Input validation: Floor count > 1
		while(floors < 1){
			System.out.print("Invalid Input. Enter a number of floors greater than 0: ");
			floors = input.nextInt();
		}
		
		
		for(int i=0; i<floors; i++){
			// Prompt user for the number of rooms
			System.out.print("Enter the number of rooms (Floor " + (int)(i + 1) + "): ");
			rooms = input.nextInt();
			
			// Room input validation
			while(rooms < 10){
				System.out.print("Invalid input. Enter a number of rooms greater than 9 \n(Floor " + (int)(i + 1) + "): ");
				rooms = input.nextInt();
			}
			
			// Prompt user for the number of rooms occupied.
			System.out.print("Enter the number of rooms occupied(Floor " + (int)(i + 1) + "): ");
			roomsOccupied = input.nextInt();
			
			// Calculate total rooms
			totalRooms += rooms;
			
			// Calculate total rooms occupied
			totalRoomsOccupied += roomsOccupied;
		}
		
		// Calculate total vacancy
		totalVacancy = totalRooms - totalRoomsOccupied; 
		
		// Calculate occupancy rate
		occupancyRate = (totalRoomsOccupied/totalRooms);
		
		// Decimal formating 
		  NumberFormat df = DecimalFormat.getInstance();
		  df.setMaximumFractionDigits(2);
		
		// Display Hotel Occupancy data
		System.out.println("Total Rooms: " + totalRooms + "\nOccupied(QTY): " + totalRoomsOccupied + 
							"\nVacant Rooms(QTY): " + totalVacancy + "\nOccupancy Rate: " + df.format(occupancyRate) + "%");
	}
}

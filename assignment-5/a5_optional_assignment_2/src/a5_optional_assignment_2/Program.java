package a5_optional_assignment_2;

import java.util.Scanner;

public class Program {
	static Scanner scanner =  new Scanner(System.in);
	static float total_miles_driven_per_day;
	static float cost_per_gallon_of_gasoline;
	static float average_miles_per_gallon;
	static float parking_fees_per_day;
	static float tolls_per_day;
	
	static void accept() {
		System.out.println("___Give me details___");
		System.out.print("Enter total_miles_driven_per_day: ");
		total_miles_driven_per_day = scanner.nextFloat();
		System.out.print("Enter cost_per_gallon_of_gasoline: ");
		cost_per_gallon_of_gasoline = scanner.nextFloat();
		System.out.print("Enter average_miles_per_gallon: ");
		average_miles_per_gallon = scanner.nextFloat();
		System.out.print("Enter parking_fees_per_day: ");
		parking_fees_per_day = scanner.nextFloat();
		System.out.print("Enter tolls_per_day: ");
		tolls_per_day = scanner.nextFloat();
	}
	
	static float getTotalGasUsed() {
		return total_miles_driven_per_day * average_miles_per_gallon;
	}
	
	static float getTotalCost() {
		return getTotalGasUsed() * cost_per_gallon_of_gasoline;
	}
	
	static float costPerDay() {
		return getTotalCost() + parking_fees_per_day + tolls_per_day;
	}
	
	
	static void display() {
		System.out.println("___Show details___");
		System.out.println("getTotalGasUsed: " + getTotalGasUsed());
		System.out.println("getTotalCost: " + getTotalCost());
		System.out.println("costPerDay: " + costPerDay());
	}
	
	public static void main(String[] args) {
		
		accept();
		
		display();
		
		 
	}
}

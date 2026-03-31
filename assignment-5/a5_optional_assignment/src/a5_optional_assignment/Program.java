package a5_optional_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	static Scanner scanner;
	static List<Customer> list;
	
	static void addCustomer() {
		Customer c = new Customer();
		c.accept(scanner);
		
		list.add(c);
	}
	
	static void showCustomersWithNewBalanceAndCreditLimitStatus() {
		for(Customer c : list) {
			System.out.println("[ Account number: " + c.getAccountNumber());
			System.out.println("New balance: " + c.getNewBalance());
			if(c.isLimitExceed()) {
				System.out.println("Credit limit exceed!");
			}
			System.out.print("]");
		}
	}
	
	static int menuList() {
		System.out.println("1. Add customer");
		System.out.println("2. All customers new balance with credit limit status.");
		
		int choice;
		System.out.print("Enter choice: ");
		choice = scanner.nextInt();
		
		switch(choice) {
			case 1 -> addCustomer();
			case 2 -> showCustomersWithNewBalanceAndCreditLimitStatus();
		}
		
		return choice;
		
	}
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		list = new ArrayList<Customer>();
		
		while(menuList() != 0) {}
		
	}

}

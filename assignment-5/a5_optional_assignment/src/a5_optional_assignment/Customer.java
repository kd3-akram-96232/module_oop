package a5_optional_assignment;

import java.util.Scanner;

public class Customer extends CreditCard{
	int account_number;

	public Customer() {
		
	}
	public Customer(int account_number, double beginning_balance, double charges, double credits, double credit_limit) {
		super(beginning_balance, charges, credits, credit_limit);
		this.account_number = account_number;	
	}
	
	public void setAccountNumber(int ac) {
		this.account_number = ac;
	}
	
	public int getAccountNumber() {
		return this.account_number;
	}
	
	public void accept(Scanner scanner) {
		System.out.println("Enter user details.---");
		System.out.print("---Enter account number: ");
		this.account_number = scanner.nextInt();
		super.accept(scanner);
	}
	
	public void display() {
		System.out.println("---Show user---");
		System.out.println("account number: " + account_number);
		super.display();
	}
	
}

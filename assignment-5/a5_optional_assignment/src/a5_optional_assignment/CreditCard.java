package a5_optional_assignment;

import java.util.Scanner;

public class CreditCard {
	double beginning_balance;
	double charges;
	double credits;
	double credit_limit;
	
	public CreditCard() {
		
	}
	public CreditCard( double beginning_balance,double charges,double credits,double credit_limit ) {
		this.beginning_balance = beginning_balance;
		this.charges = charges;
		this.credits = credits;
		this.credit_limit = credit_limit;
	}

	public double getBeginning_balance() {
		return beginning_balance;
	}

	public void setBeginning_balance(double beginning_balance) {
		this.beginning_balance = beginning_balance;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public double getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(double credit_limit) {
		this.credit_limit = credit_limit;
	}
	
	public void accept(Scanner scanner) {
		System.out.println("----------");
		System.out.print("---Enter beginning balance: ");
		this.beginning_balance = scanner.nextDouble();
		System.out.print("---Enter charges: ");
		this.charges = scanner.nextDouble();
		System.out.print("---Enter credits: ");
		this.credits = scanner.nextDouble();
		System.out.print("---Enter credit limit: ");
		this.credit_limit = scanner.nextDouble();
	}
	
	public void display() {
		System.out.println("Beginning balance: " + beginning_balance);
		System.out.println("Charges: " + charges);
		System.out.println("Credits: " + credits);
		System.out.println("Credit limit: " + credit_limit);
	}
	
	public double getNewBalance() {
		return beginning_balance + charges - credits;
	}
	
	public boolean isLimitExceed() {
		return getNewBalance() > credit_limit;
	}
	
}

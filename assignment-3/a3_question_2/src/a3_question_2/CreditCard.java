package a3_question_2;

import java.util.Scanner;

public class CreditCard {
    int beginning_balance;
    int charges;
    int credits;
    int credit_limit;

    public CreditCard() {}
    public CreditCard(int beginning_balance, int charges, int credits, int credit_limit){
        this.beginning_balance = beginning_balance;
        this.charges = charges;
        this.credits = credits;
        this.credit_limit = credit_limit;
    }

    public void setBeginningBalace(int beginning_balance){
        this.beginning_balance = beginning_balance;
    }
    public int getBeginningBalace(){
        return beginning_balance;
    }

    public void setCharges(int charges){
    	this.charges = charges;
    }
    public int getCharges(){
        return beginning_balance;
    }

    public void setCredits(int credits){
    	this.credits = credits;
    }
    public int getCredits(){
        return beginning_balance;
    }
    
    public void setCreditLimit(int credit_limit){
    	this.credit_limit = credit_limit;
    }
    public int getCreditLimit(){
        return beginning_balance;
    }


    public void accept(Scanner scanner){
    	System.out.println("---------------");
        System.out.print("Enter beginning balance: ");
        beginning_balance = scanner.nextInt();
        System.out.print("Enter charges: ");
        charges = scanner.nextInt();
        System.out.print("Enter credits: ");
        credits = scanner.nextInt();
        System.out.print("Enter credit limit: ");
        credit_limit = scanner.nextInt();
    	System.out.println("---------------");
    }
    
    public int newBalance() {
    	return (beginning_balance + charges - credits);
    }

    public boolean isLimitExceed(){
        return (newBalance() >= credit_limit);
    }

    public void display(){
        System.out.println("Beginning balace: " + beginning_balance);
        System.out.println("Charges: " + charges);
        System.out.println("Credits: " + credits);
        System.out.println("Credit limit: " + credit_limit);
    }


}

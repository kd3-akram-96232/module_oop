package a3_question_2;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		CreditCard creditCard = new CreditCard();

		creditCard.accept(sc);
		creditCard.display();

		System.out.println("New balance: " + creditCard.newBalance());
		
		if(creditCard.isLimitExceed()){
			System.out.println("Credit limit Exceed");
		}
		
	}
	
}

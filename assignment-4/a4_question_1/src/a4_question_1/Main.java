package a4_question_1;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public static Fruit[] fruits;
	public static int size;
	public static int currentIndex = 0;

	public static void printChoices(){
		System.out.println("1. Add mongo");
		System.out.println("2. Add orange");
		System.out.println("3. Add apple");
		System.out.println("4. Display names of all fruits in the basket.");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits");
		System.out.println("6. Display tastes of all stale (not fresh) fruits in the basket");
		System.out.println("7. Mark a fruit as stale i/p : index, Eg: setter : isFresh : false");
		System.out.println("8. Mark all sour fruits stale");
		System.out.println("0. Exit!");
	}

	static void displayNamesOfAllFruits(){
		for(Fruit fruit : fruits){

			if(fruit == null){
				continue;
			}

			if(fruit.getName() != null){
				System.out.println("fruit name: " + fruit.getName());
			}
		}
	}

	static void displayAllFreshFruits(){
		for(Fruit fruit : fruits){

			if(fruit == null){
				continue;
			}

			if(fruit.isFresh()){
				System.out.println(fruit.toString());
				System.out.println(fruit.taste(fruit));
			}
		}
	}

	static void displayAllNotFreshFruitTastes(){
		for(Fruit fruit : fruits){

			if(fruit == null){
				continue;
			}

			if(!fruit.isFresh()){
				System.out.println(fruit.taste(fruit));
			}
		}
	}

	static void markFruitToNotFresh(){
		System.out.print("Enter fruit index: ");
		int choice;
		choice = scanner.nextInt();

		if(!(choice >= 0 && choice < fruits.length && fruits[choice] != null)){
			System.out.println("You enter wrong fruit index. ");
			return;
		}

		fruits[choice].setFresh( false );

	}

	static void markAllSourFruitStale(){
		for(Fruit fruit : fruits){
			if(fruit == null) {
				continue;
			}
			if(fruit.taste(fruit).contains("Sour") ){

				fruit.setFresh(false);
				
			}
		}

	}

	public static int menuList() {
		printChoices();
		int choice;
		System.out.print("Enter choice: ");
		choice = scanner.nextInt();

		switch (choice) {
			case 1 -> {
				fruits[currentIndex] = new Mango();
				fruits[currentIndex].accept(scanner);
				currentIndex++;
			}
			case 2 -> {
				fruits[currentIndex] = new Orange();
				fruits[currentIndex].accept(scanner);
				currentIndex++;
			}
			case 3 -> {
				fruits[currentIndex] = new Apple();
				fruits[currentIndex].accept(scanner);
				currentIndex++;
			}
			case 4 -> displayNamesOfAllFruits();
			case 5 -> displayAllFreshFruits();
			case 6 -> displayAllNotFreshFruitTastes();
			case 7 -> markFruitToNotFresh();
			case 8 -> markAllSourFruitStale();
			default -> {}
		}

		return choice;
	}

	public static void main(String[] args) {
		System.out.print("Enter size: ");
		size = scanner.nextInt();

		fruits = new Fruit[size];

		while(menuList() != 0){}	
	}

}

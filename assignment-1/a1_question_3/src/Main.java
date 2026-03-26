import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    static void printActions() {
        System.out.println("1. Add food");
        System.out.println("2. Generate bill");
        System.out.println("0. Exit.");
    }

    static int menuList(ArrayList<Food> list, Scanner scanner) {
        printActions();
        int choice;
        System.out.print("Enter choice: ");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                Food newFood = new Food();
                newFood.accept(scanner);
                list.add(newFood);
                break;
            case 2:
                Food.calculateBill(list);
                break;
            case 0:
                System.out.println("Exited!");
        }

        return choice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList<Food>();
        while (menuList(list, scanner) != 0) {}
    }

}
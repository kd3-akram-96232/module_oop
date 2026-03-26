import java.util.ArrayList;
import java.util.Scanner;

class Food {
    private String name;
    private int quantity;
    static double price = 20;

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void accept(Scanner scanner) {
        System.out.print("Enter name: ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();
    }

    static void calculateBill(ArrayList<Food> list) {
        int numOfProducts = 0;
        double totalBill = 0;
        System.out.println("----------------------------------------------");
        System.out.println("Products:- ");
        for (Food elm : list) {
            totalBill = totalBill + (Food.price * elm.quantity);
            numOfProducts++;

            System.out.println("name: " + elm.name + ", quantity: " + elm.quantity);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Total products: " + numOfProducts + ", Total bill: " + totalBill);
        System.out.println("----------------------------------------------");
    }

}

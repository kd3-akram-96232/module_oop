import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: First input is not a double value!");
            return;
        }
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Second input is not a double value!");
            return;
        }
        double num2 = sc.nextDouble();

        double avg = (num1 + num2) / 2;
        System.out.println("Average = " + avg);
    }
}
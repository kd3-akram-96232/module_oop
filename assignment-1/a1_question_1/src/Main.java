import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java Test");
        System.out.print("Enter integer: ");
        int value = scanner.nextInt();

        System.out.println("toBinaryString(): " + Integer.toBinaryString(value));
        System.out.println("toHexString(): " + Integer.toHexString(value));
        System.out.println("toOctalString(): " + Integer.toOctalString(value));

    }
}
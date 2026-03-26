import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Invoice test = new Invoice();
        test.accept(scanner);
        test.display();
        test.showBill();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String isbn;
    double price;
    String author;
    int qty;

    Book(String isbn, double price, String author, int qty) {
        this.isbn = isbn;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }

    void show() {
        System.out.println(isbn + " " + price + " " + author + " " + qty);
    }
}

public class Library {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        int ch;

        do {
            System.out.println("\n1 Add");
            System.out.println("2 Display");
            System.out.println("3 Reverse display");
            System.out.println("4 Delete by index");
            System.out.println("5 Sort by price desc");
            System.out.println("0 Exit");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter isbn price author qty: ");
                    String isbn = sc.next();
                    double price = sc.nextDouble();
                    String author = sc.next();
                    int qty = sc.nextInt();

                    list.add(new Book(isbn, price, author, qty));
                    break;

                case 2:
                    for (Book b : list) {
                        b.show();
                    }
                    break;

                case 3:
                    for (int i = list.size() - 1; i >= 0; i--) {
                        list.get(i).show();
                    }
                    break;

                case 4:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();

                    if (idx >= 0 && idx < list.size()) {
                        list.remove(idx);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case 5:
                    list.sort((a, b) -> Double.compare(b.price, a.price));
                    System.out.println("Sorted");
                    break;
            }

        } while (ch != 0);
    }
}
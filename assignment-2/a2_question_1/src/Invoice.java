import java.util.Scanner;

public class Invoice {
    private String partNumber;
    private String partDescription;
    double price = 0.0;
    private int quantity = 0;

    public  Invoice(){}
    public Invoice(String partNumber, String partDescription, double price){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.price = price;
    }
    public Invoice(String partNumber, String partDescription, double price, int quantity){
        this(partNumber, partDescription, price);
        this.quantity = quantity;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void accept(Scanner scanner){
        System.out.println("**** Enter Invoice Details ****");

        System.out.print("Enter part number: ");
        partNumber = scanner.next();

        System.out.print("Enter part description: ");
        scanner.nextLine();
        partDescription = scanner.nextLine();

        System.out.print("Enter price: ");
        price = scanner.nextDouble();
        if(price < 0){
            price = 0;
        }
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();
        if(quantity < 0 ){
            quantity = 0;
        }

        System.out.println("------------");
    }

    public void display(){
        System.out.println("***** Display Invoice details: *****");
        System.out.println("partNumber: " + partNumber);
        System.out.println("partDescription: " + partDescription);
        System.out.println("price: " + price);
        System.out.println("quantity: " + quantity);
        System.out.println("-------------");
    }

    public void showBill(){
        System.out.println("***** Show bill *****");
        System.out.println("price: " + price + " | " + quantity + " | " + "total: " + price * quantity);
        System.out.println("--------------");
    }

}
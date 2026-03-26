import java.util.Scanner;

class TestDate {
    Date date = new Date();

    public void accept(Scanner scanner){
        System.out.print("Enter day: ");
        date.setDay(scanner.nextInt());
        System.out.print("Enter month: ");
        date.setMonth(scanner.nextInt());
        System.out.print("Enter year: ");
        date.setYear(scanner.nextInt());
    }

    public Date getDate(){
        return date;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestDate tDate = new TestDate();

        tDate.accept(scanner);
        tDate.getDate().displayDate();
    }
}
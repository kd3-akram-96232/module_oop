import java.time.temporal.Temporal;
import java.util.Scanner;

class TestEmployee {
    Employee emp = new Employee();

    public void acccept(Scanner scanner){
        System.out.print("Enter first_name: ");
        String first_name = scanner.next();
        emp.setFirst_name(first_name);
        System.out.print("Enter last_name: ");
        String last_name = scanner.next();
        emp.setLast_name(last_name);
        System.out.print("Enter monthly_salary: ");
        double temp = scanner.nextDouble();
        if(temp > 0){
            emp.setMonthly_salary(temp);
        }
    }

    public void display(){
        System.out.println("first_name: " + emp.getFirst_name());
        System.out.println("last_name: " + emp.getLast_name());
        System.out.println("monthly_salary: " + emp.getMonthly_salary());
    }

    public Employee getEmployee(){

        return emp;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TestEmployee t1 = new TestEmployee();

        t1.acccept(scanner);
        t1.display();

        double oldSalary = t1.getEmployee().getMonthly_salary();

        System.out.println("old salary: " + t1.getEmployee().getMonthly_salary() * 12);

        t1.getEmployee().setMonthly_salary(oldSalary * 1.10);

        System.out.println("new salary with 10%: " + t1.getEmployee().getMonthly_salary() * 12);


    }
}
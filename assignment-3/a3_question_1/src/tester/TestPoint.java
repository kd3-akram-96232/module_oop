package tester;

import geometry.Point2D;
import java.util.Scanner;

public class TestPoint {    
	
	static Point2D p1;
	static Point2D p2;
	public static Scanner scanner = new Scanner(System.in);
	
	public static void accept(Point2D p) {
        System.out.println("Create new point object: ");
		System.out.print("Enter x: ");
		p.setX(scanner.nextDouble());
		System.out.print("Enter y: ");
		p.setY(scanner.nextDouble());
	}
	
	public static void main(String[] args) {
		p1 = new Point2D();
		p2 = new Point2D();
		
		// take inputs
		TestPoint.accept(p1);
		TestPoint.accept(p2);
		
		// show details
        String p1Details = p1.getDetails();
        String p2Details = p2.getDetails();

        System.out.println(p1Details);
        System.out.println(p2Details);
        
        if(p1.isEqual(p2)){
            System.out.println("EQUAL");
        }else{
            System.out.println("NOT EQUAL");
        }
        
      
		
	}
}
package a9_question_1;

import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student {
	int rollNumber;
	String name;
	double marks;
	public Student() {
		
	}
	public Student(int rollNumber, String name, double marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void accept(Scanner scanner) {
		System.out.println("Enter roll: ");
		rollNumber = scanner.nextInt();
		System.out.println("Enter name: ");
		name = scanner.next();		
		System.out.println("Enter marks: ");
		marks = scanner.nextDouble();
	}
	
	public void display() {
		System.out.println("Enter roll number: " + rollNumber);
		System.out.println("Enter name: " + name);
		System.out.println("Enter marks: " + marks);
	}
	
}

public class Program {
	static Scanner scanner = new Scanner(System.in);
	static List<Student> list;
	
	static Student[] getStudents() {
		return new Student[] {
			new Student(1001, "Vijay", 250),
			new Student(1004, "Nilesh", 200),
			new Student(1002, "Akram", 300),
			new Student(1003, "Servesh", 400),
			new Student(1005, "Rahul", 50)
		};
	}
	
	static void menuActions(int choice) {
		switch(choice) {
			case 1 : {
				Student newStudent = new Student();
				newStudent.accept(scanner);
				list.add(newStudent);
				break;
			}
			case 2: {
				Iterator<Student> it = list.iterator();
				
				while(it.hasNext()) {
					it.next().display();
				}
				
				break;
			}
			case 3: {
				int roll;
				System.out.println("Enter roll number: ");
				roll = scanner.nextInt();
				for(Student s : list) {
					if(s.getRollNumber() == roll) {
						s.display();
						return;
					}
				}
				break;
			}
			case 4:{
				list.sort((x, y) -> x.getRollNumber() - y.getRollNumber());
				break;
			}
			case 5:{
				list.sort((x, y) -> x.getName().compareTo(y.getName()));
				break;
			}
			case 6:{
				list.sort((x, y) -> (int)(x.getMarks() - y.getMarks()));
				break;
			}
		}
	}
	
	static int menuList() {
		System.out.println("1. add the student in the collection");
		System.out.println("2. Display all the students using iterator");
		System.out.println("3. search the student on rollno and if found display his details.");
		System.out.println("4. sort the students on rollno");
		System.out.println("5. sort the students on name");
		System.out.println("6. sort the students on marks");
		
		int choice;
		System.out.print("Enter choice: ");
		choice = scanner.nextInt();
		
		menuActions(choice);
		
		return choice;
		
	}
	
	public static void main(String[] args) {
		
		list = new ArrayList<Student>();
		
		while(menuList() != 0) {}
		
	}

}

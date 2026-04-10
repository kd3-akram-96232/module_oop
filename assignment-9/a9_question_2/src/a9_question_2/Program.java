package a9_question_2;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Program {
	static Scanner scanner = new Scanner(System.in);
	static Set<Project> projects;
	static List<Project> list;

	static int menuList() {
		System.out.println("**********");
		System.out.println("1. Add Dummy Data of Projects in the Set");
		System.out.println("2. Input a Project from user and add in Set");
		System.out.println("3. Display all Projects in Set");
		System.out.println("4. Delete a Project by Id from Set");
		System.out.println("5. Copy All Projects from Set to ArrayList");
		System.out.println("6. Display all Projects from List");
		System.out.println("7. Sort all Projects in List by cost");
		System.out.println("8. Find project with Max team size using Collections.max()");
		System.out.println("**********");
		System.out.println();
		System.out.println("Enter choice: ");
		return scanner.nextInt();
	}
	
	static void menuActions() {
		int choice = menuList();
		switch(choice) {
		case 1: addDummyData(); break;
		case 2: addProjectFromUserAndAddInSet(); break;
		case 3: displayAllProjectsInSet(); break;
		case 4: deleteAProjectByIdFromSet(); break;
		case 5: copyAllProjectsFromSetToArrayList(); break;
		case 6: displayAllProjectsFromList(); break;
		case 7: sortAllProjectsInListByCost(); break;
		case 8: findProjectWithMaxTeamSize(); break;
		}
	}

	
	public static void main(String[] args) {
		projects = new HashSet<>();
		list = new ArrayList<>();
		addDummyData();
		
		while(menuList() != 0) {
			
		}
	}
	
	
//	case 1: add dummy data
	static void addDummyData() {
		projects.add(new Project(1, "Train Reservation System", 5, 5000000, "Java"));
		projects.add(new Project(2, "Airline Reservation System",3, 6000000, ".NET"));
		projects.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
		projects.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
		projects.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
		projects.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS"));
	}
	
//	case 2: add user in set
	static void addProjectFromUserAndAddInSet(){
		Project newProject = new Project();
		newProject.accept(scanner);
		projects.add(newProject);
	}
	
//	case 3: display all projects in set
	static void displayAllProjectsInSet() {
		projects.stream()
		.forEach(Project::display);
	}
	
//	case 4: delete a project by id from set
	static void deleteAProjectByIdFromSet() {
		int enteredId = scanner.nextInt();
		
		Project key = new Project();
		
		boolean done = projects.remove(key);
		if(done) {
			System.out.println("successfully deleted");
		}
		
	}
	
//	case 5: copy all projects from set to array list
	static void copyAllProjectsFromSetToArrayList() { 
		projects.forEach(list::add); 
	};
	
//	case 6: display all projects from list
	static void displayAllProjectsFromList() {
		list.stream()
		.forEach(Project::display);
	}
	
//	case 7: Sort all project in list by cost
	static void sortAllProjectsInListByCost() {
		list.stream()
		.sorted((x, y) -> -Double.compare(x.getProjectCost(), y.getProjectCost()))
		.forEach(Project::display);
	}
	
//	case 8: find project with max team size using Collections.max()
	static void findProjectWithMaxTeamSize() {
		Project max = list.stream()
		.max((x, y) -> Double.compare(x.getTeamSize(), y.getTeamSize()))
		.get();
		
		System.out.println("max team size: " + max);
	}	

}

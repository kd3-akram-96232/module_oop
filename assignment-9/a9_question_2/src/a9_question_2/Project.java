package a9_question_2;

import java.util.Objects;
import java.util.Scanner;

public class Project {

	int id;
	String title;
	int teamSize;
	double projectCost;
	String technology;
	
	public Project() {
		
	}
	
	public Project(int id, String title, int teamSize, double projectCost, String technology) {
		this.id = id;
		this.title = title;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Project) {
			Project p = (Project) obj;
			if(p.id == this.id) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public void accept(Scanner scanner) {
		System.out.print("Enter id: ");
		id  = scanner.nextInt();
		System.out.print("Enter title: ");
		scanner.next();
		title = scanner.nextLine();
		System.out.print("Enter team size: ");
		teamSize =  scanner.nextInt();
		System.out.print("Enter project cost: ");
		projectCost = scanner.nextDouble();
		System.out.print("Enter technology: ");
		technology = scanner.next();
	}
	
	public void display() {
		System.out.println("Enter id: " + id);
		System.out.print("Enter title: " + title);
		System.out.print("Enter team size: " + teamSize);
		System.out.print("Enter project cost: " + projectCost);
		System.out.print("Enter technology: " + technology);
	}
	
	
	
}

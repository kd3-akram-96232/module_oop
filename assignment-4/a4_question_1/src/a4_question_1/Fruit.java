package a4_question_1;

import java.util.Scanner;


public class Fruit {
    private String name;
    private String color;
    private int weight;
    private boolean isFresh;

    public Fruit(){}
    public Fruit(String name, String color, int weight, boolean isFresh){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = isFresh;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public void accept(Scanner scanner) {
        System.out.println("--------------");
        System.out.print("Enter name: ");
        name = scanner.next();
        System.out.print("Enter color: ");
        color = scanner.next();
        System.out.print("Enter weight: ");
        weight = scanner.nextInt();
        System.out.print("Enter isFresh (y/n): ");
        char inpIsFresh = scanner.next().charAt(0);
        System.out.println("--------------");
        
        if( inpIsFresh == 'y'){
            isFresh = true;
        }else{
            isFresh = false;
        }
	}

    public void display(){
        System.out.println("-----------------");
        System.out.println("fruit name: " + name);
        System.out.println("fruit name: " + color);
        System.out.println("fruit name: " + weight);
        System.out.println("fruit name: " + isFresh);
        System.out.println("-----------------");
    }
	
	public String taste(Fruit fruit){
        if(fruit instanceof Apple){
           return "Sweet and sour";
        }
        if(fruit instanceof Mango){
            return "Sweet";
        }
        if(fruit instanceof Orange){
            return "Sour";
        }

        return "Fruit is wrong!";
    }
	
    @Override
    public String toString() {
        // throw new UnsupportedOperationException("Not supported yet.");

        return ( "Name: " + this.getName() + ", color: " + this.getColor() + ", weight: " + this.getWeight() + ", isFresh: " + this.isFresh() );
    }

}

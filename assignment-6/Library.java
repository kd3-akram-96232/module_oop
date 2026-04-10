/*
					Store book details in a library in a list -- ArrayList.
					Book details: isbn(string), price(double), authorName(string), quantity(int)
					Write a menu driven program to
					1. Add new book in list
					2. Display all books in forward order
					3. Display all books in reverse order
					4. Delete a book at given index.
					5. Sort all books by price in desc order -- list.sort()
 
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

class Book{
	
	private String isbn;
	private double price;
	private  String authorName ;
	private int quantity;
	
	
	public Book() {
		isbn = "";
		price = 0.0;
		authorName = "";
		quantity = 0;
	}
	
	public void acceptRecord(Scanner sc) {
		System.out.println("Enter isbn number : ");
		isbn = sc.next();
		System.out.println("Enter price : ");
		price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter authorName : ");
		authorName = sc.nextLine();
		System.out.println("Enter quantity : ");
		quantity = sc.nextInt();
		
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Book(String isbn, double price, String authorName, int quantity) {
		
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
}

//class SortBookByPriceInDescOrder implements Comparator<Book>{
//
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}


public class Library{
	
	public static Scanner sc = new Scanner(System.in);
	
	
	static ArrayList<Book> book = new ArrayList<>();
	
	public static int menuList()
	{
		int choice;
		System.out.println("*******************************************************");
		System.out.println("0. EXIT");
		System.out.println("1. Add a new book in a list");
		System.out.println("2. Display all Books in Forward order");
		System.out.println("3. Display all Books in Reverse order");
		System.out.println("4. Delete a book at a given index");
		System.out.println("5. Sort all books in desc order by price ");
		System.out.println("*******************************************************");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		
		return choice;
		
	}
	
	public static void addBook() {
		
		System.out.println("Enter the number of books you want to add : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the Book details..");
			Book b = new Book();
			b.acceptRecord(sc);
			book.add(b);
		}
	
	}
	
	
	public static void DisplayBooksInForwardOrder() {
	
		ListIterator<Book> trav = book.listIterator();
		
		while(trav.hasNext()) {
			
			Book b = trav.next();
			System.out.println(b);
		}
		
	}
	
	
	public static void DisplayBooksInReverseOrder() {
		
		ListIterator<Book> trav = book.listIterator(book.size());
		
		while(trav.hasPrevious()) {
			
			Book b = trav.previous();
			System.out.println(b);
		}
		
	}
	
	public static void DeleteABookAtAGivenIndex() {
		
		System.out.println("Enter the index :");
		int idx = sc.nextInt();
		
		if(idx >= 0 && idx < book.size()) {
			Book b = book.remove(idx);
			System.out.println("Removed book : "+ b);
		}
		else {
			System.out.println("Invalid Index....");
		}
		
	}
	
	public static void SortAllBookByPriceInDescOrder() {
		
		book.sort((x,y)-> -Double.compare(x.getPrice(), y.getPrice()) );
		
		ListIterator<Book> trav = book.listIterator(); 
		
		while(trav.hasNext()) {
			Book b = trav.next();
			System.out.println(b);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		int choice;
		
		while((choice = menuList()) != 0) {
			
			switch(choice) {	
			
				case 1:	addBook();
					
						break;
						
				case 2:	DisplayBooksInForwardOrder();
						
						break;
						
				case 3: DisplayBooksInReverseOrder();
						
						break;
						
				case 4:	DeleteABookAtAGivenIndex();
					
						break;
						
				case 5: SortAllBookByPriceInDescOrder();
					
						break;
			
			}
			
			
		}
		
	}
		
}
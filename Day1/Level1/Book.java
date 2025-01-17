import java.util.*;
//creating a class Book 
class Book{
	 //defining attributes such as  title, author, and price. 
	String title;
	String author;
	int price;
	
	
	//creating constructor of the class Book

	Book(String title, String author, int price){
		this.title=title;
		this.author=author;
		this.price = price;
		
	}
	//creating a method displayDetails to display all the information of book
	public void displayDetails(){
		System.out.println("The title of the book is " +title);
		System.out.println("The author of the book is " +author);
		System.out.println("The price of the book is " +price);
	}
	

	public static void main(String [] args){
		//creating an object of the class Circle and displaying the results.

		Book book = new Book("Summer Story", "Samar shah", 200);
		book.displayDetails();
		
	}
}
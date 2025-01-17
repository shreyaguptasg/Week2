import java.util.*;
//creating a class Item 
class Item{
	 //defining attributes such as   itemCode, itemName, and price. 
	 int itemCode;
	 String itemName;
	 int price;
	
	
	//creating constructor of the class Item

	Item(int itemCode, String itemName, int price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price = price;
		
	}
	//creating a method to calculate the total cost of the item
	public double totalCost(int price, int numberofItems){
		return price*numberofItems;
	}
	//creating a method displayDetails to display all the information of book
	public void displayDetails(double cost){
		System.out.println("The title of the item is " +itemCode);
		System.out.println("The author of the item is " +itemName);
		System.out.println("The price of the item is " +price);
		System.out.println("The total cost of the item is " +cost);
		
	}
	

	public static void main(String [] args){
		//creating an object of the class Circle and displaying the results.

		Item item = new Item(1, "Samar shah", 200);
		double d =item.totalCost(200 , 4);
		item.displayDetails(d);
		
	}
}
import java.util.*;
//creating a class MobilePhone 
class MobilePhone{
	 //defining attributes such as  brand, model, and price.
	String brand;
	String  model;
	int price;
	
	
	//creating constructor of the class MobilePhone

	MobilePhone(String brand, String model, int price){
		this.brand=brand;
		this.model=model;
		this.price = price;
		
	}
	
	//creating a method displayDetails to display all the information of mobile phone
	public void displayDetails(){
		System.out.println("The model of the mobile phone is " +model);
		System.out.println("The brand of the mobile phone is " +brand);
		System.out.println("The price of the mobile phone is " +price);
		
		
	}
	

	public static void main(String [] args){
		//creating an object of the class MobilePhone and displaying the results.

		MobilePhone phone = new MobilePhone("Realme", "Narzo20", 200000);
		phone.displayDetails();
		
	}
}
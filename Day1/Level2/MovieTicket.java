import java.util.*;
//creating a class  MovieTicket
class  MovieTicket{
	 //defining attributes such as movieName, seatNumber, and price.
	String movieName;
    int	seatNumber;
	int price ;
	final int[] allocatedseats = new int[100];
	
	//creating constructor of the class  MovieTicket

	 MovieTicket(String movieName, int seatNumber, int price){
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	//create a method to book ticket and assign the seat number and update the price
	public  boolean bookTicket(){
		for(int i=0; i<100; i++){
			if(allocatedseats[i] == seatNumber){
				return false;
			}      
			else{
				allocatedseats[i] = seatNumber;
				return true;
			}
		}
		return false;
	}
	
	//create a method to display the results
	public void display(boolean ticket){
		System.out.println("The name of the movie is " +movieName);
		System.out.println("The seat number for the movie is " +seatNumber);
		System.out.println("The price of the movie is " +price);
		
	}
	
	
	public static void main(String [] args){
		//creating an object of the class  MovieTicket and displaying the results.
		Scanner sc = new Scanner(System.in);
		String movieName = sc.nextLine();
		int seatNumber = sc.nextInt();
		int price = sc.nextInt();
		
		MovieTicket ticket1 = new  MovieTicket(movieName, seatNumber, price);
		boolean bookedticket = ticket1.bookTicket();
		ticket1.display(bookedticket);
		
		
	}
}
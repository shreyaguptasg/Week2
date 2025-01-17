import java.util.*;
//creating a class Circle 
class Circle{
	 //defining attributes such as radius

	int radius;
	
	
	//creating constructor of the class Circle

	Circle(int radius){
		this.radius = radius;
		
	}
	//calculating the area of the circle
	public double area(){
		return 2*3.14*radius*radius;
	}
	//calculating the circumference of the circle
	public double circumference(){
		return 2*3.14*radius;
	}
	

	public static void main(String [] args){
		//creating an object of the class Circle and displaying the results.

		Circle circle= new Circle(3);
		System.out.println(circle.circumference());
		System.out.println(String.format("%.2f" , circle.area()));
		
	}
}
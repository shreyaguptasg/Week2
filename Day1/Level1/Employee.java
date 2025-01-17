import java.util.*;
//creating a class employee 
class Employee{
	 //defining attributes such as name, salary and id of the employee

	String name;
	int id;
	int salary;
	
	//creating constructor of the class employee

	Employee(String name, int id, int salary){
		this.name = name;
		this.id =id;
		this.salary = salary;
	}
	//displaying values assigned to the objects to the attributes of the class

	public void display(){
		System.out.println("Name of the employee is " +name);
		System.out.println("ID of the employee is " +id);
		System.out.println("Salary of the employee is " +salary);
	}
	public static void main(String [] args){
		//creating an object of the class Employee and displaying the results.

		Employee employee1 = new Employee("Alice" , 1, 1000);
		employee1.display();
		
	}
}
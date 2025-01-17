import java.util.*;
//creating a class Student 
class Student{
	 //defining attributes such as name, rollNumber, and marks
	String name;
    int	rollNumber;
	int [] marks;
	
	//creating constructor of the class Student

	Student(String name, int rollNumber, int[] marks){
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks =marks;
		
	}
	
	//creating the method to calculate the grade based on the percentage
	public String gradesCalculator(){
		double results =0.0;
		for( int i=0; i<marks.length; i++){
			results += marks[i];
		}
		results = results/3;
		if(results>=90){
			return "A";
		}
		else if(results<90 && results>=80){
			return "B";
		}
		else if(results<80 && results>=70){
			return "C";
		}
		else if(results<70 && results>=60){
			return "D";
		}
		else{
			return "E";
		}
	}
	
	//creating a method displayDetails to display all the information of student and its grade
	public void displayDetails(String grade){
		System.out.println("The name of the student is " +name);
		System.out.println("The roll number of the student is " +rollNumber);
		for(int mark : marks){
			System.out.println("marks is : " + mark );
		}
		System.out.println("The grade of the student is " +grade);
		
		
		
		
	}
	

	public static void main(String [] args){
		//creating an object of the class Student and displaying the results.
        int [] marks = {97, 98, 99};
		Student student1 = new Student("Shreya" , 17, marks);
		String grade = student1.gradesCalculator();
		student1.displayDetails(grade);
		
	}
}
package AssistedProblems;
//Define a base class Employee with attributes like name, id, and salary,
// and a method displayDetails().
class Employee{
     protected String name;
     protected String id;
     protected  int salary;
     Employee(String name, String id, int salary){
         this.name = name;
         this.id = id;
         this.salary = salary;
     }
     public void displayDetails(){
         System.out.println("Name :" +this.name);
         System.out.println("ID :" +this.id);
         System.out.println("Salary :" +this.salary);
     }
}
//Define a subclass Manager with its attribute teamSize
class Manager extends Employee{
    int teamSize;
    Manager(String name, String id, int salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails(){
        System.out.println("- Manager");
        super.displayDetails();
        System.out.println("TeamSize : " +this.teamSize);
    }


}
//Define a subclass Developer with its attribute programmingLanguage
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name, String id, int salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails(){
        System.out.println("- Developer");
        super.displayDetails();
        System.out.println("Programming language : " +this.programmingLanguage);
    }
}
//Define a subclass Intern
class Intern extends Employee{
    Intern(String name, String id, int salary){
        super(name,id, salary);
    }
    @Override
    public  void displayDetails(){

        System.out.println("- Intern");
        super.displayDetails();
    }
}
public class EmployeemManagement {
    public static void main(String[] args) {
        //creating objects of class and subclass
        Employee employee = new Employee("Alex", "0111IT23", 1900);
        Manager manager = new Manager("James" , "0123MA23", 90000, 7);
        Developer developer = new Developer("Jinny", "011DE45", 8000, "java");
        Intern intern = new Intern("Bonny", "0111IT456", 3000);
        //calling out methods of respective classes
        employee.displayDetails();
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }

}

package AssisstedProblems;

import java.util.ArrayList;
//Define a AssisstedProblems.Company class that contains multiple AssisstedProblems.Department objects.
//Define an AssisstedProblems.Employee class within each AssisstedProblems.Department.
//Show the composition relationship by ensuring that when a AssisstedProblems.Company object is deleted, all associated AssisstedProblems.Department and AssisstedProblems.Employee objects are also removed.
class Company{
    static String companyName = "ABC";
    ArrayList<Department> departments;
    Company(){
         this.departments= new ArrayList<>();
    }
    public void addDepartment(Department d){
        if(departments.contains(d)){
            System.out.println("AssisstedProblems.Employee already in the department");
        }
        else{
            departments.add(d);
            System.out.println("AssisstedProblems.Department is  " + d.getName_department());
        }
    }
}
class Department{
    private String name_department;
    ArrayList<Employee> employee;
    Department(String name_department){
        this.name_department = name_department;
        this.employee = new ArrayList<>();
    }
    public String getName_department(){
            return this.name_department;
    }
    public void addEmployee(Employee e ) {
        if (employee.contains(e)) {
            System.out.println(" employee already in the department");
        } else {
            employee.add(e);
            System.out.println("AssisstedProblems.Employee having " + e.getName() + " added in the department " + this.name_department);
        }
    }
}
class Employee{
    private String name;
    Employee(String name){
        this.name = name;
    }
     public String getName(){
        return this.name;
    }
}
public class CompanyAndDepartments {
    public static void main(String[] args) {
        Employee emp1 = new Employee("ram");
        Department d1 = new Department("HR");
        d1.addEmployee(emp1);
        Employee emp2 = new Employee("shyam");
        Department d2 = new Department("Marketing");
        d2.addEmployee(emp2);


    }
}

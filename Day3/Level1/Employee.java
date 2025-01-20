public class Employee{
    //A static variable companyName shared by all employees.
    static String companyName = "Capgemini";
    String name;
    //Use a final variable id for the employee ID, which cannot be modified after assignment.
    final int id;
    String designation;
    static int employeeCount;
    Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
    //A static method displayTotalEmployees() to show the total number of employees.
    static void displayTotalEmployee(){
        employeeCount++;
        System.out.println("Count of Employee :" +employeeCount);
    }
    public static void main(String[] args) {
    Employee employee1 = new Employee("ankush" , 12, "Manager");
    Employee.displayTotalEmployee();
        //Check if a given object is an instance of the Employee class before printing the employee details.

        if(employee1 instanceof  Employee){
        System.out.println("employee1 is an instance of Employee");
    }
    else{
        System.out.println("employee1 is not an instance of Employee");
    }
    }
}
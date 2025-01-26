package EmployeeManagementSystem;

public class EmployeeManagementSystem {

    public static void main(String[] args) {


        Employee partTimeEmp = new PartTimeEmployee("7343843", "alex", 400000);
        Employee fullTimeEmp = new FullTimeEmployee("673463", "james", 90000);
        System.out.println("Part time salary of employee is " + partTimeEmp.calculateSalary());
        System.out.println("Full time salary of employee is " + fullTimeEmp.calculateSalary());

        PartTimeEmployee x= (PartTimeEmployee) partTimeEmp;
        x.getDepartmentDetails();
        FullTimeEmployee y = (FullTimeEmployee) fullTimeEmp;
        y.getDepartmentDetails();
    }

}

package EmployeeManagementSystem;
//Use an abstract class Employee with fields like employeeId, name, and baseSalary.
    abstract class  Employee{
        private String employeeId;
        private String name;
        private double baseSalary;

        Employee(String employeeId, String name, double baseSalary){
            this.employeeId = employeeId;
            this.name=name;
            this.baseSalary = baseSalary;
        }

        public String getEmployeeId(){
            return employeeId;
        }
        public String getName(){
            return name;
        }
        public double getBaseSalary(){
            return baseSalary;
        }
        public void setBaseSalary(){
            this.baseSalary = baseSalary;
        }
        //Provide an abstract method calculateSalary()
        abstract public double calculateSalary();
        //creating a concrete method displayDetails().
        public void displayDetails(){
            System.out.println("Name :" +this.name);
            System.out.println("EmployeeId :" +this.employeeId);
            System.out.println("Base Salary :" +this.baseSalary);
        }

    }

